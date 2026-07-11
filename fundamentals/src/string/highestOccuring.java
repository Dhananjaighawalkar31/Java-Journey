package string;

public class highestOccuring {
	public static char highestOccuringChar(String str) {
		int n = str.length();
		int frequency[] = new int[256];
		//an array named frequency is used
		int maxFreq = 0;
		//used a counter to check frequency

		for(int i = 0;i<n;i++) {
			frequency[str.charAt(i)]++;
			//to check frequency of every word
			maxFreq = Math.max(maxFreq, frequency[str.charAt(i)]);
            //to know which letter had highest frequncy
		}
		char answer = '\0';

		for(int i = 0;i < n;i++) {
			if(frequency[str.charAt(i)] == maxFreq) {
				//to get the first term with highest frequency
				answer = str.charAt(i);
				break;
			}
		}
		return answer;

	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "aaabcbsssa";
		char result = highestOccuringChar(str);
		System.out.println(result);

	}

}
