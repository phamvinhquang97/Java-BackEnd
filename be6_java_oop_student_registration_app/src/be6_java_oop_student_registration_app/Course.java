package be6_java_oop_student_registration_app;
import java.util.Date;
import java.util.ArrayList;

public class Course {
	// attribute
	String name;
	String startDate;
	String endDate;
	String mentor;
	int numOfStudents;
	ArrayList<Student> studentList = new ArrayList<Student>();
	
	// constructor
	public Course(String name, String startDate, String endDate, String mentor,int numberOfStudents) {
		this.name = name;
		this.startDate = startDate;
		this.endDate = endDate;
		this.mentor = mentor;
		this.numOfStudents = numberOfStudents;
	
	}
	
	@Override
	public String toString() {
//		return "Course name:" + name ;
	    return " ----------- Course ------------- \n- name=" + name + "\n- date: " + startDate + " => " + endDate
	    
	    		+ "\n- mentor: " + mentor  
	    		+ "\n- Registered students: " + numOfStudents + " students";
	}
	
	// show Student
	public void showStudent() {
		for(Student student : studentList) {
			System.out.println("student: " + student.name);
		}
	}
}
