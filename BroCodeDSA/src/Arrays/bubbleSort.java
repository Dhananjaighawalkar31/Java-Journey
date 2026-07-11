package Arrays;

public class bubbleSort {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input = {2, 6, 9, 1, 5};
		bubble(input);
		for(int i = 0; i < input.length; i++) {
			System.out.print(input[i] + " ");
		}

	}

	private static void bubble(int[] arr) {
		for(int i = 0;i<arr.length - 1;i++) {
			for(int j = 0;j<arr.length - 1 - i;j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		
	}
}
