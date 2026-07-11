package recursionTwo;

public class ConvertStringToInteger {
	public static int convert(String input) {
		if(input.length() == 1) {
			return input.charAt(0) - '0';
		}
		int small = convert(input.substring(0, input.length() - 1));
		int last = input.charAt(input.length() - 1) - '0';
		return small*10 + last;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "1234";
		System.out.println(convert(input));
	}
}
