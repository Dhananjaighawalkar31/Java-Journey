package functions;

public class divideNum {
	public static int divNum(int num, int den) {
		if(den == 0) {
			return Integer.MIN_VALUE;
		}return num / den;
	}
	
	public static void div(int num, int den) {
		
		if (den == 0) {
			System.out.println("cant be printed");
			return;
		}
		System.out.println(num / den);
	}

	public static void main(String[] args) {
		int num = 8;
		int den = 0;
		div( num , den );
//		int result = divNum(num , den);
//		System.out.println(result);

	}

}
