package recursionOne;

public class multiplyTwoInt {
	public static int mul(int m , int n) {
		if( m == 0 || n == 0) {
			return 0;
		}
		return m + mul(m , n-1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m = 3;
		int n = 4;
		int ans = mul(m , n);
		System.out.println(ans);

	}

}
