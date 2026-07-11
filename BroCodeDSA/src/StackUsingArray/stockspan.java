package StackUsingArray;

import java.util.Stack;

public class stockspan {

	public static void main(String[] args) {
		int[] price = {10, 4, 5, 90, 120, 80};
		int[] output = stockSpan(price);
		System.out.println("Stock prices: ");
		for (int i = 0; i < price.length; i++) {
			System.out.print(price[i] + " ");
		}
		System.out.println();
		System.out.println("Stock spans: ");
		for (int i = 0; i < output.length; i++) {
			System.out.print(output[i] + " ");
		}
		System.out.println(); // added this line
	}

	private static int[] stockSpan(int[] price) {
		Stack<Integer> stk = new Stack<>();
		int n = price.length;
		int[] output = new int[n];
		stk.push(0);
		output[0] = 1;

		for(int i = 1;i<n;i++) {
			while(!stk.isEmpty() && price[stk.peek()] < price[i]) {
				stk.pop();
			}
			if(stk.isEmpty()) {
				output[i] = i+1;
			}else {
				output[i] = i - stk.peek(); 
			}
			stk.push(i);
		}
		return output;
	}
}



