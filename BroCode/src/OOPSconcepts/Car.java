package OOPSconcepts;

public class Car {
	String make = "Ford";
	String model = "Mustang";
	int year = 2013;
	double price = 543454;
	boolean isRunning = false;
	
	void start() {
		isRunning = true;
		System.out.println("you start the engine");
	}
	void stop() {
		isRunning = false;
		System.out.println("you stop the car");
	}
	void drive() {
		System.out.println("you drive the " + model);
	}
	void brake() {
		System.out.println("you brake the " + model);
	}
	
	
	
}
