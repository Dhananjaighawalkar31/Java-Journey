package inheritancetemp;

import inheritanceOOPStwo.Vehicle;

public abstract class truck extends Vehicle {
	public truck(int maxSpeed) {
		super(maxSpeed);
		// TODO Auto-generated constructor stub
	}

	int maxLoadingCapacity;
	
	public void printTruck() {
		System.out.println("Vehicle" + " color " + getColor() + " maxspeed " + maxSpeed + " maxLoadingCapacity " + maxLoadingCapacity);
	}


}
