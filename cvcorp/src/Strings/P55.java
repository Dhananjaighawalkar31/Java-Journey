/*55.	Write a Program to print to the given String as three characters in each line?*/


package Strings;

public class P55 {

	public static void main(String[] args) {
		String s = "qwertyuiopasdfghjklzxcvbnm";
		print(s);

	}

	private static void print(String s) {
		int n = s.length();
		for(int i = 0;i<n;i+=3) {
			int e = Math.min(i+3, n);
			System.out.println(s.substring(i, e));
		}
		
	}
	

}
