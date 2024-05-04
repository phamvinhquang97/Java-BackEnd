package b6_java_homework_course_oop_day_7;
import java.util.Date;
import java.util.Scanner;
import java.util.ArrayList;


public class Course {
	
	//  ------------ Attribute --------------- 
	int id;
	String name;
	String dateFrom;
	String dateTo;
	String mentor;
	int numOfRegisteredStudents;
	ArrayList<Student> students; // course contain the list of student
	
	//  ------------ constructor ----------------------
	public Course(int id, String name, String dateFrom, String dateTo, String mentor, ArrayList<Student> students) {
        this.id = id;
		this.name = name;
        this.dateFrom = dateFrom;
        this.dateTo = dateTo;
        this.mentor = mentor;
        this.students = students;
        this.numOfRegisteredStudents = students.size();
        
    }
	
	
	// getter and setter

    // Getters and setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateFrom() {
        return dateFrom;
    }

    public void setDateFrom(String dateFrom) {
        this.dateFrom = dateFrom;
    }

    public String getDateTo() {
        return dateTo;
    }

    public void setDateTo(String dateTo) {
        this.dateTo = dateTo;
    }

    public String getMentor() {
        return mentor;
    }

    public void setMentor(String mentor) {
        this.mentor = mentor;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }
	
	// ---------- Method ---------------
	
	// add the student to the course list
	public void addStudent(Student student) {
		students.add(student);
		numOfRegisteredStudents++; // add one in register list if add new student
	}
	
	 // display the list of students in the course
	 public void displayListOfStudent()
	 {
		 System.out.println("Number of Registered Students: " + this.numOfRegisteredStudents);
		 for (Student student : students) {
	            System.out.println(student.CCCD + " - " + student.name);
	        }
	 }
	 
	 	// Display the course information
	 public void displayCourseInfo() {
		 	
	        System.out.println("Course Name: " + name);
	        System.out.println("From Date: " + dateFrom);
	        System.out.println("To Date: " + dateTo);
	        System.out.println("Mentor: " + mentor);
//	        System.out.println("Number of Registered Students: " + numOfRegisteredStudents);
	        this.displayListOfStudent();
	 }
	 

	// Display the option for course
	public int displayCourseOption(Course course) {
		 System.out.println("--------------- You are selected " + course.name + "---------------");
		  // Give the option to enroll, withdraw, or go back

        
         System.out.println("1. Enroll");
         System.out.println("2. Withdraw");
         System.out.println("3. Back to course list selection");
         System.out.println("4. Display all the student");
         Scanner scanner = new Scanner(System.in);
         System.out.print("Choose an option:");
		 int selectedOption = scanner.nextInt();
         return selectedOption;
         
	}
	
	
	public void actionUserOption(int userOption) {
		
		if(userOption == 1) {
			// ask user input the student name
			Scanner scanner = new Scanner(System.in);
			System.out.print("Enter the name of the student: ");
	        String name = scanner.nextLine();
	        
			// ask the user input the CCCD
	        System.out.print("Enter the CCCD of the student: ");
	        int CCCD = scanner.nextInt();
	        
	        Student newStudent = new Student(name, CCCD);
	        
	        
			// check the student is existing by compare CCCD
	        
	        // add the new student in the List
	        this.addStudent(newStudent);
	        
	        // display the new list of student
			this.displayListOfStudent();
		}
		
		if(userOption == 2) {
			Scanner scanner = new Scanner(System.in);
			System.out.print("Enter the CCCD of the student to remove: ");
			int userInputCCCDDelete = scanner.nextInt();
			// find the CCCD in the list and delete it
			for (Student student : students) {
				System.out.println(student.CCCD);
	            if(userInputCCCDDelete == student.CCCD)
	            {
	            	
	            	students.remove(student);
	            	
	            	numOfRegisteredStudents--;
	            }
	           
	        }
			
			// display the list of student again 
			this.displayListOfStudent();
			
			
		}
		
		if(userOption == 4)
		{
			 System.out.println("The List Of Studnet for " + this.name + " is:" );
			this.displayListOfStudent();
		}
	}
}


