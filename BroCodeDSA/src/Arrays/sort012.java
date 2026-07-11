package Arrays;

import java.util.Arrays;

public class sort012 {
	private static void sort(int[] arr) {
		int c = 0;
		int z = 0;
		int t = arr.length - 1;
		while(c<=t) {
			if(arr[c] == 0) {
				int temp = arr[c];
				arr[c] = arr[z];
				arr[z] = temp;
				c++;
				z++;
			}else if(arr[c] == 2) {
				int tem = arr[c];
				arr[c]=arr[t];
				arr[t] = tem;
				t--;
			}else {
				c++;
			}
		}
		System.err.println(Arrays.toString(arr));
		
	}

	public static void main(String[] args) {
		int[] arr = {2, 0, 0, 1, 1, 0, 1, 2};
		System.out.println("Original array");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        sort(arr);

	}

	

}
