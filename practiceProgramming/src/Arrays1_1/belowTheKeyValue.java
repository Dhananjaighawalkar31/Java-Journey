/*Find the no of numbers below the key value in a Given array? explain this problem*/
package Arrays1_1;

import java.util.Scanner;

public class belowTheKeyValue {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("enter size of 1st array");
		int n = s.nextInt();
		int arr[] = new int[n];
		for(int i = 0;i<n;i++) {
			arr[i] = s.nextInt();
		}
		int key = s.nextInt();
		belowKey(arr,key,n);

	}

	private static void belowKey(int[] arr, int key, int n) {
		int c = 0;
		for(int i = 0;i<n;i++) {
			if(arr[i]<key) {
				System.out.println(arr[i]);
				c++;
			}
		}
		System.out.println(c);
		
	}

}
