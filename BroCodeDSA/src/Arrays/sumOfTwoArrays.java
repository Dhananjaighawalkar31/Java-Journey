package Arrays;

public class sumOfTwoArrays {
	private static void sumTwo(int[] arr1, int[] arr2, int[] output) {
		int i = arr1.length-1;
		int j = arr2.length-1;
		int carry = 0;
		int k = Math.max(arr1.length, arr2.length);
		
		while(i>=0 && j>=0) {
			int sum = arr1[i] + arr2[j] + carry;
			output[k] = sum%10;
			carry = sum/10;
			i--;
			j--;
			k--;
		}
		while(i>=0) {
			int sum = arr1[i] + carry;
			output[k] = sum%10;
			carry = sum/10;
			i--;
			k--;
		}
		while(j>=0) {
			int sum = arr2[j] + carry;
			output[k] = sum % 10;
			carry = sum/10;
			j--;
			k--;
		}
		output[0] = carry;
		if(output[0] == 0) {
			for(int x = 1;x<output.length;x++) {
				System.out.print(output[x] + " ");
			}
		}else {
			for(int x = 0;x<output.length;x++) {
				System.out.print(output[x] + " ");
			}
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = {2, 0, 0, 1, 1, 0, 1, 2};
		int[] arr2 = {2, 0, 0, 1, 5, 0, 1, 6};
		int[] output = new int[Math.max(arr1.length, arr2.length) + 1];

//		int[] arr1 = {9, 9, 9};
//        int[] arr2 = {1};
        System.out.println("Sum of two arrays:");
        sumTwo(arr1, arr2, output);

	}

	
}
