package Arrays;

public class Unique {

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 2, 1};
        int unique = findUnique(arr);
        System.out.println("Unique element: " + unique);

	}

	private static int findUnique(int[] arr) {
		for(int i = 0;i<arr.length;i++) {
			boolean uniq = true;
			for(int j = 0;j<arr.length;j++) {
				if(i != j && arr[i] == arr[j]) {
					uniq = false;
					break;
				}
			}
			if(uniq) {
				return arr[i];
			}
		}
		return Integer.MAX_VALUE;
	}

}
