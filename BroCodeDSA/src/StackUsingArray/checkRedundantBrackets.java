package StackUsingArray;

import java.util.Stack;

public class checkRedundantBrackets {

	public static void main(String[] args) {
		String expression1 = "(a+b)";
		String expression2 = "(a + (a + b))";
		System.out.println("Expression: " + expression1 + " has redundant brackets: " + checkRedundantBrackets(expression1));
		System.out.println("Expression: " + expression2 + " has redundant brackets: " + checkRedundantBrackets(expression2));

	}
	private static boolean checkRedundantBrackets(String data) {
		Stack<Character> s = new Stack<>();
		for(int i = 0;i<data.length();i++) {
			if(data.charAt(i) == '(' || find(data.charAt(i))) {
				s.push(data.charAt(i));
			}else if( data.charAt(i) == ')') {
				boolean hasOper = false;
				while(!s.isEmpty() && s.peek() != '(') {
					s.pop();
					hasOper = true;
				}
				if(!hasOper) {
					return true;
				}
				if(!s.empty()) {
					s.pop();
				}
			}
			
		}
		return false;
	}
	private static boolean find(char ch) {
		if(ch == '+' || ch == '-' || ch == '*' || ch == '/') {
			return true;

		}
		return false;
	}
}
