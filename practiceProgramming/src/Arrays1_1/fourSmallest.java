/*8.	Find the 1st four smallest numbers missing from the Given array? 
Ex:- 7 { 4 , 10 , 7 , 19 , 22 , 29 , 11 }   	output:- 5 6 8 9
*/

package Arrays1_1;

import java.util.Arrays;
import java.util.Scanner;

public class fourSmallest {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("enter size of 1st array");
		int n = s.nextInt();
		int arr[] = new int[n];
		for(int i = 0;i<n;i++) {
			arr[i] = s.nextInt();
		}
		smallestFour(arr,n);

	}

	private static void smallestFour(int[] arr, int n) {
		Arrays.sort(arr);
        int count = 0;
        int num = arr[0] + 1;
        int i = 0;
        while (count < 4) {
            if (i >= n || num < arr[i]) {
                System.out.println(num);
                count++;
                num++;
            } else if (num == arr[i]) {
                num++;
                i++;
            } else {
                i++;
            }
        }

		
	}

}
