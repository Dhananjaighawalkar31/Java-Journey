package collectionsQueue;


import java.util.PriorityQueue;
import java.util.Queue;
//Create a Java Application where we need to create a PriorityQueue Object with 
//userdefined class as its generic, add n objects to the Object and print the values 
//in ascending order of integers.


class Student implements Comparable<Student>{
	private int studentID;
	private String name;
	private int marks;
	Student(int studentID,String name,int marks){
		this.studentID = studentID;
		this.name = name;
		this.marks = marks;
	}
	void setStudentID(int studentID) {
		this.studentID = studentID;
	}
	void setName(String name) {
		this.name = name;
	}
	void setMarks(int marks)  {
		this.marks = marks;
	}
	int getStudentID() {
        return studentID;
    }
	String getName() {
        return name;
    }
	int getMarks() {
        return marks;
    }

	public String toString() {
		return studentID + "-" + name + "-" + marks;
	}
	@Override
//	public int compareTo(Student o) {
//		if(this.getStudentID()>o.getStudentID()) {
//			return 1;
//			
//		}else if(this.getStudentID()<o.getStudentID()){
//			return -1;
//		}
//		return 0;
//	}
	public int compareTo(Student o) {

		if(this.getMarks()>o.getMarks()) {

			return 1;

			

		}else if(this.getMarks()<o.getMarks()){

			return -1;

		}

		return 0;

	}
}
public class J004 {

	public static void main(String[] args) {
		Student s1 = new Student(101,"dhanu",97);
		Student s2 = new Student(102,"virat",67);
		Student s3 = new Student(103,"rohit",37);
		Student s4 = new Student(104,"rahul",98);
		Student s5 = new Student(104,"karan",100);

		Queue<Student> obj = new PriorityQueue<Student>();
		obj.add(s1);
		obj.add(s2);
		obj.add(s3);
		obj.add(s4);
		obj.add(s5);
		
		
		while(!obj.isEmpty()) {
            System.out.println(obj.poll());
        }

	}

}
