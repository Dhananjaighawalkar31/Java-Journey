package collectionsLinkedList;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

//. Create a Java Application where we need to create a LinkedList Object by using 
//Integer as its Generic type, add 5 elements to the LinkedList, remove the 
//element at the second index of the list, add a new element at the second index 
//of the list, replace the third index element with a new element and print the 
//LinkedList by using ListIterator in both forward and backward directions.  
public class J001 {

	public static void main(String[] args) {
		List<Integer> ll = new LinkedList<>();
		ll.add(10);
		ll.add(20);
		ll.add(30);
		ll.add(40);
		ll.add(50);
		
		ll.remove(2);
		ll.add(2,300);
		ll.set(3, 400);
		ListIterator<Integer> f = ll.listIterator();
		
		while(f.hasNext()) {
			System.out.print(f.next() + "-> ");
		}
		
		//ListIterator<Integer> b = ll.listIterator(ll.size());
		System.out.println();
		while(f.hasPrevious()) {
			System.out.print(f.previous() + "-> ");
		}


		
		

	}

}
