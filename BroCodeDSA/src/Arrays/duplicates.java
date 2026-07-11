package Arrays;

import java.util.Arrays;

public class duplicates {

	public static void main(String[] args) {
		int arr[] = {1,6,2,4,2};
		int dupl = duplicate(arr);
		System.out.println(dupl);

	}

	private static int duplicate(int[] arr) {
		Arrays.sort(arr);
		for(int i = 0;i<arr.length;i++) {
			if(arr[i] == arr[i+1]) {
				return arr[i];
			}
		}
		return Integer.MAX_VALUE;
	}

}
