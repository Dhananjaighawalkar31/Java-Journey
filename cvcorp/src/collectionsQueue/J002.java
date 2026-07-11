package collectionsQueue;

import java.util.PriorityQueue;
import java.util.Queue;
//Create a Java Application where we need to create a PriorityQueue Object with 
//integer as its generic, add few elements to it and retrieve the values in ascending 
//order. 
public class J002 {

	public static void main(String[] args) {
		Queue<Integer> p = new PriorityQueue<>();
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

}
