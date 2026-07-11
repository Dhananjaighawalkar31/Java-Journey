package recursionthree;

public class ReturnSubset {
	public static int[][] subsets(int input[]){
		return subsetHelper(input, 0);
	}
	public static int[][] subsetHelper(int[] input, int startIndex){
		if(startIndex == input.length) {
			int[][] output = new int[1][0];
			return output;
		}
		int[][] smallerOutput = subsetHelper(input, startIndex + 1);
		
		int[][] output = new int[2*smallerOutput.length][];
		int k = 0;
		for(int i = 0; i < smallerOutput.length;i++) {
			// Iterate over each subset in smallerOutput.
			output[k] = new int[smallerOutput[i].length];
			//Create a new subset in output with the same length as the current subset in smallerOutput.
			for(int j = 0;j<smallerOutput[i].length;j++) {
				output[k][j] = smallerOutput[i][j];
				//Copy each element from the current subset in smallerOutput to the corresponding subset in output.
			}
			k++;
			//Increment k to move to the next subset in output.
		}
		for(int i = 0; i < smallerOutput.length;i++) {
			//Iterate over each subset in smallerOutput.
//Create a new subset in output with a length one greater than the current subset in smallerOutput.
			output[k] = new int[smallerOutput[i].length+1];
//			 Set the first element of the new subset to input[startIndex].
			output[k][0] = input[startIndex];
			// Copy each element from the current subset in smallerOutput to the corresponding position (starting from index 1) in the new subset in output.
			for(int j = 1;j<=smallerOutput[i].length;j++) {
				output[k][j] = smallerOutput[i][j-1];
			}
			k++;
			//Increment k to move to the next subset in output.

		}
		return output;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input = {1, 2, 3};
		int[][] result = subsets(input);
		for (int[] subset : result) {
            for (int num : subset) {
                System.out.print(num + " ");
            }
            System.out.println();
        }

	}

}
