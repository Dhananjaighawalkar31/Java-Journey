package LeetCode;

public class MinimumSizeSubarraySum {

    public static int minSubArrayLen(int target, int[] nums) {

        int n = nums.length;
        int r = 0, l = 0;
        int min = Integer.MAX_VALUE;
        int sum = 0;

        while (r < n) {

            sum += nums[r];

            while (sum >= target) {

                min = Math.min(min, r - l + 1);

                sum -= nums[l];
                l++;
            }

            r++;
        }

        return min == Integer.MAX_VALUE ? 0 : min;
    }

    public static void main(String[] args) {

        int target = 7;
        int[] nums = {2, 3, 1, 2, 4, 3};

        System.out.println(minSubArrayLen(target, nums));
    }
}