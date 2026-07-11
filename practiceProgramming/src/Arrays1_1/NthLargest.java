/*4.	Find N th largest element from array.*/
package Arrays1_1;

import java.util.Arrays;
import java.util.Scanner;

public class NthLargest {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("enter size of 1st array");
		int n = s.nextInt();
		int arr[] = new int[n];
		for(int i = 0;i<n;i++) {
			arr[i] = s.nextInt();
		}
		int k = s.nextInt();
		nthLargest(arr,k);

	}

	private static void nthLargest(int[] arr, int k) {
		Arrays.sort(arr);
		System.out.println(arr[arr.length - k]);
		
	}

}
