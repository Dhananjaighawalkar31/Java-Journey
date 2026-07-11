package Sorting;

public class bubbleSort {
	public static void bubble(int[] input) {

		for(int i = 0; i < input.length - 1; i++) {
			
			for(int j = 0; j < input.length - i - 1; j++) {
				if(input[j] > input[j + 1]) {
					int temp = input[j];
					input[j] = input[j + 1];
					input[j + 1] = temp;
				}
			}

		}
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input = {2, 6, 9, 1, 5};
		bubble(input);
		for(int i = 0; i < input.length; i++) {
			System.out.println(input[i] + " ");
		}

	}

}
