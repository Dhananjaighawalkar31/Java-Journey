package fundamentals;

import java.util.Scanner;

public class SquareRoot {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int N = s.nextInt();
		int o = 0;
		while(o * o <= N) {
			o = o + 1 ;

		}
		o = o - 1 ;
		System.out.println(o);
	}
}
