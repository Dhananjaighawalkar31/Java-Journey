package recursionOne;

public class printN {
	
	    public static void print(int n) {
	    	if(n == 1) {
	    		System.out.println(" " + n);
	    		return;
	    	}
	    	print(n-1);
	    	System.out.println(n + " ");
			
	    }
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int n = 4;
			print(n);
			
			
		}

	

}
