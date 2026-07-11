package fundamentals;

import java.util.Scanner;

public class BinToDec {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int num = s.nextInt();
		
		int dec = 0, pow = 1;
		while(num > 0) {
			int last = num % 10;
			dec += last * pow;
			pow *= 2;
			num = num / 10;
			
		}
		System.out.println(dec);
		

	}

}
