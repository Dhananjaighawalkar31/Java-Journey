package Arrays;

public class Intersection {

	public static void main(String[] args) {
		int arr1[] = {1,2,6,3};
		int arr2[] = {2,3,1,7};
		intersection(arr1,arr2);

	}

	private static void intersection(int[] arr1, int[] arr2) {
		for(int i = 0;i<arr1.length;i++) {
			for(int j = 0;j<arr2.length;j++) {
				if(arr1[i] == arr2[j]) {
					System.out.print(arr1[i] + " ");
					arr2[j] = Integer.MAX_VALUE;
					break;
				}
			}
			
		}
		
	}

}
