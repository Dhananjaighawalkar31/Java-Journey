package Queues;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
public class Reversek {
	public static Queue<Integer> reverseK(Queue<Integer> input,int k){
		if(input.isEmpty() || k>input.size()) {
			return input;
		}
		if(k<=0) {
			return input;
		}
		Stack<Integer> stack = new Stack<>();
		
		for(int i = 0;i<k;i++) {
			stack.push(input.poll());
		}
		while(!stack.isEmpty()) {
			input.add(stack.pop());
		}
		for(int i = 0;i<input.size() - k;i++) {
			input.add(input.poll());
		}
		return input;
	
	}

	public static void main(String[] args) {
		
		Queue<Integer> queue = new LinkedList<>();
		queue.add(1);
		queue.add(2);
		queue.add(3);
		queue.add(4);
		queue.add(5);

		System.out.println("Original Queue: " + queue);
		reverseK(queue , 3);
		System.out.println("Reversed Queue: " + queue);
	}

}
