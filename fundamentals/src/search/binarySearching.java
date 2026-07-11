package search;

public class binarySearching {
	public static int binarySearch(int[] arr, int x) {
		int start = 0;
		int end = arr.length - 1;
		
		while(start <= end) {
			int mid = (start + end)/2;
			if(arr[mid] == x) {
				return mid;
				
			}
			else if(arr[mid] < x) {
				start = mid + 1;
				
			}
			else{
				end = mid - 1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] arr = {1, 3, 5, 6, 8, 10, 14, 17};
		int x = 6;
		int result = binarySearch(arr, x);
		System.out.println(result);
	}

}
