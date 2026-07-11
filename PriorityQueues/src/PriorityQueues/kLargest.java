package PriorityQueues;
import java.util.PriorityQueue;
import java.util.ArrayList;
import java.util.Collections;


public class kLargest {

	public static void main(String[] args) {
		int[] arr = {4,1,6,3,7,2,9,8};
		int k = 3;
		printKlargest(arr,k);
		int n = arr.length;
		ArrayList<Integer> ans = kSmallest(n,arr,k);
		System.out.println(ans);
	}

	private static ArrayList<Integer> kSmallest(int n, int[] arr, int k) {
		PriorityQueue<Integer> pq = new PriorityQueue<>((Collections.reverseOrder()));
		for(int i = 0;i<k;i++) {
			pq.add(arr[i]);
		}
		for(int i = k;i<n;i++) {
			if(arr[i] <pq.peek()) {
				pq.poll();
				pq.add(arr[i]);
			}
		}
		
		ArrayList<Integer> output = new ArrayList<>();
		while(!pq.isEmpty()) {
			output.add(pq.poll());
		}
		return output;
		
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
