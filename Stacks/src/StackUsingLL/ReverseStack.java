package StackUsingLL;

import java.util.Stack;

public class ReverseStack {

	public static void main(String[] args) {
		int arr[] = {5,6,7,8,9};
		Stack<Integer> stack = new Stack<>();
		Stack<Integer> helper = new Stack<>();
		
		for(int elem: arr) {
			stack.push(elem);
			
		}
		reverseStack(stack, helper);
		
		while(!stack.empty()) {
			System.out.println(stack.pop());
		}
		
		
	}

	private static void reverseStack(Stack<Integer> stack, Stack<Integer> helper) {
		if(stack.size() <= 1) {
			return;
		}
		int lastElement = stack.pop();
		
		reverseStack(stack,helper);
		
		while(!stack.isEmpty()) {
			int top = stack.pop();
			helper.push(top);
		}
		stack.push(lastElement);
		
		while(!helper.empty()) {
			int top = helper.pop();
			stack.push(top);
		}
	}

}
