/*5.	Find the first three biggest elements from given array by using single loop?(without using pre-define Methods)*/

package Arrays1_1;

import java.util.Scanner;

public class first3largest {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("enter size of 1st array");
		int n = s.nextInt();
		int arr[] = new int[n];
		for(int i = 0;i<n;i++) {
			arr[i] = s.nextInt();
		}
		threeLargest(arr,n);
		
	}

	private static void threeLargest(int[] arr, int n) {
		int max = Integer.MIN_VALUE;
		int sec = max;
		int third = sec;
		for(int i = 0;i<n;i++) {
			if(arr[i] > max) {
				third = sec;
				sec = max;
				max = arr[i];
			}else if(arr[i]>sec && arr[i] != max) {
				third = sec;
				sec = arr[i];
			}else if(arr[i] > third && arr[i] != max && arr[i] != sec) {
				third = arr[i];
			}
		}
		
		System.out.println(max + " " + sec + " "+ third);
	}

}
