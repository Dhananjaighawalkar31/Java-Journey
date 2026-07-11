package recursionTwo;

public class charReplace {
	public static String replace(String str, char c1,char c2) {
		if(str.length() == 0) {
			return "";
		}
		char c;
		if(str.charAt(0) == c1) {
			c = c2;
		}
		else {
			c = str.charAt(0);
		}
		String ans = replace(str.substring(1),c1, c2);
		return (c + ans);
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str= "xbxsafx";
		char c1 = 'x';
		char c2 = 'h';
		System.out.println(replace(str, c1, c2));
	}

}
