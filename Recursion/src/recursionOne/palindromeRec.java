package recursionOne;

public class palindromeRec {
	public static boolean solve(String str, int start,int end) {
		if(start >= end) {
			return true;
		}
		if(str.charAt(start) != str.charAt(end)) {
			return false;
		}
		return solve(str, start + 1, end - 1);
	}
	
	
	
	public static boolean checkPalin(String str) {
		return solve(str, 0 , str.length()- 1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "madam";
        boolean isPalindrome = checkPalin(str);
        System.out.println(str + " is palindrome: " + isPalindrome);

	}

}
