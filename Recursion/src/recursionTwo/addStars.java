package recursionTwo;

public class addStars {
	public static String stars(String input) {
		if(input.length() == 1) {
			return input;
		}
		String out = stars(input.substring(1));
		if(input.charAt(0) == input.charAt(1)) {
			out = input.charAt(0) + "*" + input.charAt(1) + out.substring(1);
		}
		else {
			out = input.charAt(0) + out;
		}
		return out;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "apxxdxxsxxddpi";
		System.out.println(stars(input));
	}

}
