package timeCompplexity;

public class uniqueElements {
	public static int findUniq(int[] arr) {
		int n = arr.length;
		int XOR = 0;
		for(int i = 0; i< n; i++) {
			XOR ^= arr[i];
		}
		return XOR;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2, 3, 5, 6, 5, 2, 3};
		int result = findUniq(arr);
		System.out.println(result);

	}

}
