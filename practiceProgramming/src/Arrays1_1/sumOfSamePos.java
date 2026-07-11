/*13.	Find the sum of the same position values in a given two arrays?*/

package Arrays1_1;

import java.util.Scanner;

public class sumOfSamePos {
	
	private static void sum(int[] arr1, int[] arr2) {
		int i = 0;
		int max = Math.max(arr1.length, arr2.length);
		while(i<max) {
			if(i<arr1.length && i<arr2.length) {
				System.out.println(arr1[i] + arr2[i]);
				i++;
			}else if(i<arr1.length) {
				System.out.println(arr1[i]);
				i++;
			}
			else if(i<arr2.length) {
				System.out.println(arr2[i]);
				i++;
			}
			
		}
		
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("enter size of 1st array");
		int n1 = s.nextInt();
		int arr1[] = new int[n1];
		for(int i = 0;i<n1;i++) {
			arr1[i] = s.nextInt();
		}
		
		System.out.println("enter size of 2nd array");
		int n2 = s.nextInt();
		int arr2[] = new int[n2];
		for(int i = 0;i<n2;i++) {
			arr2[i] = s.nextInt();
		}
		
		sum(arr1,arr2);
	}

	

}
