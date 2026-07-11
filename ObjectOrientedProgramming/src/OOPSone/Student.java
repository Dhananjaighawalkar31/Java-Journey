package OOPSone;

public class Student {
	public String name;
	final private int rollNumber ;
	double cgpa;
	public final static double CONVERSIONFACTOR = 0.95;
	private static int numStudents;
	
	public Student(String name){
		this.name = name;
		numStudents++;
		this.rollNumber = numStudents;
		
	}
//	public Student(String n){
//		name = n;
//		this.rollNumber = numStudents;
//	}
	public Student() {
		name = "abc";
		numStudents++;
		this.rollNumber = numStudents;
	}
	public static int getNumStudents() {
//		System.out.println(rollNumber);
		return numStudents;
	}
	
	public void print() {
		System.out.println(name + " " + rollNumber);
	}
	public int getRollNumber() {
		return this.rollNumber;
	}
	
	public void setRollNumber(int rollNumber) {
		if(rollNumber <= 0) {
			return;
		}
		System.out.println("this" + this);
		
		}
}
