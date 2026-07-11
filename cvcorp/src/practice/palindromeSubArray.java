//Description:
//Write a program to print the largest Sub-Array whose sum is Palindrome.
//
//
//Constraints:
//Input :             First line consists of One integer value represents Array Size.
//
//                        Second line consists of Array Elements.
//
//Output :          Print the largest Sub-Array whose sum is Palindrome.
//
//Constraints :   Given array size should be  atleast 5 or else print "Invalid Array Size".
//
//                         Resultant Sub Array Should contain atleast two elements.
//
//                        If No Sub Arrays found with sum as Palindrome, then print "No Sub Arrays Found".
//
//
//Example:
//Input 1 :        5
//
//                      10 20 30 6 19    
//
//
//Output 1 :     10 20 30 6 
//
//Input 2 :         6
//
//                       10 10 6 10 15 20
//
//Output 2 :      No Sub Arrays Found
//
//
//Explanation:
//Input 1 :             5
//
//                           10 20 30 6 19    
//
//Output 1 :          10 20 30 6 
//
//Explanation :      Among all the sub arrays only these sub arrays are having sum as palindrome.
//
//                            10+20+30+6 = 66 which is a palindrome with 4 elements.
//
//                             30+6+19=55 which is a palindrome with 3 elements.
//
//Input 2 :             6
//
//                           10 10 6 10 15 20
//
//Output 2 :          No Sub Arrays Found
//
//Explanation :     Here no Sub-Arrays with size atleast two are having the sum as Palindrome.So our Output is "No Sub Arrays Found".
//
//                           Note :  Here [ 6 ] is also a sub array which is palindrome. But it is single element. So It is Ignored.
//
//

package practice;

import java.util.Scanner;

public class palindromeSubArray {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] a = new int[n];
		for(int i = 0;i<n;i++) {
			a[i] = s.nextInt();
		}
		int max = 0;
		int start = 0;
		int end = 0;
		for(int i = 0;i<n;i++) {
			for(int j = i;j<n;j++) {
				int sum = 0;
				int h=0;
				for(int k = i;k<=j;k++) {
					sum+=a[k];
					h++;
				}
				if(h>max && sum>=10 && isPalin(sum)) {
					start = i;
					end = j;
					max = h;
				}
			}
		}
		String res = "";
		for(int i = start;i<=end;i++) {
			res = res + a[i] + " ";
		}
		System.out.println(res.trim());
	}

	private static boolean isPalin(int sum) {
		int rev = 0;
		int temp = sum;
		while(temp>0) {
			int rem = temp%10;
			rev = rev*10 + rem;
			temp = temp/10;
		}
		return rev==sum;
	}

}
