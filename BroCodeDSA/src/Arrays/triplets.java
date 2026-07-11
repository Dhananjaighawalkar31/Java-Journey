package Arrays;

import java.util.Arrays;

public class triplets {

	public static void main(String[] args) {
		int[] arr = {2,6,1,3,5};
		int x = 8;
		int result = Triplets(arr,x);
		System.out.println(result);

	}

	private static int Triplets(int[] arr, int x) {
		Arrays.sort(arr);
		int num = 0;
		for(int i = 0;i<arr.length-1;i++) {
			int a = i+1,b=arr.length-1;
			while(a<b) {
				int sum = arr[i] + arr[a]+arr[b];
				if(sum == x) {
					System.out.println("the triplets are " + arr[i] + " " + arr[a] + " " + arr[b]);
					num++;
					a++;
					b--;
				}else if(sum<x) {
					a++;
				}else {
					b--;
				}
			}
		}
		return num;
	}



}
