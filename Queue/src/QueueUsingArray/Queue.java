package QueueUsingArray;

public class Queue {

	public static void main(String[] args) {
		QueueUsingDynamicArr queue = new QueueUsingDynamicArr(3);
		int arr[] = {1,2,3,4,5};
		for(int elem : arr) {
//			try {
				queue.enqueue(elem);
//			} catch (QueueFullException e) {
//			
//			}
		}
		while(!queue.isEmpty()) {
			try {
				System.out.println(queue.dequeue());
			} catch (QueueEmptyException e) {
				
			}
		}
	

	}

}
