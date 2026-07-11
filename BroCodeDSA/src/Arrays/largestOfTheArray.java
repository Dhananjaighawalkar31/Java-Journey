package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class largestOfTheArray {
	public static void main(String[] args) {
		int arr[] = takeInput();
		System.out.println(Arrays.toString(arr));
		int largest = largest(arr);
		System.out.println(largest);
		
	}

	

	private static int largest(int[] arr) {
		int k = 0;
		int n = arr.length;
		for(int i = 0;i<n;i++) {
			if(k<arr[i]) {
				k = arr[i];
			}
		}
		return k;
	}



	private static int[] takeInput() {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] arr = new int[n];
		for(int i = 0;i<n;i++) {
			System.out.println("Enter the elemnt at " + i + "th position");
			arr[i] = s.nextInt();
		}
		
		return arr;
	}
}
