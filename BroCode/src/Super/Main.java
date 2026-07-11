package Super;

public class Main {
	public static void main(String[] args) {
		Person person = new Person("dhanu", "ghaw");
		
		Student student = new Student("virat", "kohli", 3.23);
		student.showName();
		System.out.println(student.gpa);
		student.showGPA();
		
		Employee employee = new Employee("rohit", "sharma" , 123434344);
		employee.showSalary();
	}
}
