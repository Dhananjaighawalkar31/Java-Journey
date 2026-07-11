/*12.	Find all possible sets of the sum of any two elements in an array is equal to the given key value(Sum Value)?	
Ex: Input: 6 , {4,6,18,10,14,2} ,20	 output: {6,14},{18,2}.
*/

package Arrays1_1;

import java.util.Arrays;
import java.util.Scanner;

public class sumOfTwoElements {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("enter size of array");
		int n = s.nextInt();
		int arr[] = new int[n];
		for(int i = 0;i<n;i++) {
			arr[i] = s.nextInt();
		}
		
		int k = s.nextInt();
		sum(arr,k);
	}

	private static void sum(int[] arr, int k) {
		Arrays.sort(arr);
		int left = 0;
		int right = arr.length-1;
		while(left<right) {
			int sum = arr[left] + arr[right];
			if(sum==k) {
				System.out.println(arr[left] + " " + arr[right]);
				left++;
				right--;
			}else if(sum<k) {
				left++;
			}else if(sum>k) {
				right--;
			}
		}
		
	}

//	private static void sum(int[] arr, int k) {
//		int n = arr.length;
//		int sum[] = new int[2];
//		for(int i = 0;i<n;i++) {
//			for(int j = i+1;j<n;j++) {
//				if(arr[i] + arr[j] == k) {
//					System.out.print(arr[i] + " " + arr[j]);
//				}
//			}
//		}
//		
//		
//	}

}
