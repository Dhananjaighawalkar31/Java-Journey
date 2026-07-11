package StackUsingLL;

import java.util.Stack;

public class checkBalanced {

	public static boolean isBalanced(String expression) {
		
		Stack<Character> stack = new Stack<Character>();
		
		for(int i = 0;i < expression.length();i++) {
			if(expression.charAt(i) == '(') {
				stack.push(expression.charAt(i));
			}else if(expression.charAt(i) == ')') {
				if(stack.isEmpty()) {
					return false;
				}
				char topChar = stack.pop();
				if(expression.charAt(i) == ')' && topChar == '(') {
					continue;
				}else {
					return false;
			}
			
			
			}
		}
		return stack.isEmpty();
	
	}
	 public static void main(String[] args) {
	        System.out.println(isBalanced("((()))"));  // true
	        System.out.println(isBalanced("(()"));     // false
	        System.out.println(isBalanced(")("));      // false
	    }
	}


