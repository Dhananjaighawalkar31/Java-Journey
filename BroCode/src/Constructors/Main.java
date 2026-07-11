package Constructors;

public class Main {

	public static void main(String[] args) {
//		Student student1 = new Student("spongBob", 30, 3.3);
//		Student student2 = new Student("dhanu", 21,9.2);
//		Student student3 = new Student("randy", 22,9);
//		
//		System.out.println(student1.name);
//		System.out.println(student1.age);
//		System.out.println(student1.gpa);
//		System.out.println(student1.isEnrolled);
//		
//		
//		System.out.println(student2.name);
//		System.out.println(student2.age);
//		System.out.println(student2.gpa);
//		System.out.println(student2.isEnrolled);
//		
//		System.out.println(student3.name);
//		System.out.println(student3.age);
//		System.out.println(student3.gpa);
//		System.out.println(student3.isEnrolled);
		
//		student1.study();
//		student2.study();
//		student3.study();
		
//		User user1 = new User("Spong bob");
//		User user2 = new User("patrick", "dj@gmail.com");
//		User user3 = new User("maya", "asddj@gmail.com",13);
//		User user4 = new User();
//		
//		System.out.println(user4.username);
//		System.out.println(user4.email);
//		System.out.println(user4.age);
//		
//		System.out.println(user1.username);
//		System.out.println(user1.email);
//		System.out.println(user1.age);
//		
//		System.out.println(user2.username);
//		System.out.println(user2.email);
//		System.out.println(user2.age);
//		
//		System.out.println(user3.username);
//		System.out.println(user3.email);
//		System.out.println(user3.age);
		
		Car car1 = new Car(" Mustang", " red");
		Car car2 = new Car(" maruti", " blue");
		Car car3 = new Car(" audi", " black");
		
		Car[] cars = {car1, car2, car3};
		
//		for(int i = 0; i< cars.length;i++) {
//			cars[i].drive();
//		}
		for(Car car : cars) {
			car.drive();
		}
		
		
		
		
	}

}
