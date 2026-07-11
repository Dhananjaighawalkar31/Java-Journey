package collectionsQueue;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class J005 {

	public static void main(String[] args) {
		List<Integer> al = new ArrayList<>();
		al.add(10);
		al.add(5);
		al.add(3);
		al.add(15);
		al.add(7);
		al.add(1);
		al.add(12);
		List<Integer> a = m1(al);
		System.out.println(a);
		
	}

	private static List<Integer> m1(List<Integer> al) {
		ArrayDeque<Integer> q = new ArrayDeque<>(al);
		List<Integer> res = new ArrayList<>();
		while(!q.isEmpty()) {
			if(q.size() == 1) {
		        res.add(q.removeFirst());
		    }else {
		    	  int x = q.removeFirst();
					int y = q.removeLast();
					if(x>y) {
						res.add(x);
					}else {
						res.add(y);
					}
		    }
			
		}
		return res;
	}

}
