package Queues;

import java.util.Stack;

public class QueueUsingStacks<T> {
	private Stack<T> stack1;
	private Stack<T> stack2;
	
	public QueueUsingStacks() {
		stack1 = new Stack<>();
		stack2 = new Stack<>();
	}
	public void enqueue(T element) {
		stack1.push(element);
	}
	public T dequeue() {
		if(isEmpty()) {
			throw new RuntimeException("Queue is empty");
		}
		if(stack2.isEmpty()) {
			while(!stack1.isEmpty()) {
				stack2.push(stack1.pop());
			}
		}
		return stack2.pop();
	}
	
	
	
	private boolean isEmpty() {
		return stack1.isEmpty() && stack2.isEmpty();
	}
	
	public int size() {
		return stack1.size() + stack2.size();
	}
	
	
	public static void main(String[] args) {
		QueueUsingStacks<Integer> queue = new QueueUsingStacks<>();
		queue.enqueue(1);
		queue.enqueue(2);
		queue.enqueue(3);
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
	}

}
