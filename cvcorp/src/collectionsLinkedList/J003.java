package collectionsLinkedList;

import java.util.LinkedList;
import java.util.List;

public class J003 {
//	Create a Java Application where we need to create a LinkedList Object by using 
//	Integer as its Generic type, add a few elements to it, remove the first and last 
//	element of the LinkedList, and print the LinkedList.
	public static void main(String[] args) {
		List<Integer> ll = new LinkedList<>();
		ll.add(10);
		ll.add(20);
		ll.add(30);
		ll.add(40);
		ll.add(50);
		
		ll.removeFirst();
		ll.removeLast();
		System.out.println(ll);

	}

}
