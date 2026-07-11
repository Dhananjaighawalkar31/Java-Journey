package string;

public class reverseString {
	public static String reverseStr(String str) {
		String reversedString = "";
		for(int i = str.length() - 1;i>=0;i--){
			reversedString += str.charAt(i);
		}
		return reversedString;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abcde";
		String reversedString = reverseStr(str);
		System.out.println(reversedString);
	}

}
