package collectionsStack;

import java.util.Stack;

public class J002 {
	public static void main(String[] args) {
		String[] a = {"101","20","3","+","2","1","-","*","/"};
		Stack<String> stk = new Stack<>();
		for(int i = 0;i<a.length;i++) {
			if(!a[i].equals("+") && !a[i].equals("-") && !a[i].equals("*") && !a[i].equals("/")) {
				stk.push(a[i]);
			}
			int sum = 0;
			
			
			if(a[i].equals("+")){
				int x = Integer.parseInt(stk.pop());
				int y = Integer.parseInt(stk.pop());
//				sum = x+y;
				String k = (x+y+"");
				stk.push(k);
			}
			else if(a[i].equals("-")) {
				int x1 = Integer.parseInt(stk.pop());
				int y1 = Integer.parseInt(stk.pop());	
				
				String k1 = (y1-x1+"");
				stk.push(k1);
				
			}
			else if(a[i].equals("*")) {
				int x2 = Integer.parseInt(stk.pop());
				int y2 = Integer.parseInt(stk.pop());		
				String k2 = (y2*x2+"");
				stk.push(k2);
				
			}
			else if(a[i].equals("/")) {
				int x3 = Integer.parseInt(stk.pop());
				int y3 = Integer.parseInt(stk.pop());		
				String k3 = (y3/x3+"");
				stk.push(k3);
				
			}
			
			System.out.println(stk);
		}
		System.out.print("final ans ");
		System.out.println(stk);
	}
}
