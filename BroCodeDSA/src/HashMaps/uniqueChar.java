package HashMaps;

import java.util.HashMap;

public class uniqueChar {

	public static void main(String[] args) {
		String str = "abaabc";
		System.out.println(uniqueChar(str));

	}

	private static String uniqueChar(String str) {
		if(str.length() == 0) {
			return " ";
		}
		String ans = " ";
		HashMap<Character,Boolean> hm = new HashMap<>();
		for(int currIndex = 0;currIndex<str.length();currIndex++) {
			char currChar = str.charAt(currIndex);
			if(!hm.containsKey(currChar)) {
				hm.put(currChar, true);
				ans += currChar;
			}
		}
		return ans;
		
	}

}
