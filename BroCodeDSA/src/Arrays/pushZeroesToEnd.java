package Arrays;

public class pushZeroesToEnd {

	public static void main(String[] args) {
		int[] input = {2, 0, 0, 6, 9, 0, 1, 5};
		pushZerosToEnd(input);
		for(int i = 0; i < input.length; i++) {
			System.out.print(input[i] + " ");
		}

	}

	private static int[] pushZerosToEnd(int[] input) {
		int n = input.length;
		int j = 0;
		for(int i = 0;i<n;i++) {
			if(input[i] != 0) {
				input[i] = input[i] +input[j] - (input[j] = input[i]);
				j++;
			}
		}
		return input;
	}

}
