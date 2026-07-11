package functions;

public class Sort01 {
	public static int sort(int[] arr) {
		int nextzero = 0;
		for(int i = 0;i < arr.length;i++) {
			if(arr[i] == 0) {
				int temp = arr[nextzero];
				arr[nextzero] = arr[i];
				arr[i] = temp;
				nextzero += 1;
				
			}
		}
		for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

		return nextzero;
	}

	public static void main(String[] args) {
		int arr[] = {0, 1, 0, 0, 1, 1, 0, 1};
		int result = sort(arr);
		System.out.println(result);
		// TODO Auto-generated method stub

	}

}
