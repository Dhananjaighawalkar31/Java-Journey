package dp2;

public class isSubsetPresent {

	public static void main(String[] args) {
		int[] arr = {3, 34, 4, 12, 5, 2};
		int sum = 9;
		boolean result = isSubsetPresent(arr, arr.length, sum);
		System.out.println("Is subset present with sum " + sum + ": " + result);

	}
	public static boolean isSubsetPresent(int[] arr,int n , int sum) {
		boolean[][] dp = new boolean[n+1][sum +1];

		for(int i = 0;i<=n;i++) {
			dp[i][0] = true;
		}
		for(int i = 1;i<=sum;i++) {
			dp[0][i] = false;
		}
		for(int i = 1;i<= n;i++) {
			for(int j = 1;j<=sum;j++) {
				if(j<arr[i-1]) {
					dp[i][j] = dp[i-1][j];
				}else {
					dp[i][j] = dp[i-1][j] || dp[i-1][j-arr[i-1]];
				}
			}
		}
		boolean result = dp[n][sum];
		return result;
	}

}
