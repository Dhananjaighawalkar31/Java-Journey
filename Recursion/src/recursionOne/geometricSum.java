package recursionOne;

public class geometricSum {
	public static double gsum(int k) {
		if( k == 0) {
			return 1;
		}
		return (double)(gsum(k - 1) + 1 / Math.pow(2, k));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k = 5;
		double ans = gsum(k);
		System.out.println(ans);

	}

}
