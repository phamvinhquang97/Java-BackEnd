package b6_java_homework_course_oop_day_7;
import java.util.ArrayList;


public class CourseList {
	// ----- Attribute -----------
	ArrayList<Course> courses;
	
	
	// ------ Method -------
	
	// METHOD - Add the course to course to course list
	public void addCourse(Course course) {
		courses.add(course);
	}
	
	 public CourseList() {
	        this.courses = new ArrayList<>();
	 }
	
	
	// METHOD - Display all of the course
	public void displayAllCourses() {
		System.out.println("---------------------------");
        if (courses.isEmpty()) {
            System.out.println("No courses available.");
        } else {
            System.out.println("List of Courses:");
            for (Course course : courses) {
                System.out.println(course.id + "." + course.name);
                
            }
        }
    }
}
