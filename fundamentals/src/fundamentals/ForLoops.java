package fundamentals;

import java.util.Scanner;

public class ForLoops {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int a = 0;
		int b = 1;
		for(int i = 0; i <= n; i++) {
			//fibonacci series formula is F(n) = F(n-1) +  F(n-2)
			int c = a + b;
			a = b;
			b = c;
			
			System.out.println(a);
		}

	}

}
