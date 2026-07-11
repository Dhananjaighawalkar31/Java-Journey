package string;

public class removeOccurence {
	public static String removeAllOccurenceOfChar(String str, char ch) {
		int n = str.length();
		String ans = "";
		
		for(int i = 0;i < n;i++) {
			if(str.charAt(i) != ch) {
				//if  a character is not same as a it will be promoted
				ans += str.charAt(i);
			}
		}
		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "dhananjai";
		char ch = 'a';
		String result = removeAllOccurenceOfChar(str,ch);
		System.out.println(result);

	}

}
