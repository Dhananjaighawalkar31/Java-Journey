package collectionsQueue;

import java.util.PriorityQueue;
import java.util.Queue;
public class J001 {

	public static void main(String[] args) {
		Queue<Integer> p = new PriorityQueue<>();
		p.add(10);
		p.add(2);
		p.add(5);
		p.add(1);
		p.add(4);
		p.add(9);
//		p.add(10);
//		p.add(10);
		System.out.println(p);

	}

}
