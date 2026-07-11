package string;

public class reverseWordAssignment {
	public static String reverseWord(String str, int start,int end ) {
		String reverse = "";
		while(start < end) {
			reverse = str.charAt(start) + reverse;
			//to reverse the string and append therefore abc becomes cba
			++start;
		}
		return reverse;
	}
	public static String reverseEachWord(String str) {
		int n = str.length();
		int prev = -1;
		//prev is given -1 because to get the first word as well ( prev - 1 to i)
		String ans = "";
		
		int i = 0;
		for(;i<n;i++) {
			if(str.charAt(i) == ' ') {
				//loop activates when it encounters space
				ans += (reverseWord(str, prev + 1, i) + " ");
				prev = i;
				//new prev value given
			}
		}
		ans += (reverseWord(str, prev + 1, i) + " ");
		
		return ans;
		
	}

	public static void main(String[] args) {
		String str = "abc bca ncs";
		String result = reverseEachWord(str);
		System.out.println(result);

	}

}
