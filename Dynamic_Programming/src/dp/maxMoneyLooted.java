package dp;

public class maxMoneyLooted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] houses = {5, 2, 6, 3, 1, 7};
		int maxMoney = maxMoneyLooted(houses);
		System.out.println("Maximum money that can be looted: " + maxMoney);

	}
	public static int maxMoneyLooted(int[] houses) {
		int n = houses.length;

		if(n==0) {
			return 0;
		}
		if(n==1) {
			return houses[0];
		}
		int[] maxMoneyCanBeLooted = new int[n];

		maxMoneyCanBeLooted[0] = houses[0];
		maxMoneyCanBeLooted[1] = Math.max(houses[0],houses[1]);

		for(int currHouses = 2;currHouses < n;currHouses++) {
			maxMoneyCanBeLooted[currHouses] = Math.max(maxMoneyCanBeLooted[currHouses - 1], (houses[currHouses] + maxMoneyCanBeLooted[currHouses - 2]));
		}
		return maxMoneyCanBeLooted[n - 1];
	}
}
