package Generics;

public class Main {
	public static void main(String[] args) {
//	Box<Integer> box = new Box<>();
//	
//	box.setItem(3);
//	
//	System.out.println(box.getItem());
		
		product<String, Double> product1 = new product<>("apple", 50.0);
		product<String, Integer> product2 = new product<>("ticket", 500);
		
		System.out.println(product2.getItem());
		System.out.println(product2.getPrice());
}
}