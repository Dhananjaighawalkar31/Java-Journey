package gettesAndSetters;

public class Main {

	public static void main(String[] args) {
		Car car = new Car("maruthi"," red",12572);
		
		
		car.setColor("Blue");
		car.setPrice(-323223);
		
		System.out.println(car.getColor() + " " + car.getModel() + " " + car.getPrice());
	}

}
