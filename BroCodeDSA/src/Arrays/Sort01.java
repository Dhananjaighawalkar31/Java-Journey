package Arrays;

import java.util.Arrays;

public class Sort01 {

	public static void main(String[] args) {
		int arr[] = {0,0,1,0,1,0,1,1};
		int result = sort01(arr);
		System.out.println(result);

	}

	private static int sort01(int[] arr) {
		int nz = 0;
		for(int i = 0;i<arr.length;i++) {
			if(arr[i] == 0) {
				int temp = arr[nz];
				arr[nz] = arr[i];
				arr[i] = temp;
				nz++;
			}
		}
		System.out.println(Arrays.toString(arr));
		
		return nz;
	}

}
