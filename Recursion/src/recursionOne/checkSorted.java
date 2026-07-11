package recursionOne;

public class checkSorted {
	public static boolean sorted(int[] input) {
		if(input.length <= 1) {
			return true;
		}
		
		int smallinput[] = new int[input.length - 1];
		for(int i = 1; i < input.length;i++) {
			smallinput[i - 1] = input[i];
		}
		
		boolean smallAns = sorted(smallinput);
		if(!smallAns) {
			return false;
		}
		if(input[0] <= input[1]){
			return true;
		}else {
			return false;
		}
	}
	public static boolean sorted_2(int[] input) {
		if(input.length <= 1) {
			return true;
		}
		if(input[0] > input[1] ) {
			return false;
		}
		
		int smallinput[] = new int[input.length - 1];
		for(int i = 1; i < input.length;i++) {
			smallinput[i - 1] = input[i];
		}
		boolean smallAns = sorted_2(smallinput);
		return smallAns;
//		if(smallAns) {
//			return true;
//		}else {
//			return false;
//		}
		
	}	
	private static boolean sortedBetter(int[] input, int startIndex) {
		if(startIndex >= input.length - 1) {
			return true;
		}
		if(input[startIndex] > input[startIndex + 1]) {
			return false;
		}
		boolean smallAns = sortedBetter(input , startIndex + 1);
		return smallAns;
	}
	
	public static boolean sortedBetter_1(int[] input) {
		return sortedBetter(input, 0);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input[] = { 1, 2, 3};
		System.out.println(sortedBetter_1(input));
	}

}
