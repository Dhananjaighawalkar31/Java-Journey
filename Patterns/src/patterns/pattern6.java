package patterns;

import java.util.Scanner;

public class pattern6 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int i = 1;
		while(i <= n) {
			int j = 1;
			int StartingNumber = i;
			while(j <= i) {
				System.out.print(StartingNumber);
				StartingNumber++;
				j++;
			}
			System.out.println();
			i++;

		}
		


	}

}
