package Trees;

public class QueueUsingLL<T> {
	private Node<T> front;
	private Node<T> rear;
	int size;
	
	
	public QueueUsingLL() {
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
	public void enqueue(T elem) {
		Node<T> newNode = new Node<>(elem);
		size++;
		if(rear == null) {
			front = newNode;
			rear = newNode;
		}else {
			rear.next = newNode;
			rear = newNode;
		}
		
	}
	public T front() throws QueueFullException{
		if(front == null) {
			throw new QueueFullException();
		}
		return front.data;
		
	}
	public T dequeue() throws QueueFullException {
		if(front == null) {
			throw new QueueFullException();
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
