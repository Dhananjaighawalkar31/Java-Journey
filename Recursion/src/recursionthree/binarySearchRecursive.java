package recursionthree;

public class binarySearchRecursive {
	public static int binary(int[] input, int element) {
		return helper(input, 0, input.length - 1, element);
	}
	
	public static int helper(int[] input,int start,int end , int element) {
		if(start > end) {
			return -1;
		}
		int mid = (start + end)/2;
		if(input[mid] == element) {
			return mid;
		}
		if(input[mid] > element) {
			return helper(input,start,mid-1,element);
		}
		else {
			return helper(input,mid + 1,end,element);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input = {2, 3, 4, 4, 5, 7, 8};
		int element = 3;
		System.out.println(binary(input,element));
	}

}
