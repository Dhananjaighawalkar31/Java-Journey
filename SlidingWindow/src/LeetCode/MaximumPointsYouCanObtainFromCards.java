package LeetCode;

class MaximumPointsYouCanObtainFromCards {
    public int maxScore(int[] arr, int k) {
        int n = arr.length;
        int lsum = 0, rsum = 0, max = 0;

        for (int i = 0; i < k; i++) {
            lsum += arr[i];
        }

        max = lsum;
        int c = n - 1;

        while (k > 0) {
            lsum -= arr[k - 1];
            rsum += arr[c];

            k--;
            c--;

            max = Math.max(max, lsum + rsum);
        }

        return max;
    }
}