package Arrays;

import java.util.Arrays;

public class pairSum {

	public static void main(String[] args) {
		int[] arr = {1, 3, 5, 6, 2};
		int x = 7;
		int result = pair(arr , x );
		System.out.println("Number of pairs " + result);
		

	}

	private static int pair(int[] arr, int x) {
		Arrays.sort(arr);
		int a = 0,b=arr.length-1,count = 0;
		while(a<b) {
			int sum = arr[a] + arr[b];
			if(sum==x) {
				System.out.println("Pair is " + arr[a] + " " + arr[b]);
				a++;
				b--;
				count++;
			}else if(sum<x) {
				a++;
			}else if(sum>x) {
				b--;
			}
		}
		return count;
	}

}
