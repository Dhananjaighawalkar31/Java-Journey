package collectionsQueue;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class J003 implements Comparator<Integer>{
	 
	public static void main(String[] args) {
		Queue<Integer> p = new PriorityQueue<>(new J003());
		p.add(10);
		p.add(2);
		p.add(5);
		p.add(1);
		p.add(4);
		p.add(9);
		
		while(!p.isEmpty()) {
			
			System.out.println(p.poll());
		}

	}
	@Override
	public int compare(Integer o1, Integer o2) {
		
		return o2-o1;
	}

}
