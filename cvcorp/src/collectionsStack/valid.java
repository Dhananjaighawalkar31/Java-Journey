package collectionsStack;

import java.util.Stack;

public class valid {

	public static void main(String[] args) {
		String s = "{[]}";
		System.out.println(val(s));
		
	}

	private static boolean val(String s) {
		Stack<Character> st = new Stack<>();
		for(char a:s.toCharArray()) {
			if(a == '{' || a == '[' || a=='(') {
				st.push(a);
			}else if(a == '}' || a == ']' || a==')') {
				if(st.isEmpty()) {
					return false;
				}
				char ch = st.pop();
				if(a == ')' && ch != '(') {
					return false;
				}
				if(a == ']' && ch != '[') {
					return false;
				}
				if(a == '}' && ch != '{') {
					return false;
				}
			}
		}
		return st.isEmpty();
	}

}
