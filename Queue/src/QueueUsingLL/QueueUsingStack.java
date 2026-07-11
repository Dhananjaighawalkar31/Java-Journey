package QueueUsingLL;

import java.util.Stack;

public class QueueUsingStack<T> {
	 private Stack<T> stack1;
	 private Stack<T> stack2;

	public QueueUsingStack() {
		stack1 = new Stack<>();
        stack2 = new Stack<>();

	}
	// Enqueue an element
    public void enqueue(T element) {
        stack1.push(element);
    }

    // Dequeue an element
    public T dequeue() {
        if (isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }

        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }

        return stack2.pop();
    }

    // Check if the queue is empty
    public boolean isEmpty() {
        return stack1.isEmpty() && stack2.isEmpty();
    }

    // Get the size of the queue
    public int size() {
        return stack1.size() + stack2.size();
    }

    public static void main(String[] args) {
        QueueUsingStack<Integer> queue = new QueueUsingStack<>();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        System.out.println(queue.dequeue()); // prints 1
        System.out.println(queue.dequeue()); // prints 2
        System.out.println(queue.dequeue()); // prints 3
    }
}


	

