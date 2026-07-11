package Arrays;

public class insertionSort {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input = {2, 6, 9, 1, 5};
		Insertion(input);
		for(int i = 0; i < input.length; i++) {
			System.out.print(input[i] + " ");
		}

	}

	private static void Insertion(int[] arr) {
		int n = arr.length;
		for(int i = 1;i<n;i++) {
			int j = i-1;
			int temp = arr[i];
			while(j>=0 && arr[j]>temp) {
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = temp;
		}
		
	}
}
