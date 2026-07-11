package recursionOne;

public class powerOfX {

	public static double power(double x , int n) {
		if(n == 0) {
			return 1;
		}
		return x * power(x, n - 1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
		double x = 2;
		double result = power(x , n); 
		System.out.println(result);
	}

}



