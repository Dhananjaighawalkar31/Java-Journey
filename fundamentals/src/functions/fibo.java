//package functions;
//
//public class fibo {
//	public static boolean checkFib(int n) {
//		int n = 5;
//		int a = 0;
//		int b = 1;
//		int c;
//		while(a < n) {
//			c = a + b;
//			a = b;
//			b = c;
//		}
//		if ( a == n) {
//			return true;
//		}else {
//			return false;
//		}
//	}
//	public static void main(String[] args) {
//		
//
//	}
//
//}
//

package functions;

public class fibo {
    public static boolean checkFib(int n) {
        int a = 0;
        int b = 1;
        int c;
        if (n == a || n == b) {
            return true;
        }
        while (b < n) {
            c = a + b;
            a = b;
            b = c;
        }
        return a == n;
    }

    public static void main(String[] args) {
        int num = 5;
        boolean result = checkFib(num);
        System.out.println(num + " is a Fibonacci number: " + result);
    }
}

