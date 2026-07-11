package StackUsingArray;

import java.util.Stack;

public class reverseStack {

	public static void main(String[] args) {
		int arr[] = {1,2,3,4};
		Stack<Integer> stack = new Stack<>();
		Stack<Integer> helper = new Stack<>();
		
		for(int s:arr) {
			stack.push(s);
		}
		reverseStack(stack,helper);
		while(!stack.isEmpty()) {
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
		while(!helper.isEmpty()) {
			int top = helper.pop();
			stack.push(top);
		}
	}

}
