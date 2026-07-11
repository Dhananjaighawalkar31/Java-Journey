package PriorityQueue;

import java.util.PriorityQueue;

public class PrintKLargest {

	public static void main(String[] args) {
		int[] arr = {4,1,6,3,7,2,9,8};
		int k = 3;
		printKlargest(arr,k);
			
	}

	private static void printKlargest(int[] arr, int k) {
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		for(int i = 0;i<k;i++) {
			pq.add(arr[i]);
		}
		for(int i = k-1;i<arr.length;i++) {
			if(pq.peek()<arr[i]) {
				pq.poll();
				pq.add(arr[i]);
			}
		}
		while(!pq.isEmpty()) {
			System.out.println(pq.poll());
		}
		
	}

}
