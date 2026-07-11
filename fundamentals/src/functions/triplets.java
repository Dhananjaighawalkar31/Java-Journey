package functions;

public class triplets {
	public static int triplets(int[] arr , int x) {
		int numtriples = 0;
		for(int i = 0; i < arr.length ; i++) {
			for(int j = i + 1; j < arr.length ; j++) {
				for(int k = j + 1; k < arr.length ; k++) {
					
				
				if(arr[i] + arr[j] + arr[k] == x) {
					System.out.println("Pair: (" + arr[i] + ", " + arr[j] + " , " + arr[k] + ")");

					numtriples++;
				}
				}
			}
		}
		return numtriples;
	}

	public static void main(String[] args) {
		int[] arr = {1, 3, 5, 6, 2};
		int x = 8;
		int result = triplets(arr , x );
		System.out.println(result);
		

	}

}
