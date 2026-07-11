package recursionthree;

public class Staircase {
	public static int staircase(int n) {
		if(n < 0) {
			return 0;
		}
		if(n == 0) {
			return 1;

		}return staircase(n - 1) + staircase(n - 2) + staircase(n - 3);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 10;
		System.out.println(staircase(n));
	}

}
