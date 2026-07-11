package fundamentals;

import java.util.Scanner;

public class DecToBin {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		long bin = 0;
		long pv = 1;
        
		while(n > 0) {
			int rem = n % 2;
			bin += rem * pv;
			pv *= 10;
			n = n / 2 ;
			
			
		}System.out.println(bin);
		

	}

}
