package inheritanceOOPStwo;

import generics.PrintInterface;

public final class Vehicle implements PrintInterface{
	private String color;
	public int maxSpeed;
	public Vehicle(int maxSpeed) {
		System.out.println("Vehicle's constructor");
		this.maxSpeed = maxSpeed;
	}
	
	public String getColor() {
		return color;
	}
//	public abstract boolean isMotorized();
	public void setColor(String color) {
		this.color = color;
	}
	
	public final void print() {
		System.out.println("Vehicle" + " color " + color + " maxspeed " + maxSpeed);
	}
}
