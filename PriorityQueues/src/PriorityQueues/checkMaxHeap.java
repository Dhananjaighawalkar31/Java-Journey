package PriorityQueues;

import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class checkMaxHeap {

	public static void main(String[] args) {
		int[] arr = {10, 8, 9, 5, 3, 6, 7};
//		boolean isMaxHeap = checkMaxHeap(arr);
//		System.out.println("Is Max Heap: " + isMaxHeap);
//		int n = arr.length;
//		int k = 4;
//		int ans = kthLargest(n,arr,k);
//		System.out.println(ans);

		int k = 3;
		int time = buyTicket(arr, k);
		System.out.println("Time taken by person at index " + k + ": " + time);


	}

	public static int buyTicket(int arr[],int k) {
		Queue<Integer> q = new LinkedList<Integer>();

		PriorityQueue<Integer> pq = new PriorityQueue<Integer>(10,Collections.reverseOrder());
		for(int i : arr) {
			q.add(i);
			pq.add(i);
		}
		int count = 0;
		while(!pq.isEmpty()) {
			if(q.peek().equals(pq.peek())) {
				if(k == 0) {
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
				if(k == 0) {
					k = q.size() - 1;
				}else {
					k--;
				}
			}
		}
		return count;

	}
	public static boolean checkMaxHeap(int arr[]) {
		int n = arr.length;
		for(int i = 0;2*i + 1 < n;i++ ) {
			int leftChildIndex = 2*i+1;
			int rightChildIndex = leftChildIndex +1;

			if(arr[i] <arr[leftChildIndex]) {
				return false;
			}

			if(rightChildIndex < n && arr[i] < arr[rightChildIndex]) {
				return false;
			}
		}
		return true;

	}

	public static int kthLargest(int n,int[] input,int k) {
		PriorityQueue<Integer> minHeap = new PriorityQueue<>();
		for(int i = 0;i<k;i++) {
			minHeap.add(input[i]);
		}
		for(int i = k;i<n;i++) {
			if(input[i] > minHeap.peek()) {
				minHeap.poll();
				minHeap.add(input[i]);
			}
		}
		return minHeap.peek();
	}

}
