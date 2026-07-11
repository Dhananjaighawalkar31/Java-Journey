package recursionthree;

public class printSubsequence {
	public static void printsubs(String input, String outputSofar) {
		if(input.length() == 0) {
			System.out.println(outputSofar);
			return;
		}
		// when we choose that not to include 1st character
		printsubs(input.substring(1),outputSofar);
		// when we choose to include 1st character
		printsubs(input.substring(1),outputSofar + input.charAt(0));
	}
	public static void printsubs(String input) {
		printsubs(input, " ");
	}
	public static void main(String[] args) {
		printsubs("xyz");
	}
}
