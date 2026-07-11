package Sorting;

public class pushZeroesToEnd {
	public static int[] pushZerosToEnd(int[] input) {

		int n = input.length;
		int j = 0;
		for(int i = 0;i < n; i++) {
			if(input[i] != 0) {
				int temp = input[i];
				input[i] = input[j];
				input[j] = temp;
				j++;

			}
		}
		return input;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input = {2, 0, 0, 6, 9, 0, 1, 5};
		pushZerosToEnd(input);
		for(int i = 0; i < input.length; i++) {
			System.out.print(input[i] + " ");
		}

	}

}
