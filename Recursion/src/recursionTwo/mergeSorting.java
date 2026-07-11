package recursionTwo;

public class mergeSorting {
	public static void merge(int arr[] , int start, int end) {

		if(start >= end) {
			return ;
		}
		int mid = (start + end) / 2;
		merge(arr ,start, mid);
		merge(arr ,mid + 1, end);
		mer(arr, start, mid, end);
		
		
	}
	public static void mer(int arr[], int start, int mid, int end) {
		int i = start;
		int j = mid + 1;
		int[] copy = new int[end - start + 1];
		int k = 0;
		
		while(i <= mid && j <= end) {
			if(arr[i] < arr[j]) {
				copy[k] = arr[i]; 
				i++;
			}else {
				copy[k] = arr[j];
				j++;
				
			}
			k++;
		}
		while(i <= mid) {
			copy[k] = arr[i]; 
			i++;
			k++;
		}
		while(j <= end) {
			copy[k] = arr[j];
			j++;
			k++;
		}
		for(k = 0;k < copy.length;k++) {
			arr[start + k] = copy[k];
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {9, 2, 8, 4, 5, 5, 1 , 7};
		int start = 0;
		int end = arr.length - 1;
		merge(arr , start, end);
		for (int i : arr) {
            System.out.print(i + " ");
        }

	}

}
