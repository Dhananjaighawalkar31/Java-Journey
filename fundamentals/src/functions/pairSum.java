package functions;

public class pairSum {
	public static int pair(int[] arr , int x) {
		int numPairs = 0;
		for(int i = 0; i < arr.length ; i++) {
			for(int j = i + 1; j < arr.length ; j++) {
				if(arr[i] + arr[j] == x) {
					System.out.println("Pair: (" + arr[i] + ", " + arr[j] + ")");

					numPairs++;
				}
			}
		}
		return numPairs;
	}

	public static void main(String[] args) {
		int[] arr = {1, 3, 5, 6, 2};
		int x = 7;
		int result = pair(arr , x );
		System.out.println(result);
		

	}

}
