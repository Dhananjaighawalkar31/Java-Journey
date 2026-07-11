package dp;

public class coinGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 10; // number of coins
		int x = 3;  // number of coins that can be removed
		int y = 4;  // number of coins that can be removed
		String winner = findWinner(n, x, y);
		System.out.println("The winner of the game is: " + winner);

	}
	public static String findWinner(int n, int x,int y) {

		if(x > y) {
			int temp = x;
			x = y;
			y = temp;
		}

		boolean[] dp = new boolean[n + 1];

		for(int i = 1;i<=n;i++) {
			if(i == 1 || i == x || i == y) {
				dp[i] = true;
			}

			else if(i < x) {
				dp[i] = !dp[i - 1];
			}

			else if(i<y) {
				dp[i] = !dp[i - x] && dp[i - 1];
			}

			else {
				dp[i] = !(dp[i - x] && dp[i - y] && dp[i-1]);
			}
		}
		boolean result = dp[n];
		if(result) {
			return "beerus";
		}else {
			return "Whis";
		}
	}
}
