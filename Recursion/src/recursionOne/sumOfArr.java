package recursionOne;

public class sumOfArr {
	public static int sum(int input[] , int startIndex) {
		if(startIndex == input.length) {
			return 0;
		}
		return input[startIndex] + sum(input, startIndex + 1);
	}
	public static int sum_1(int input[]) {
		return sum(input, 0);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] arr = {1, 2, 3, 4, 5};
		    int sum = sum_1(arr);
		    System.out.println("Sum: " + sum);

	}

}
