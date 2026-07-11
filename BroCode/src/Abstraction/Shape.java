package Abstraction;

public abstract class Shape {
	abstract double area(); // Abstract (should be implemented by its children)
	
	void display() { //concrete
		System.out.println("this is a shape");
	}
}
