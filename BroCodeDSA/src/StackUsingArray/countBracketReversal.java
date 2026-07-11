package StackUsingArray;

import java.util.Stack;

public class countBracketReversal {

	public static void main(String[] args) {
		String input = "{}{}{{}}{{}{";
        int output = countBracketReversal(input);
        System.out.println("Minimum bracket reversals needed: " + output);

	}

	private static int countBracketReversal(String input) {
		int len = input.length();
		
		if(len == 0) {
			return 0;
		}
		if(len % 2 != 0) {
			return -1;
		}
		Stack<Character> stack = new Stack<>();
		
		for(int i = 0;i<len;i++) {
			char curr = input.charAt(i);
			if(curr == '{') {
				stack.push(curr);
			}else {
				if(!stack.isEmpty() && stack.peek() == '{'){
					stack.pop();
				}else {
					stack.push(curr);
				}
			}
		}
		int count = 0;
		
		while(!stack.isEmpty()) {
			char char1 = stack.pop();
			char char2 = stack.pop();
			if(char1 != char2) {
				count += 2;
			}else {
				count += 1;
			}
		}
		return count;
		
		
		
		
		
		
		
		
		
	}

}
