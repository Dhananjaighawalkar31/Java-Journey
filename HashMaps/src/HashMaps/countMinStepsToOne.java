package HashMaps;

public class countMinStepsToOne {

	public static int countMinStepsToOne(int n, int[] dp ){
		if(n == 1) {
			return 0;
		}
		
		int subtractOne = Integer.MAX_VALUE;
		if(dp[n-1] == -1) {
			subtractOne = countMinStepsToOne(n - 1,dp);
			dp[n-1] = subtractOne;
		}else {
			subtractOne = dp[n-1];
		}
		
		
		int divideTwo = Integer.MAX_VALUE;
		if(n % 2 == 0) {
			if(dp[n/2] == -1) {
				divideTwo = countMinStepsToOne(n/2,dp);
				dp[n/2] = divideTwo;
			}else {
				divideTwo = dp[n/2];
			}
		}
		
		int divideThree = Integer.MAX_VALUE;
		if(n%3 == 0) {
			if(dp[n/3] == -1) {
				divideThree = countMinStepsToOne(n/3,dp);
				dp[n/3] = divideThree;
			}else {
				divideThree = dp[n/3];
			}
		}

		return 1 + Math.min(subtractOne, Math.min(divideTwo, divideThree));
	}

	public static void main(String[] args) {
		int n = 10;
		int[] dp = new int[n+1];
		for(int i = 0;i<dp.length;i++) {
			dp[i] = -1;
		}
		int ans = countMinStepsToOne(n,dp);
		System.out.println(ans);

	}

}
