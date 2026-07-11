package recursionOne;

public class countZero {
	public static int countZeroo(int n) {
		if ( n < 10) {
			if( n == 0) {
				return 1;
			}else {
			return 0;
			}
		}
		if(n % 10 == 0) {
			return countZeroo(n/10) + 1;
		}
		else {
			return countZeroo(n/10);
		}
			
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 10020;
		int ans = countZeroo(n);
		System.out.println(ans);
	}

}
