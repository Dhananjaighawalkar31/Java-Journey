package string;

public class consecutiveDuplicate {
	public static String RemoveConsecutiveDuplicate(String str) {
		int n = str.length();
		
		if (n == 0) {
			return str;
		}
		String answer = "";
		
		int StartIndex = 0;
		while(StartIndex < n) {
			char uniq = str.charAt(StartIndex);
			//first index is given as unique
			int nextUniq = StartIndex + 1;
			//next index is given as next uniq
			
			while (nextUniq < n && str.charAt(nextUniq) == uniq) {
				//if nextuniq and uniq are same it means there is one duplicate
				nextUniq += 1;
				//next uniq is inremented to check if there are other duplicates
			}
			answer += uniq;
			//the first value is appended and remaining duplicates are ignored
			StartIndex = nextUniq;
			//this time nextuniq is where start index starts
		}
		return answer;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "aaabbbccc";
		String result = RemoveConsecutiveDuplicate(str);
		System.out.println(result);
		

	}

}
