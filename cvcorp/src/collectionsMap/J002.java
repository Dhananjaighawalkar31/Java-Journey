package collectionsMap;

import java.util.Arrays;
import java.util.Stack;

public class J002 {

	public static void main(String[] args) {
		Stack<Integer> s = new Stack<>();
		for(int i = 0;i<10;i++) {
			s.push(i);
		}
		int n = s.size();
		int[] a = new int[n];
		for(int i = 0;i<n;i++) {
			a[i] = s.pop();
		}
		
		for(int num : a) {
			s.push(num);
		}
		for(int i = 0;i<n;i++) {
			System.out.println(s.pop());
		}
	
	}

}
