package StackUsingArray;

import java.util.Stack;

public class IsBalanced {

	public static void main(String[] args) {
		System.out.println(IsBalanced("((()))"));

	}

	private static boolean IsBalanced(String data) {
		Stack<Character> stack = new Stack<>();
		for(int i = 0;i<data.length();i++) {
			if(data.charAt(i) == '(') {
				stack.push(data.charAt(i));
			}else if(data.charAt(i) == ')') {
				if(stack.isEmpty()) {
					return false;
				}
				char topChar = stack.pop();
				if(data.charAt(i) == ')' && topChar == '(') {
					continue;
				}else {
					return false;
				}
			}
		}
		return stack.isEmpty();
	}

}
