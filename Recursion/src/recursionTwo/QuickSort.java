package recursionTwo;

public class QuickSort {
	
	public static int partition(int arr[], int start, int end) {
		int pivot = arr[start];
		int count = 0;
		for(int i = start + 1; i <= end; i++) {
			if(arr[i] <= pivot) {
				count++;
			}
		}
		int pivotIndex = start + count;
		arr[start] = arr[pivotIndex];
		arr[pivotIndex] = pivot;
		
		int i = start, j = end;
		while(i < j) {
			while(i <= end && arr[i] <= pivot) {
				i++;
			}
			while(arr[j] > pivot) {
				j--;
			}
			if(i <= j) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				i++;
				j--;
			}
			
		}
		return pivotIndex;
	}
	public static void quicksort(int arr[], int start, int end) {
		if(start >= end) { 
			return ;}
			int c = partition(arr, start, end);
			quicksort(arr, start, c - 1);
			quicksort(arr, c + 1,end);
		
	}
	public static void quicksort(int arr[]) {
		quicksort(arr,0,arr.length - 1);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {7, 8, 4, 3, 5, 1 , 2};
		quicksort(arr);
		for(int i = 0; i < arr.length ; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
