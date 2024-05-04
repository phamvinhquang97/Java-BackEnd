package b6_java_homework_course_oop_day_7;
import java.util.Scanner;
import java.util.ArrayList;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(" ------------- Welcome !!! STUDENT SIGN IN APP ----------------- ");
		
		// create the student object
		Student student1 = new Student("Alice", 101);
		Student student2 = new Student("Bob", 102);
		Student student3 = new Student("Charlie", 103);
		Student student4 = new Student("Jess", 104);
		
		// create the list of Student
		ArrayList<Student> defaulStudentList = new ArrayList<>();
		defaulStudentList.add(student1);
		defaulStudentList.add(student2);
		defaulStudentList.add(student3);
		defaulStudentList.add(student4);
		
		// Create the course object
		Course BE6 = new Course(1,"BE6", "2024-02-01", "2024-03-09", "Dung", defaulStudentList);
		Course DATA6 = new Course(2,"DATA6", "2024-02-01", "2024-03-09", "Hai", defaulStudentList );
		Course FE1 = new Course(3,"FE1", "2024-02-01", "2024-03-09", "Phuc", defaulStudentList);
		Course FullStack = new Course(4,"FullStack", "2024-02-01", "2024-03-09", "Dung and Phuc", defaulStudentList);
		

		
		
        


		
		BE6.displayCourseInfo();
//		DATA6.displayCourseInfo();
//		FE1.displayCourseInfo();
//		FullStack.displayCourseInfo();
		
		// Create the course list object
		CourseList codingMentorCourseList = new CourseList();
		// Add the course to the course list
		codingMentorCourseList.addCourse(BE6);
		codingMentorCourseList.addCourse(DATA6);
		codingMentorCourseList.addCourse(FE1);
		codingMentorCourseList.addCourse(FullStack);
		
		// Display the course list
		codingMentorCourseList.displayAllCourses();
		
		
		// Select the course
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the index of the course you want to select (or 0 to exit): ");
        int selectedCourse = scanner.nextInt();
        int userOption;
        do {
        	switch(selectedCourse) {
        		case 1: 
        			userOption = BE6.displayCourseOption(BE6);

        			BE6.actionUserOption(userOption);
        			break;
        		case 2: 
        			userOption = DATA6.displayCourseOption(DATA6);
        			
        			break;
        		case 3: 
        			userOption = FE1.displayCourseOption(FE1);
        			break;
        		case 4: 
        			userOption = FullStack.displayCourseOption(FullStack);
        			break;
        	}
        	
        		
        	
        	
        }while(selectedCourse != 0);
		
	}

}
