package DynamicProgramming;

public class stairCase {

	public static void main(String[] args) {
		int n = 4;
        System.out.println(staircase(n));

	}

	private static long staircase(int n) {
		long[] ways = new long[n+1];
		if(n==0) {
			return 1;
		}
		if(n==1 || n==2) {
			return n;
		}
		ways[0] = 1;
		ways[1] = 1;
		ways[2] = 2;
		for(int i = 3;i<=n;i++) {
			ways[i] = ways[i-1] + ways[i-2] + ways[i-3];
		}
		return ways[n];
	}

}
