package Arrays;

public class selectionSort {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input = {2, 6, 9, 1, 5};
		selectionSort(input);
		for(int i = 0; i < input.length; i++) {
			System.out.println(input[i] + " ");
		}

	}

	private static void selectionSort(int[] arr) {
		for(int i = 0;i<arr.length-1;i++) {
			int min = arr[i];
			int minIndex = i;
			for(int j = 1;j<arr.length;j++) {
				if(arr[j]<min) {
					min = arr[j];
					minIndex = j;
					
				}
			}
			if(minIndex != i) {
				int temp = arr[i];
				arr[i] = arr[minIndex];
				arr[minIndex] = temp;
			}
		}
		
	}
}
