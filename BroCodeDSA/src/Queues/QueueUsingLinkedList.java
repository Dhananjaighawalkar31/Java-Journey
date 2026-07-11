package Queues;

public class QueueUsingLinkedList<T> {
	private Node<T> front;
	private Node<T> rear;
	int size;
	
	public QueueUsingLinkedList() {
		front = null;
		rear = null;
		size = 0;
	}
	public int size() {
		return size;
	}
	public boolean isEmpty() {
		return size == 0;
	}
	public T front() throws QueueEmptyException{
		if(front == null) {
			throw new QueueEmptyException();
		}
		return front.data;
	}
	public void enqueue(T elem) {
		Node<T> newNode = new Node<>(elem);
		size++;
		if(rear == null) {
			front = newNode;
			rear = newNode;
		}
		else {
			rear.next = newNode;
			rear = newNode;
		}
		
	}
	public T dequeue() throws QueueEmptyException{
		if(front == null) {
			throw new QueueEmptyException();
		}
		T temp = front.data;
		front = front.next;
		if(front == null) {
			rear = null;
		}
		size--;
		return temp;
	}
}
