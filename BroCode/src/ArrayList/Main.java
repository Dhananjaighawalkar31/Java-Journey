package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
//		ArrayList<Integer> list = new ArrayList<>();
//		
//		list.add(3);
//		list.add(6);
//		list.add(2);
//		
//		System.out.println(list.get(0));

		Scanner s =new Scanner(System.in);
		
		ArrayList<String> foods = new ArrayList<>();
		System.out.println("Enter the # of food you would like : ");
		int numOffood = s.nextInt(); 
		s.nextLine();
		
		for(int i = 1; i<= numOffood;i++) {
			System.out.println("Enter food #0" + i + ": ");
			String food = s.nextLine();
			foods.add(food);
			
			
		}
 		System.out.println(foods);
		s.close();
		
		
		
	}

}
