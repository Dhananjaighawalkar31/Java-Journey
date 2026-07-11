package patterns;

import java.util.Scanner;

public class patternNew {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int i = 1;
		int value = 1;
		while(i <= n) {
			int j = 1;
			value = i;
			while(j <= i) {
				System.out.print(value);
				j++;
				value--;
			}
			System.out.println();
			i++;

		}
	}

}
