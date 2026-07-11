package collectionsMap;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Set;

public class J001 {
	public static void main(String[] args) {
		int[] a = {1,2,2,2,1,1,3,1,4,3,2,3,4,3,21,21};
//		findDuplicates(a);
		func(a);
		Hashtable<Integer,Integer> h = new Hashtable<>();
		for(int i = 1;i<=10;i++) {
			h.put(i, i);
		}
		System.out.println(h);
//		for(int i = 0;i<a.length;i++) {
//			int c = 0;
//			for(int j = i;j<a.length;j++) {
//				if(a[i]==a[j]) {
//					c++;
//				}
//			}
//			if(c>1) {
//				System.out.println(a[i]);
//			}
//			 
//		}
	}
	private static void func(int[] a) {
		Set<Integer> s = new HashSet<>();
		Set<Integer> s1 = new HashSet<>();
		for(int n : a) {
			if(!s.add(n)) {
				s1.add(n);
			}
			s1.add(n);
		}
		System.out.println(s1);
		
	}
	public static void findDuplicates(int[] array) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : array) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        boolean hasDuplicates = false;
        System.out.print("Duplicate elements: ");
        for (int num : map.keySet()) {
            if (map.get(num) > 1) {
                System.out.print(num + " ");
                hasDuplicates = true;
            }
        }
        if (!hasDuplicates) {
            System.out.println("No duplicates found");
        }
    }
}
