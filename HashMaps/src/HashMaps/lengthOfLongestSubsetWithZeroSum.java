package HashMaps;

import java.util.HashMap;
import java.util.Scanner;

public class lengthOfLongestSubsetWithZeroSum {

	public static void main(String[] args) {
		//		int arr[] = {3, 4, 3, -4};
		//		int ans = lengthOfLongestSubsetWithZeroSum(arr);
		//		System.out.println(ans);
		Scanner sc = new Scanner(System.in);

		// Input array size
		System.out.print("Enter number of elements: ");
		int n = sc.nextInt();

		// Input array elements
		int[] arr = new int[n];
		System.out.print("Enter elements: ");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		// Compute and display result
		int result = lengthOfLongestSubsetWithZeroSum(arr);
		System.out.println("Length of longest subset with sum zero: " + result);

	}

	private static int lengthOfLongestSubsetWithZeroSum(int[] arr) {
		HashMap<Integer,Integer> map = new HashMap<>();
		int n = arr.length;

		for(int i = 1;i<n;i++) {
			arr[i] += arr[i - 1];
		}
		int len = 0;
		for(int i = 0;i<n;i++) {
			if(arr[i] == 0) {
				if(len < i + 1) {
					len = i + 1;
				}
			}else if(map.containsKey(arr[i])) {
				if(len < i - map.get(arr[i])) {
					len = i - map.get(arr[i]);
				}
			}
			else {
				map.put(arr[i],i);
			}
		}
		return len;
	}

}
