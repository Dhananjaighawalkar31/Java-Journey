package Queues;

public class Queue {

	public static void main(String[] args) throws QueueFullException {
		QueuesUsingArray queue = new QueuesUsingArray(4);
		int arr[] = {1,2,3,4};
		for(int elem : arr) {
			try {
				queue.enqueue(elem);
			}catch(QueueFullException e){
				
			}
		}
		while(!queue.isEmpty()) {
			try {
				System.out.println(queue.dequeue());
			} catch (QueueEmptyException e) {
				
			}
		}
	}

}
