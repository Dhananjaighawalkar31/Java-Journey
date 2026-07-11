package StackUsingArray;

public class stackUsingArray {
	private int data[];
	private int topIndex;
	
	public stackUsingArray() {
		data = new int[2];
		topIndex = -1;
	}
	public stackUsingArray(int size) {
		data = new int[10];
		topIndex = -1;
	}
	public int size() {
		return topIndex + 1;
	}
	public boolean isEmpty() {
		return topIndex == -1;
	}
	public void doublecapacity() {
		int temp[] = data;
		data = new int[2 * temp.length];
		for(int i = 0; i< temp.length;i++) {
			data[i] = temp[i];
		}
	}
	public void push(int elem) {
		if(topIndex == data.length - 1) {
			doublecapacity();
		}
		data[++topIndex] = elem;
	}
	public int top() throws StackEmptyException{
		if(topIndex == -1) {
			throw new StackEmptyException();
		}
		return data[topIndex];
	}
	public int pop() throws StackEmptyException{
		if(topIndex == -1) {
			throw new StackEmptyException();
		}
		int temp = data[topIndex];
		topIndex--;
		return temp;
	}
	
	
	
	
	
	
	
	
	
	
}
