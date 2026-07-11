package Sorting;


public class RotatingAnArray {
    public static void rotateArray(int[] arr, int d) {
        int n = arr.length;
        d = d % n; // handle cases where d > n
        reverse(arr, 0, n - 1); // reverse the entire array
        reverse(arr, 0, n - d - 1); // reverse the first n-d elements
        reverse(arr, n - d, n - 1); // reverse the last d elements
    }

    public static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
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


