package inheritanceOOPStwo;

public class Car extends Vehicle{
	int numDoors;
	int maxSpeed;
	public Car(int numDoors, int maxSpeed) {
		super(maxSpeed);
		System.out.println("Car's constructor");
		this.numDoors = numDoors;
	}
	public void printCar() {
		super.print();
		System.out.println("Car" + " numDoors " + numDoors);
	}
//	@Override
//	public boolean isMotorized() {
//		return false;
//	}
	public void printMaxspeed() {
		super.maxSpeed = 150;
		System.out.println(maxSpeed + " " + super.maxSpeed);
	}
}
