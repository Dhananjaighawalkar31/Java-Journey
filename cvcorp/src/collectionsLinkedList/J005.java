package collectionsLinkedList;
import java.util.ArrayList;
import java.util.LinkedList;
public class J005 {

	
	


	    public static LinkedList<Integer> convert(ArrayList<Integer> arrayList) {
	    	
	    	LinkedList<Integer> ll  = new LinkedList<>();
	    	boolean[] b = new boolean[arrayList.size()];
	    	for(int i = 0;i<arrayList.size();i++) {
	    		for(int j = 0;j<arrayList.size();j++) {
	    			if(arrayList.get(i)==arrayList.get(j) && !b[j]) {
	    				ll.add(arrayList.get(i));
	    				b[j] = true;
	    			}
	    		}
	    	}
	    	return ll;
//	        LinkedList<Integer> linkedList = new LinkedList<>();
//	        LinkedList<Integer> helper = new LinkedList<>();
//
//	        
//	        for (Integer num : arrayList) {
//	        	if (!helper.contains(num)) {
//	                helper.add(num);
//	            }
//	        }
//
//	        
//	        for (Integer num : helper) {
//	            int count = 0;
//	            for (Integer n : arrayList) {
//	                if (n == num) {
//	                    count++;
//	                }
//	            }
//	            for (int i = 0; i < count; i++) {
//	                linkedList.add(num);
//	            }
//	        }
//
//	        return linkedList;
	        
	    }

	    public static void main(String[] args) {
	        ArrayList<Integer> arrayList = new ArrayList<>();
	        arrayList.add(7);
	        arrayList.add(2);
	        arrayList.add(1);
	        arrayList.add(8);
	        arrayList.add(7);
	        arrayList.add(2);
	        arrayList.add(7);
	        arrayList.add(1);
	        arrayList.add(8);

	        LinkedList<Integer> linkedList = convert(arrayList);
	        System.out.println(linkedList); // [7, 7, 7, 2, 2, 1, 1, 8, 8]
	    }
	
}
