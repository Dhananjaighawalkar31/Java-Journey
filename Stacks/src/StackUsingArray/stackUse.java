package StackUsingArray;

public class stackUse {

	public static void main(String[] args) throws StackEmptyException, StackFullException {
		stackUsingArray stack = new stackUsingArray();
		int arr[] = {5,6,7,8,9};
		
		for(int i = 0;i<arr.length;i++) {
			stack.push(arr[i]);
		}
		while(! stack.isEmpty()) {
			System.out.print(stack.pop());
		}
		
		
//		stack.push(10);
//		System.out.println(stack.top());
//		stack.pop();
//		stack.size();
//		System.out.println(stack.isEmpty());
	}

}
