package Interfaces;

public class Rabbit implements Prey{
	//implemented abstract method 
	@Override
	public void flee() {
		System.out.println("the rabbit is running away");
	}
}
