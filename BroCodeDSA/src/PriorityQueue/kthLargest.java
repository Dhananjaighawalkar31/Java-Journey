package PriorityQueue;

import java.util.PriorityQueue;

public class kthLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10, 8, 9, 5, 3, 6, 7};
		int n = arr.length;
		int k = 4;
		int ans = kthLargest(n,arr,k);
		System.out.println(ans);

	}

	private static int kthLargest(int n, int[] arr, int k) {
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		for(int i = 0;i<k;i++) {
			pq.add(arr[i]);
		}
		for(int i = k;i<n;i++) {
			if(arr[i] > pq.peek()) {
				pq.poll();
				pq.add(arr[i]);
			}
		}
		return pq.peek();
	}

}
