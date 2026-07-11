package PriorityQueues;

public class inplaceHeapSort {

	public static void main(String[] args) {
		
		int[] arr = {5, 2, 8, 3, 1, 6, 4};
//	    inplaceHeapSort(arr);
		heapSort(arr);
	    for (int num : arr) {
	        System.out.print(num + " ");
	    }

	}
	public static void heapSort(int[] arr) {
		int n = arr.length;
		for(int i = (n/2)-1;i>=0;i--) {
			downHeapify(arr,i,n);
		}
		
		for(int i = n-1;i>= 0;i--) {
			int temp = arr[i];
			arr[i] = arr[0];
			arr[0] = temp;
			downHeapify(arr,0,i);
		}
	}
	private static void downHeapify(int[] arr, int i, int n) {
		int parentIndex = i;
		int leftChildIndex = 2*parentIndex + 1;
		int rightChildIndex = 2*parentIndex + 2;
		
		while(leftChildIndex < n) {
			int minIndex = parentIndex;
			if(arr[leftChildIndex] < arr[minIndex]) {
				minIndex = leftChildIndex;
			}
			
			if(rightChildIndex < n && arr[rightChildIndex] < arr[minIndex]) {
				minIndex = rightChildIndex;
			}
			if(minIndex == parentIndex) {
				return;
			}
			
			int temp = arr[parentIndex];
			arr[parentIndex] = arr[minIndex];
			arr[minIndex] = temp;
			parentIndex = minIndex;
			leftChildIndex = 2*parentIndex + 1;
			rightChildIndex = 2*parentIndex + 2;
		}
		
	}
	public static void inplaceHeapSort(int arr[]) {
		for(int i = 1;i<arr.length;i++) {
			int childIndex = i;
			int parentIndex = (childIndex - 1)/2;
			
			while(childIndex > 0) {
				if(arr[childIndex] > arr[parentIndex]) {
					break;
				}
				int temp = arr[childIndex];
				arr[childIndex] = arr[parentIndex];
				arr[parentIndex] = temp;
				childIndex = parentIndex;
				parentIndex = (childIndex - 1)/2;
			}
		}
		
		for(int i = arr.length-1;i>=0;i--) {
			int min = arr[0];
			arr[0] = arr[i];
			arr[i] = min;
			
			int parentIndex = 0;
			int leftChildIndex = 2*parentIndex + 1;
			int rightChildIndex = leftChildIndex + 1;
			while(parentIndex < i) {
				int minIndex = parentIndex;
				int minValue = arr[minIndex];
				
				if(leftChildIndex < i) {
					int leftChild = arr[leftChildIndex];
					if(leftChild < minValue) {
						minIndex = leftChildIndex;
						minValue = arr[minIndex];
					}
				}
				if(rightChildIndex < i) {
					int rightChild = arr[rightChildIndex];
					if(rightChild < minValue) {
						minIndex = rightChildIndex;
						minValue = arr[minIndex];
					}
				}
				if(parentIndex == minIndex) {
					break;
				}else {
					arr[minIndex] = arr[parentIndex];
					arr[parentIndex] = minValue;
				}
				parentIndex = minIndex;
				leftChildIndex = 2*parentIndex + 1;
				rightChildIndex = leftChildIndex + 1;
			}
		}
	}
}
