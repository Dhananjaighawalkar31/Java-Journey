package collectionsLinkedList;


import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;



public class J004 {
//	 Create a Java Application where we need to create a LinkedList Object by using 
//	 Integer as its Generic type, add a few elements to it, and sort the elements 
//	 without using the sort method.  
	public static void main(String[] args) {
		List<Integer> ll = new LinkedList<>();
		ll.add(1150);
		ll.add(20);
		ll.add(30);
		ll.add(40);
		ll.add(50);
		Sort(ll);
		System.out.println(ll);

//		Collections.sort(ll, new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return o1.compareTo(o2);
//            }
//        });
		
	}
	public static void bubbleSort(List<Integer> ll) {
        int n = ll.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (ll.get(j) > ll.get(j + 1)) {
                    
                    int temp = ll.get(j);
                    ll.set(j, ll.get(j + 1));
                    ll.set(j + 1, temp);
                }
            }
        }
    }
	public static void Sort(List<Integer> ll) {
        int n = ll.size();
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if (ll.get(i) > ll.get(j)) {
                    
                    int temp = ll.get(j);
                    ll.set(j, ll.get(i));
                    ll.set(i, temp);
                }
            }
        }
    }
	

}
