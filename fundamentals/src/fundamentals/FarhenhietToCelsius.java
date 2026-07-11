package fundamentals;
import java.util.Scanner;

public class FarhenhietToCelsius {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		//		start = st, end = en, d = step(difference), f = farhenhiet, c = celius 
		int st = s.nextInt();
		int en = s.nextInt();
		int d = s.nextInt();
		int f = st;

		while(f <= en) {
			int c = (int)((5.0/9)*(f - 32));
			System.out.println(f + "\t" + c);
			f = f + d;
		}


	}

}
