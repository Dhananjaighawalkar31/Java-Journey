package fundamentals;

import java.util.Scanner;

public class ForLoops1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
//		int a = 0;
//		int b = 1;
		for(int i = 1, j = 100; i <= n; i++, j += 20) {
			
			System.out.println(i + " " + j);
		}

	}

}
