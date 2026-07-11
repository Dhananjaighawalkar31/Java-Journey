package fundamentals;

import java.util.Scanner;

public class CondNrela {
// conditional and relational
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a, b ;
		a = s.nextInt();
		b = s.nextInt();
		if(a > 0 && b > 0){
			System.out.println("Both are positive");
		}else {
			System.out.println("Both are not positive");
		}

	}

}
