package PriorityQueue;

import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class buyTicket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10, 8, 9, 5, 3, 6, 7};
		int k = 3;
		int time = buyTicket(arr, k);
		System.out.println("Time taken by person at index " + k + ": " + time);
	}

	private static int buyTicket(int[] arr, int k) {
		Queue<Integer> q = new LinkedList<Integer>();
		PriorityQueue<Integer> pq = new PriorityQueue<>(10,Collections.reverseOrder());
		for(int i : arr) {
			q.add(i);
			pq.add(i);
		}
		int count = 0;
		while(!pq.isEmpty()) {
			if(q.peek().equals(pq.peek())){
				if(k==0) {
					return count + 1;
				}else {
					count++;
					q.poll();
					pq.poll();
					k--;
				}
			}else {
				q.add(q.peek());
				q.poll();
				if(k==0) {
					k = q.size() - 1;
				}else {
					k--;
				}
			}
		}
		return count;
	}

}
