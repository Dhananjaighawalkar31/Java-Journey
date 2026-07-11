package Arrays;

public class RotatingArray {
	private static void rotateArray(int[] arr, int d) {
		int n = arr.length;
		d = d%n;
		swap(arr,0,n-1);
		swap(arr,0,n-d-1);
		swap(arr,n-d,n-1);
		
	}
	private static void swap(int[] arr, int i, int j) {
		while(i<j) {
			arr[i] = arr[i] + arr[j] - (arr[j] = arr[i]);
			i++;
			j--;
		}
		
	}
	public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

	public static void main(String[] args) {
		int[] arr = {2, 5, 7, 4, 6};
        int d = 2;
        System.out.println("Original Array:");
        printArray(arr);
        rotateArray(arr, d);
        System.out.println("\nRotated Array:");
        printArray(arr);

	}

	

}
