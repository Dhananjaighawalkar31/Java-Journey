package Composition;

public class Main {

	public static void main(String[] args) {
		Car car = new Car("Corvette", 2025, "v8");
		System.out.println(car.model);
		System.out.println(car.year);
		System.out.println(car.engine.type);
		
		car.start();
	}

}
