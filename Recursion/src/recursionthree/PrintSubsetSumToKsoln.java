package recursionthree;

public class PrintSubsetSumToKsoln {
	public static void helper(int[] input, int beginIndex, int[] output,int k) {
		if(beginIndex == input.length) {
			if(k == 0) {
				for(int i : output) {
					System.out.print((i+" "));
				}
				System.out.println();
			}return;
		}
		
		int[] newOutput = new int[output.length+1];
		int i = 0;
		for(;i<output.length;i++) {
			newOutput[i] = output[i];
		}
		newOutput[i] = input[beginIndex];
		helper(input, beginIndex + 1,output, k);
		helper(input,beginIndex + 1,newOutput,k - input[beginIndex]);
	}
	public static void printSubsetsSumToK(int input[], int k) {
		int output[] = new int[0];
		helper(input, 0 , output, k);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input = {1,2,3,4,5};
		int k = 6;
		printSubsetsSumToK(input,k);

	}

}
