package collectionSet;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class J002 {

	public static void main(String[] args) {
		Comparator<Integer> c = new Comparator<Integer>() {
		
			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				return o2-o1;
			}
		};
		Set<Integer> ts = new TreeSet<>(c);
		ts.add(10);
		ts.add(20);
		ts.add(30);
		ts.add(40);
		ts.add(100);
		System.out.println(ts);
		
		
		

	}

}
