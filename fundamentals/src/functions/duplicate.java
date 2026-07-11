package functions;

public class duplicate {
	public static int duplic(int[] arr) {
		for(int i = 0; i < arr.length - 1;i++) {
			for(int j = 0; j < arr.length;j++) {
				if(i != j && arr[i] == arr[j] ) {
					return arr[i];
				}
			}
		} return Integer.MAX_VALUE; 
	}

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,1};
		int result = duplic(arr);
		System.out.println(result);

	}

}
