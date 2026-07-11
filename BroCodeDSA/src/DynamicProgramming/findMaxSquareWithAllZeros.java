package DynamicProgramming;

public class findMaxSquareWithAllZeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] input = {
		        {0, 1, 0, 0},
		        {0, 0, 0, 1},
		        {1, 0, 0, 0},
		        {0, 0, 1, 0}
		    };
		    int maxSize = findMaxSquareWithAllZeros(input);
		    System.out.println("Size of the largest square sub-matrix with all zeros: " + maxSize);
	}

	private static int findMaxSquareWithAllZeros(int[][] input) {
		int max = 0;
		if(input.length == 0) {
			return 0;
		}
		int[][] array = new int[input.length][input[0].length];
		for(int i = 0;i<input.length;i++) {
			if(input[i][0] == 0) {
				array[i][0] = 1;
				max = 1;
			}else {
				array[i][0] = 0;
			}
		}
		for(int j = 0;j<input[0].length;j++) {
			if(input[j][0] == 0) {
				array[j][0] = 1;
				max = 1;
			}else {
				array[j][0] = 0;
			}
		}
		for(int i = 1;i<input.length;i++) {
			for(int j = 1;j<input[0].length;j++) {
				if(input[i][j] == 1) {
					array[i][j] = 0;
				}else {
					array[i][j] = 1+Math.min(array[i-1][j-1], Math.min(array[i][j-1], array[i-1][j]));
					if(array[i][j] > max) {
						max = array[i][j];
					}
				}
			}
		}
		return max;
	}

}
