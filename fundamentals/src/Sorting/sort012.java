package Sorting;

public class sort012 {
	public static void sort(int[] arr) {
		int c = 0;
		int z = 0;
		int t = arr.length - 1;
		
		while(c <= t) {
			if(arr[c] == 0) {
				int temp = arr[c];
				arr[c] = arr[z];
				arr[z] = temp;
				c++;
				z++;
			}
			else if(arr[c] == 2) {
				int tem = arr[t];
				arr[t] = arr[c];
				arr[c] = tem;
				t--;
				
			}
			else {
				c++;
				
				
			}
		}
		System.out.println("Sorted array");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2, 0, 0, 1, 1, 0, 1, 2};
		System.out.println("Original array");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        sort(arr);

		
//		System.out.println("Rotated array");
//		sort(arr);

	

	}

}
