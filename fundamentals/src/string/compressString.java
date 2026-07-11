package string;

public class compressString {
	public static String getCompressedString(String str) {
		int n = str.length();
		String answer = "";
		//empty string
		
		if(n == 0) {
			return answer;
		}
		int currentCharCount = 1;
		//we know that the character is occured atleast once hence initialized by 1
		answer += str.charAt(0);
		//to give the first word of the string like "a"
		for(int i = 1;i < n; i++) {
			if(str.charAt(i) == str.charAt(i-1)) {
				//if i = i - 1 means both characters are same hence they are more than once therefore currentCharCount in incremented 
				++currentCharCount;
			}
			else {
				if(currentCharCount > 1) {
					//for those words who occured more than once
					answer += currentCharCount;
					//they appended with answer
					currentCharCount = 1;
					//charCount is set to 1 for other words
				}
				answer += str.charAt(i);
				//word appended
				
			}
		}
		if(currentCharCount > 1) {
			answer += currentCharCount;
			//for last word of the string
		}
		return answer;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "aaabcbsssa";
		String result = getCompressedString(str);
		System.out.println(result);
	}

}
