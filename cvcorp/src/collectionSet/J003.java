package collectionSet;

import java.util.Iterator;
import java.util.TreeSet;

public class J003 {
	

	    public static void main(String[] args){
	        TreeSet<Integer> ts = new TreeSet<Integer>((i,j)->{return j-i;});
	        ts.add(12);
	        ts.add(32);
	        ts.add(4);
	        System.out.println(ts);
	        // System.out.println(ts.higher(12));
	        // Set n = ts.headSet(32,true);
	        // System.out.println(n);
	        // Set n1 = ts.descendingSet();
	        // System.out.println(n1);
	        Iterator itr = ts.iterator();
	        while(itr.hasNext())
	            System.out.print(itr.next()+" ");
	        System.out.println();
	        // Iterator itr1 = ts.descendingIterator();
	        // while(itr1.hasNext())
	        //     System.out.print(itr1.next()+" ");

	    }
	
}
