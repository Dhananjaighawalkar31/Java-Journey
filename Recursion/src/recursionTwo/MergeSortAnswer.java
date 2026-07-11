package recursionTwo;

public class MergeSortAnswer {
	public static void mergeSort(int arr[], int start, int end) {
		int mid = (start + end)/2;
		if(start >= end) {
			return;
		}
		mergeSort(arr,start,mid);
		mergeSort(arr,mid + 1,end);
		merge(arr, start, end);
	}
	public static void merge(int arr[], int start, int end) {
		int mid = (start + end)/2;
		int ans[] = new int[end - start + 1];
		int i = start;
		int j = mid + 1;
		int k = 0;
		while(i <= mid && j <= end) {
			if(arr[i] < arr[j]) {
				ans[k] = arr[i];
				i++;
				k++;
			}else {
				ans[k] = arr[j];
				k++;
				j++;
			}
		}
		while(i <= mid) {
			ans[k] = arr[i];
			i++;
			k++;
		}
		while(j <= end) {
			ans[k] = arr[j];
			j++;
			k++;
		}
		for(int index = 0; index< ans.length; index++) {
			arr[start + index] = ans[index];
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {9, 2, 8, 4, 5, 5, 1 , 7};
		int start = 0;
		int end = arr.length - 1;
		mergeSort(arr , start, end);
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + " ");
		}

	}

}
