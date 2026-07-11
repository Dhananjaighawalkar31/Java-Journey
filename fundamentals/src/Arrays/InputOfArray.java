package Arrays;

import java.util.Scanner;

public class InputOfArray {
	public static void printArray(int[] arr) {
		int n = arr.length;
		for(int i = 0;i<n;i++){
			System.out.println(arr[i]);
		}
		
	}

		public static int[] takeInput() {
			Scanner s = new Scanner(System.in);
			int n = s.nextInt();
			int[] arr = new int[n];

			for(int i = 0;i<n;i++) {
				System.out.println("enter element at " + i + "th index");
				arr[i] = s.nextInt();
			}
			return arr;
		}

		public static void main(String[] args) {
			int arr[] = takeInput();
			printArray(arr);

		}
	

}
