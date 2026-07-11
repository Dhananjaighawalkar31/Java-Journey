package collectionsStack;

import java.util.Enumeration;
import java.util.Vector;

//. Create a Java Application where we need to create a Vector class Object by using 
//Integer as its Generic type. Add few elements to it, replace the second element with 
//a new element, add a new element at third index, then remove first and last 
//element and then iterate through all the elements by using Legacy methods only.
public class J001Vector {

	public static void main(String[] args) {
		
		Vector<Integer> v = new Vector<Integer>();
		v.addElement(10); 
		v.addElement(20); 
		v.addElement(30); 
		v.addElement(40); 
		v.addElement(50);

		v.setElementAt(199, 1);
		v.insertElementAt(100, 2);
		
		
		v.removeElementAt(0);
		v.removeElementAt(v.size()-1);
		Enumeration<Integer> v1 = v.elements();
		
		while(v1.hasMoreElements()) {
			System.out.println(v1.nextElement());
		}
		System.out.println(v);
		
	}

}
