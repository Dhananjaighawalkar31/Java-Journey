package Queues;

public class QueuesUsingArray {
	private int data[];
	private int front;
	private int rear;
	private int size;
	
	public QueuesUsingArray() {
		data = new int[5];
		front = -1;
		rear = -1;
	}
	
	public QueuesUsingArray(int Capacity) {
		data = new int[Capacity];
		front = -1;
		rear = -1;
	}
	
	public int size() {
		return size;
	}
	
	public boolean isEmpty() {
		return size == 0;
	}
	
	public int front() throws QueueEmptyException{
		if(size == 0) {
			throw new QueueEmptyException();
		}
		else {
			return data[front];
		}
	}
	
	public void enqueue(int elem) throws QueueFullException{
		if(size == data.length) {
			throw new QueueFullException();
//			doublecapacity();
		}
		if(size == 0) {
			front = 0;
		}
		rear = (rear + 1) % data.length;
		data[rear] = elem;
		size++;
		
	}
	private void doublecapacity() {
		int temp [] = data;
		data = new int[2*temp.length];
		int index = 0;
		for(int i = front;i<temp.length;i++) {
			data[index++] = temp[i];
		}
		for(int i = 0;i< front;i++) {
			data[index++] = temp[i];
		}
		front = 0;
		rear = temp.length - 1;
	}
	
	public int dequeue() throws QueueEmptyException {
		if(size == 0) {
			throw new QueueEmptyException();
		}
		int temp = data[front];
		front = (front + 1) % data.length;
		size--;
		if(size == 0) {
			front--;
			rear--;
			
		}
		return temp;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
