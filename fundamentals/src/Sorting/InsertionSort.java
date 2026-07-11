package Sorting;

public class InsertionSort {
	public static void Insertion(int input[] ) {
		int n = input.length;
		for(int i = 1;i < n;i++ ) {
			int j = i-1;
			int temp = input[i];
			while (j>=0 && input[j] > temp) {
				input[j + 1] = input[j];
				j--;
			}
			input[j+1] = temp;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input = {2, 6, 9, 1, 5};
		Insertion(input);
		for(int i = 0; i < input.length; i++) {
			System.out.println(input[i] + " ");
		}

	}

}
