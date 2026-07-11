package collectionsArrayList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class J07 {

	public static void main(String[] args) {
		Student s1 = new Student(101,"dhanu",97);
		Student s2 = new Student(102,"virat",67);
		Student s3 = new Student(103,"rohit",37);
		Student s4 = new Student(104,"rahul",98);
		Student s5 = new Student(104,"karan",100);

		ArrayList<Student> obj = new ArrayList<Student>();
		obj.add(s1);
		obj.add(s2);
		obj.add(s3);
		obj.add(s4);
		obj.add(s5);
		System.out.println(obj);
		
		
//		for (int i = 0; i < obj.size(); i++) {
//            for (int j = i + 1; j < obj.size(); j++) {
//                if (obj.get(i).getStudentID() > obj.get(j).getStudentID()) {
//                    Student temp = obj.get(i);
//                    obj.set(i, obj.get(j));
//                    obj.set(j, temp);
//                }
//            }
//        }
//
        System.out.println("After sorting:");
        Collections.sort(obj);
        System.out.println(obj);
        System.out.println("After reverse sorting:");
//        reverseList(obj);
        System.out.println(obj);
        
		
	}
//	public static void reverseList(List<Integer> list) {
//        int left = 0;
//        int right = list.size() - 1;
//        while (left < right) {
//            // Swap elements at left and right indices
//            int temp = list.get(left);
//            list.set(left, list.get(right));
//            list.set(right, temp);
//            left++;
//            right--;
//        }
//    }

	
}
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