package timeCompplexity;

public class rotateArr {
	public static void swapElements(int[] arr, int start, int end) {
		int temp = arr[start];
		arr[start] = arr[end];
		arr[end] = temp; 
	}
	
	public static void reverse(int[] arr, int start, int end) {
		while(start < end) {
			swapElements(arr, start, end);
			start += 1;
			end -= 1;
		}
	}
	
	public static void rotate(int[] arr, int d) {
		if(arr.length == 0) {
			return;
		}
		if(d >= arr.length && arr.length != 0) {
			d %= arr.length;
		}
		
		reverse(arr, 0,arr.length - 1);
		reverse(arr, 0,arr.length - d - 1);
		reverse(arr, arr.length - d,arr.length - 1);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1, 2 , 3, 4, 5, 6};
		int d = 2;
        rotate(arr, d);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }



	}

}
