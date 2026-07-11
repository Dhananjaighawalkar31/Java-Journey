package QueueUsingLL;


import QueueUsingArray.QueueFullException;

public class QueueLL {

	public static void main(String[] args) {
//		QueueUsingLL queue = new QueueUsingLL(3);
		QueueUsingLL<Integer> queue = new QueueUsingLL<>();
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
			} catch (QueueFullException e) {
				
			}
		}
	

	}

}

