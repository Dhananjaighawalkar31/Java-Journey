package exceptionHandlingOOPStwo;

public class ExceptionDemo {
    public static int fact(int n) throws NegativeNumberException {
        if(n < 0) {
        	throw new NegativeNumberException();
        }
        int ans = 1;
        for(int i = 2; i <= n; i++ ){
        	ans = ans * i;
        	
        }return ans;
    }

    public static int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return a / b;
    }

    public static void main(String[] args) {
        try {
            divide(10, 5);
            System.out.println(fact(4));
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch (NegativeNumberException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("negative number exception");
		}finally {
			System.out.println("Finally");
		}
    }
}


