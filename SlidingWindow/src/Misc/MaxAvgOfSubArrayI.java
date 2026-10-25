package Misc;

public class MaxAvgOfSubArrayI {
//    pattern 1
    public double findMaxAverage(int[] nums, int k) {

        int n = nums.length;
        int sum = 0;

        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }

        int maxSum = sum;

        for (int r = k; r < n; r++) {

            sum = sum - nums[r - k] + nums[r];

            maxSum = Math.max(maxSum, sum);
        }

        return (double) maxSum / k;
    }
}
