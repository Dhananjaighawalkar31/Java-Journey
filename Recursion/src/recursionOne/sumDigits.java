package recursionOne;

public class sumDigits {
	public static int sum(int n) {
		if(n < 10) {
			return n;
		}
		int sumOfDigits = (n % 10) + sum(n/10);
		return sumOfDigits;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 12345;
        int sumOfDigits = sum(n);
        System.out.println("Sum of digits of " + n + ": " + sumOfDigits);


	}

}
