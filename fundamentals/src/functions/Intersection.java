package functions;

public class Intersection {

	public static void inter(int[] arr1, int[] arr2) {
		for(int i = 0; i < arr1.length; i++) {
			for(int j = 0; j < arr2.length; j++) {
				if( arr1[i] == arr2[j]) {
					System.out.println(arr1[i]);
					arr2[j] = Integer.MAX_VALUE;
					break;
				}
				
			}
		}
	}

	public static void main(String[] args) {
		int[] arr1 = {1,2,3,4};
		int[] arr2 = {1,2,5,6};
		inter(arr1 ,arr2);
//		System.out.println(result);
		// TODO Auto-generated method stub

	}

}
