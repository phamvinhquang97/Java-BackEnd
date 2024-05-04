package be6_java_oop_student_registration_app;
import java.util.Date;
import java.util.Scanner;



public class OOPMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create the course object
		Course course1 = new Course("BE6", "2024-02-01", "2024-03-09", "Dung", 0);
		Course course2 = new Course("DATA6", "2024-02-01", "2024-03-09", "Hai", 0 );
		Course course3 = new Course("FE1", "2024-02-01", "2024-03-09", "Phuc", 0);
		Course course4 = new Course("FullStack", "2024-02-01", "2024-03-09", "Dung and Phuc", 0);
		
		// field
		Course[] courseList = {course1, course2,course3, course4};
		
		
		// show course list and get user selection
//		int selectedCourse = showCourseListAndGetSelectedCourse(courseList);
		
		// show course detail based on user selection
//		int option = showCourseAndGetUserSelectedOption(selectedCourse, courseList);
		
		// reduce HARDCODE 
		final int REGISTER = 1; // constant - can not change 
		final int WITHDRAW = 2;
		final int VIEW_COURSE_LIST = 3;
		final int VIEW_STUDENT_LIST = 4;
		
		int option = VIEW_COURSE_LIST; // show course list at the first time
		int courseIndex = 0;
		
		 // switch case
		do {
			switch (option) {
			case VIEW_COURSE_LIST: {
				courseIndex = showCourseListAndGetSelectedCourse(courseList);
				option = showCourseAndGetUserSelectedOption(courseIndex, courseList);
				break;
			}
			
			case VIEW_STUDENT_LIST: {
				showStudent(courseIndex, courseList);
				option = showCourseAndGetUserSelectedOption(courseIndex,courseList);
				break;
			}
			
			case REGISTER: {
				register(courseIndex, courseList);
				option = showCourseAndGetUserSelectedOption(courseIndex,courseList);
				break;
			}
			case WITHDRAW: {
				withdraw();
				option = showCourseAndGetUserSelectedOption(courseIndex,courseList); 
				break;
			}
		
			default:
				break;
			}
		}while(true);
		

		
		
	}
	
	// Register function
	public static void register(int index, Course[] courseList) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input id:");
		String id = scanner.nextLine();
		System.out.print("Input name:");
		String name = scanner.nextLine();
		System.out.print("Input phone:");
		String phone = scanner.nextLine();
		
		Student student = new Student(id,name, phone);
		
		courseList[index].studentList.add(student);
		
		System.out.println("Registered SUCCESSFULLY");
		
	}
	
	public static void withdraw() {
		System.out.println("Withdraw");
	}
	
	public static void showStudent(int index, Course[] courseList) {
		System.out.println("This is student list:");
		courseList[index].showStudent();
	}
	
	public static int showCourseAndGetUserSelectedOption(int index, Course[] courseList) {
		System.out.println(courseList[index].toString());
		System.out.println("Please select one option");
		System.out.println("1. Register");
		System.out.println("2. Withdral");
		System.out.println("3. Back to course list");
		System.out.println("4. View student of this course");
		System.out.println("Please select an opton !!!");
		Scanner scanner = new Scanner(System.in);
		return scanner.nextInt(); // user select 2 mean course[1] index
	}
	
	
	// show course list and get the user input
	public static int showCourseListAndGetSelectedCourse(Course[] courseList) {
		
		System.out.println("Course List: ");
		for(int i = 0; i < courseList.length; i++) {
			System.out.println(i + 1 + ":" + courseList[i].name);
		}
		
		System.out.println("Please select a course view detail !!!");
		Scanner scanner = new Scanner(System.in);
		return scanner.nextInt() - 1; // user select 2 mean course[1] index
	}

}
