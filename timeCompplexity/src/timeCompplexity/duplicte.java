package timeCompplexity;

public class duplicte {
	public static int duplic(int[] arr) {
		int n = arr.length;
		int sumofNminus  = 0;
		for(int i = 0; i< n - 1; i++) {
			 sumofNminus += i;
		}
		int sum = 0;
		for(int i = 0; i< n; i++) {
		    sum += arr[i];
		}
		
		return (sum - sumofNminus);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 0, 1, 2, 3, 3};
		int result = duplic(arr);
		System.out.println(result);

	}

}

