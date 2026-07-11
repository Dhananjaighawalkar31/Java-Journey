package RuntimePolymorphism;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		
		
		Animal animal ;

		System.out.print("would you like a dog or a cat? (1 = dog, 2 = cat)");
//		Dog dog = new Dog();
//		Cat cat = new Cat();
		int choice  = scanner.nextInt();
		
		if(choice == 1) {
			animal = new Dog();
			animal.speak();
		}
		else if(choice == 2){
			animal = new Cat(); 
			animal.speak();
		}
		
	}

}
