package LeetCode;

public class CountNumberOfNiceSubarrays {

    public int numberOfSubarrays(int[] nums, int k) {
        return atMost(nums, k) - atMost(nums, k - 1);
    }

    public int atMost(int[] nums, int target) {

        if (target < 0) {
            return 0;
        }

        int l = 0;
        int count = 0;
        int oddCount = 0;

        for (int r = 0; r < nums.length; r++) {

            if (nums[r] % 2 != 0) {
                oddCount++;
            }

            while (oddCount > target) {

                if (nums[l] % 2 != 0) {
                    oddCount--;
                }

                l++;
            }

            count += r - l + 1;
        }

        return count;
    }

    public static void main(String[] args) {

        CountNumberOfNiceSubarrays solution =
                new CountNumberOfNiceSubarrays();

        int[] nums1 = {1, 1, 2, 1, 1};
        System.out.println(solution.numberOfSubarrays(nums1, 3));

        int[] nums2 = {2, 4, 6};
        System.out.println(solution.numberOfSubarrays(nums2, 1));

        int[] nums3 = {2, 2, 2, 1, 2, 2, 1, 2, 2, 2};
        System.out.println(solution.numberOfSubarrays(nums3, 2));
    }
}