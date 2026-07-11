package fundamentals;

import java.util.Scanner;

public class ReverseNUm {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		 int temp = n;
		 int rev_num = 0;
		 while(temp > 0) {
			 int LD = temp % 10 ;
			 temp = temp/10;
			 rev_num = rev_num * 10 + LD;
			 
		 }
		 System.out.println(rev_num);

	}

}
