package LeetCode;
public class MaxConsecutiveOnesIII {

    public static int longestOnes(int[] nums, int k) {
        int left = 0;
        int zeros = 0;
        int maxLength = 0;

        for (int right = 0; right < nums.length; right++) {

            // Include the current element
            if (nums[right] == 0) {
                zeros++;
            }

            // Shrink the window if zeros exceed k
            while (zeros > k) {
                if (nums[left] == 0) {
                    zeros--;
                }
                left++;
            }

            // Update the maximum window length
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0};
        int k = 2;

        System.out.println(longestOnes(nums, k));
    }
}

