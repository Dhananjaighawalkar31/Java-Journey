package dp;

import java.util.HashMap;

public class byteLandian {

	public static void main(String[] args) {
		long n = 10; // example input
		HashMap<Long, Long> memo = new HashMap<>();
		System.out.println(bytelandian(n, memo));

	}
	public static long bytelandian(long n, HashMap<Long, Long> memo) {
		if(n <= 1) {
			return n;
		}
		if(memo.get(n) != null) {
			return memo.get(n);
		}
		long breakDownValue = bytelandian(n / 2, memo) + bytelandian(n / 3, memo) + bytelandian(n / 4, memo);
		memo.put(n,Math.max(n, breakDownValue));
		return memo.get(n);
	}

}
