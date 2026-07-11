package StackUsingArray;

import java.util.Stack;

public class checkRedundant {
	private static boolean find(char ch) {
		if(ch == '+' || ch == '-' || ch == '*' || ch == '/') {
			return true;

		}
		return false;
	}

	public static boolean checkRedundantBrackets(String expression) {
		Stack<Character> stk = new Stack<>();
		for(int i = 0;i<expression.length();i++) {
			if(expression.charAt(i) == '(' || find(expression.charAt(i))) {
				stk.push(expression.charAt(i));
			}else if(expression.charAt(i) == ')') {
				boolean hasOperator = false;

				while(!stk.isEmpty() && stk.peek() != '(') {
					stk.pop();
					hasOperator = true;
				}
				if(!hasOperator) {
					return true;
				}
				if(!stk.isEmpty()) {
					stk.pop();
				}
			}
		}
		return false;
	}
	public static void main(String[] args) {
		String expression1 = "(a+b)";
		String expression2 = "(a + (a + b))";
		System.out.println("Expression: " + expression1 + " has redundant brackets: " + checkRedundantBrackets(expression1));
		System.out.println("Expression: " + expression2 + " has redundant brackets: " + checkRedundantBrackets(expression2));
	}
}



