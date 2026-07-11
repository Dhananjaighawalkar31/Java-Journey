package timeCompplexity;

public class equilibrium {
	public static int arrayEquilibriumIndex(int[] arr) {
		int rightSum = 0, leftSum = 0;
		
		for(int i = 0;i <arr.length;i++) {
			rightSum += arr[i];
		}
		for(int i = 0;i <arr.length;i++) {
				rightSum -= arr[i];	
			
				if(leftSum == rightSum) {
					return i;
				}
				leftSum += arr[i];
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2, 3, 5, 6, 7, 2, 1};
		int result = arrayEquilibriumIndex(arr);
		System.out.println(result);

	}

}
