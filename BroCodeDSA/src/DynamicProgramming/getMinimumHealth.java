package DynamicProgramming;

public class getMinimumHealth {

	public static void main(String[] args) {
		int[][] grid = {
				{-2, -3, 3},
				{-5, -10, 1},
				{10, 30, -5}
		};
		int minHealth = getMinimumHealth(grid);
		System.out.println("Minimum health required: " + minHealth);
	}

	private static int getMinimumHealth(int[][] grid) {
		int n = grid.length;
		int m = grid[0].length;
		int[][] dp = new int[n+1][m+1];
		
		for(int i = 0;i<=n;i++) {
			for(int j = 0;j<=m;j++) {
				dp[i][j] = Integer.MAX_VALUE;
			}
		}
		dp[n][m-1] = 1;
		dp[n-1][m] = 1;
		
		for(int i = n-1;i>=0;--i) {
			for(int j = m-1;j>=0;--j) {
				int neededHealth = Integer.min(dp[i+1][j],dp[i][j+1]) - grid[i][j];
				dp[i][j] = (neededHealth <= 0)? 1: neededHealth;
			}
		}
		int ans = dp[0][0];
		return ans;
	}

	
}
