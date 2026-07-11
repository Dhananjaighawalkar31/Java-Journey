package recursionOne;
public class RecursiveCount{ 
	public static int rec(int n) {
		if(n == 0) {
			return 0;
		}
		int small = rec(n/10);

		return small += 1;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 3783490;
		int result = rec(n);
		System.out.println(result);




	}

}
