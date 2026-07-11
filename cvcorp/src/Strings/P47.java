/*47.	Write a program to print the all words in decreasing order(word size) of a Given String? */

package Strings;

public class P47 {
	public static void main(String[] args) {
		String[] a = {"hi","hello","wassup","dhanu"};
		dec(a);
	}

	private static void dec(String[] a) {
		int n = a.length;
		
		for(int i = 0;i<n;i++) {
			for(int j = i+1;j<n;j++) {
				if(a[i].length()<a[j].length()) {
					String temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		for(String s : a) {
			System.out.println(s);
		}
		
		
		
	}
}
