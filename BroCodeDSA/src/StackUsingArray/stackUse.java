package StackUsingArray;

public class stackUse {

	public static void main(String[] args) throws StackEmptyException {
//		stackUsingArray stack = new stackUsingArray();
		StackUsingLL<Integer> stack = new StackUsingLL<>();
		int arr[] = {2,3,4,5};
		
		for(int i = 0; i<arr.length;i++) {
			stack.push(arr[i]);
		}
		while(! stack.isEmpty()) {
			System.out.println(stack.pop());
		}

	}

}
