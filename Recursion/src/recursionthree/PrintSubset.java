package recursionthree;

public class PrintSubset {
	public static void printSubsets(int input[]) {
		int output[] = new int[0];
		helper(input, 0, output);
	}
	public static void helper(int input[], int beginIndex, int[] output) {
		if(beginIndex == input.length) {
			for(int i: output) {
				System.out.print(i + " ");
			}
			System.out.println();
			return;
		}
		int[] newOutput = new int[output.length + 1];
		int i = 0;
		for(; i<output.length;i++) {
			newOutput[i] = output[i];
		}
		newOutput[i] = input[beginIndex];
		helper(input, beginIndex+1,output);
		helper(input, beginIndex+1,newOutput);
 	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input = {1, 2, 3};
		printSubsets(input);
	}

}
