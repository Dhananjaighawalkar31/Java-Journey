package recursionTwo;

public class removeConsDuplics {
	public static String remove(String str) {
		if(str.length() <= 1) {
			return str;
		}
		if(str.charAt(0) == str.charAt(1)) {
			return remove(str.substring(1));
		}
		else {
			String small = remove(str.substring(1));
			return str.charAt(0) + small;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str= "xbxxssaaaafffxxx";
		
		System.out.println(remove(str));
	}

}
