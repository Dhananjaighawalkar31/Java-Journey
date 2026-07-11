package recursionOne;

public class findLastIndex {
	public static int lastIndex(int input[], int x,  int startIndex) {
		if(startIndex == input.length) {
			return -1;
		}
		int smallAns = lastIndex(input , x ,startIndex + 1);
		if(smallAns != -1) {
			return smallAns;
		}
		if(input[startIndex] == x) {
			return startIndex;
		}
		else {
			return -1;
		}
	}
	public static int lastIndex_1(int input[], int x) {
		return lastIndex(input, x , 0);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1, 4, 3, 4};
		int x = 4;
		int ans = lastIndex_1(arr, x);
		System.out.println(ans);

	}

}
