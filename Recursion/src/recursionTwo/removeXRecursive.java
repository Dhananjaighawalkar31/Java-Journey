package recursionTwo;

public class removeXRecursive {
	public static String remove(String input) {
		
		if(input.length() <= 1) {
			return input;
		}
		if(input.charAt(0) == 'x') {
		return remove(input.substring(1));
		}
		return input.charAt(0) + remove(input.substring(1));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "apxxdxxsxxpi";
		System.out.println(remove(input));
	}

}
