package functions;
//
//import java.util.Scanner;
//
//public class FarToCel {
//    Scanner s = new Scanner(System.in);
//    int S = s.nextInt();
//    int E = s.nextInt();
//    int W = s.nextInt();
//	public static void func(int S, int E, int W) {
//		int current = S;
//		while(S <= E) {
//			int F = (int)((5.0 / 9) * current - 32);
//			System.out.println(current + "\t" + F);
//			current += W; 
//		}
//

import java.util.Scanner;

public class FarToCel {
    public static void farToCel(int S, int E, int W) {
        int current = S;
        while (current <= E) {
            int C = (int) ((5.0 / 9) * (current - 32));
            System.out.println(current + "\t" + C);
            current += W;
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int S = s.nextInt(); // Start value
        int E = s.nextInt(); // End value
        int W = s.nextInt(); // Step value
        farToCel(S, E, W);
        s.close();
    }
}


