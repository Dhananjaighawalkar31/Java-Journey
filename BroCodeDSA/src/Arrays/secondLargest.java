package Arrays;

public class secondLargest {
	private static int secondLargestElement(int[] arr) {
			if(arr.length == 0) {
				return Integer.MIN_VALUE;
			}
			int larg = arr[0];
			int sec = Integer.MIN_VALUE;
			for(int i = 0;i<arr.length;i++) {
				if(larg<arr[i]) {
					sec = larg;
					larg = arr[i];
				}else if(sec<arr[i] && larg != arr[i]) {
					sec = arr[i];
				}
			}
			return sec;
		}
	public static void main(String[] args) {
		int[] arr = {2, 0, 0, 5, 9, 0, 1, 6};
		int result= secondLargestElement(arr);
//		for(int i = 0; i < arr.length; i++) {
//		System.out.println(arr[i]);
//		}
		System.out.println(result);
	}

	

}
