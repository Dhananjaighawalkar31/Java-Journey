package Arrays;

import java.util.Scanner;

public class LargestOfN {
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
	
//	public static int linearSearch() {
//		Scanner s = new Scanner(System.in);
//		int x = s.nextInt();
//		int n = s.nextInt();;
//		int[] arr = new int[n];
//		int[] arr1 = new int[x];
//		for (int i = 0; i<n;i++) {
//			if(arr[i] == x) {
//				return i;
//			}
//		}return -1;
//		
//	}
	
	public static int largest(int arr[]) {
		int max = Integer.MIN_VALUE;
		for(int i = 0; i<arr.length; i++ ) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] arr = takeInput();
        int lar = largest(arr);
//        int result = linearSearch();
        System.out.println(largest(arr));
	}

}
