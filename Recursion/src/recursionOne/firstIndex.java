package recursionOne;

public class firstIndex {
	public static int solve(int arr[], int x , int start) {
		if(start >= arr.length) {
		return -1;
		}
		if(arr[start] == x) {
			return start;
		}
		return solve(arr , x , start + 1);
	}
	public static int firstIndex(int[] arr, int x ) {
		return solve(arr , x , 0);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1, 2, 3, 4};
		int x = 4;
		int ans = firstIndex(arr, x);
		System.out.println(ans);

	}

}
