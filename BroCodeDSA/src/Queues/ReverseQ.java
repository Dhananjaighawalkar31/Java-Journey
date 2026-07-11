package Queues;
import java.util.Queue;
import java.util.Stack;
public class ReverseQ {
	public static void ReverseQ(Queue<Integer> input) {
		if(input.size() <= 1) {
			return;
		}
		int front = input.poll();
		ReverseQ(input);
		input.add(front);
	}

	public static void main(String[] args) {

		StackUsingQueues stack = new StackUsingQueues();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		System.out.println("Top element: " + stack.top()); // prints 3
		System.out.println("Popped element: " + stack.pop()); // prints 3
		System.out.println("Top element after pop: " + stack.top()); // prints 2
		System.out.println("Popped element: " + stack.pop()); // prints 2
		System.out.println("Popped element: " + stack.pop()); // prints 1
		System.out.println("Is stack empty? " + stack.isEmpty()); // prints true
	}

}
