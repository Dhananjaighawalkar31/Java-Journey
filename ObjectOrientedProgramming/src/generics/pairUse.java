package generics;

public class pairUse {

	public static void main(String[] args) {
		Pair<String,String> p = new Pair<String,String>("ab", "cd");
		p.setFirst("def");
		String s = p.getfirst();
		
		Pair<Integer,String> p1 = new Pair<Integer,String>(1, "temp");
		Pair<Character,Character> p2 = new Pair<>('a','c');
		
		
		int a = 10;
		int b = 12;
		int c = 23;
		
		Pair<Integer, Integer> internalPair = new Pair<>(a, b);
		Pair<Pair<Integer,Integer>,Integer> p3 = new Pair<>(internalPair, c);
		
		System.out.println(p3.getSecond());
		System.out.println(p3.getfirst().getfirst());
		System.out.println(p3.getfirst().getSecond());
	}

}
