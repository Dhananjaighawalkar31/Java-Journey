/*6.	Find the number of consonants in a given character array?*/

package Arrays1_1;

import java.util.Scanner;

public class numberOfConsanants {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("enter size of 1st array");
		int n = s.nextInt();
		char arr[] = new char[n];
		for(int i = 0;i<n;i++) {
			arr[i] = s.next().charAt(0);
		}
		numOfConosants(arr,n);
	}

	private static void numOfConosants(char[] arr, int n) {
		int c = 0;
		for(int i = 0;i<n;i++) {
			if(arr[i] == 'a' ||arr[i] == 'e' ||arr[i] == 'i' ||arr[i] == 'o' ||arr[i] == 'u') {
				c++;
			}
		}
		System.out.println(c);
		
	}

}
