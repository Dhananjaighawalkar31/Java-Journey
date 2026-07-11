package Queues;



public class QueueLL {

	public static void main(String[] args) {
		QueueUsingLinkedList<Integer> queue = new QueueUsingLinkedList<>();
		int arr[] = {1,2,3,4,5};
		
		for(int elem:arr) {
			queue.enqueue(elem);
		}
		while(!queue.isEmpty()) {
			try {
				System.out.println(queue.dequeue());
			} catch (QueueEmptyException e) {
				
			}
		}
	
	}

}
