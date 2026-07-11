package collectionSet;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class J001 {

	public static void main(String[] args) {
		int a[] = {1,2,2,1,1,2,2,1,2,34,4,4,43,343,45,2,2,6};
		Set<Integer> hs = new HashSet<>();
		for(int k:a) {
			hs.add(k);
		}
		System.out.print(hs);
		Set<Integer> lhs = new LinkedHashSet<>();
		for(int k:a) {
			lhs.add(k);
		}
		System.out.println();
		System.out.print(lhs);
		Set<Integer> ts = new TreeSet<>();
		for(int k:a) {
			ts.add(k);
		}
		System.out.println();
		System.out.print(ts);
	}

}
