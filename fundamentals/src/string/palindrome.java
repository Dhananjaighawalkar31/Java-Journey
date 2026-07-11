package string;

public class palindrome {
	public static boolean checkPalindrome(String input) {
		int  i =0;
		int j = input.length() - 1;
		while(i < j) {
			if(input.charAt(i) != input.charAt(j)) {
				return false;
			}else {
				i++;
				j--;
			}

		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "madam";
		System.out.println(checkPalindrome(input));

	}

}
