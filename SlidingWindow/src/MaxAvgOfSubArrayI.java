public class MaxAvgOfSubArrayI {
    public double findMaxAverage(int[] nums, int k) {

        int n = nums.length;
        int sum = 0;

        // Calculate the sum of the first window
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }

        int maxSum = sum;

        // Slide the window
        for (int r = k; r < n; r++) {

            sum = sum - nums[r - k] + nums[r];

            maxSum = Math.max(maxSum, sum);
        }

        // Convert to double to preserve decimal precision
        return (double) maxSum / k;
    }
}
