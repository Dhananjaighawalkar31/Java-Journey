package LeetCode;

public class BinarySubarraysWithSum {

    public int numSubarraysWithSum(int[] nums, int goal) {
        return func(nums, goal) - func(nums, goal - 1);
    }

    public int func(int[] arr, int goal) {

        if (goal < 0) {
            return 0;
        }

        int l = 0, r = 0;
        int count = 0;
        int sum = 0;

        while (r < arr.length) {

            sum += arr[r];

            while (sum > goal) {
                sum -= arr[l];
                l++;
            }

            count += r - l + 1;
            r++;
        }

        return count;
    }

    public static void main(String[] args) {

        BinarySubarraysWithSum solution = new BinarySubarraysWithSum();

        int[] nums1 = {1, 0, 1, 0, 1};
        int goal1 = 2;

        System.out.println("Output: " +
                solution.numSubarraysWithSum(nums1, goal1));

        int[] nums2 = {0, 0, 0, 0, 0};
        int goal2 = 0;

        System.out.println("Output: " +
                solution.numSubarraysWithSum(nums2, goal2));
    }
}