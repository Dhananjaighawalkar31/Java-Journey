package recursionOne;

public class NumCheck {
	public static boolean checkNumber(int[] input, int x, int startIndex) {
		if(startIndex == input.length) {
			return false;
		}
		if(input[startIndex] == x) {
			return true;
		}
		return checkNumber(input , x, startIndex + 1);
	}
	public static boolean checkNumber_1(int input[], int x) {
		return checkNumber(input, x, 0);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input = {1, 2, 3, 4, 5};
		int x = 3;
		boolean result = checkNumber_1(input, x);
		System.out.println(result);
	}

}
