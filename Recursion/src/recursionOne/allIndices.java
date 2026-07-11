package recursionOne;

public class allIndices {
	public static int[] allIndexes(int input[], int x,int startIndex) {
		if(startIndex == input.length) {
			int[] output = new int[0];
			return output;
		}
		int[] smallOutput = allIndexes(input,x,startIndex + 1);
		if(input[startIndex] == x) {
			int[] output = new int[smallOutput.length + 1];
			output[0] = startIndex;
			for(int i = 0; i< smallOutput.length;i++) {
				output[i + 1] = smallOutput[i];
			}
			return output;
		}
		else {
			return smallOutput;
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1, 4, 3, 4};
		int x = 4;
		int[] ans = allIndexes(arr, x, 0);
		for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }

	}

}
