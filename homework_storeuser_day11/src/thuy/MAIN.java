package thuy;

import java.io.IOException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

import thuy.dto.User;
import thuy.service.Course;

public class MAIN {
	public static void main(String[] args) {

		final int BACK_END = 1;
		final int FRONT_END = 2;

		Course course = null;

		ArrayList<User> usersList = null;

		while (true) {
			// YEU CAU NGUOI DUNG CHON KHOA HOC
			int selectedCourse = selectCourse();

			course = Course.courseCreation(selectedCourse);

			course.showWelcome();

			// FE
			usersList = course.readDataFile();

			// SHOW STUDENT LIST
//			course.printUserList(usersList);

			thuy.service.Utils.printClass(usersList);

//			// YEU CAU NGUOI DUNG NHAP INPUT
//			String userName;
//			String userMobile;
//			String userDOB;
//			System.out.println("Please fill in your details: ");
//			Scanner scanInput = new Scanner(System.in);
//			System.out.println("Your name: ");
//			while (true) { // verify user input
//				if (scanInput.hasNextLine()) {
//					userName = scanInput.nextLine();
//					break;
//				} else {
//					System.out.println("Invalid input.Please try again:");
//					scanInput.next();
//				}
//			}
//
//			System.out.println("Your mobile number: ");
//			while (true) { // verify user input
//				if (scanInput.hasNextLine()) {
//					userMobile = scanInput.next();
//					break;
//				} else {
//					System.out.println("Invalid input.Please try again:");
//					scanInput.next();
//				}
//			}
//
//			System.out.println("Your DOB: ");
//			while (true) { // verify user input
//				if (scanInput.hasNextLine()) {
//					userDOB = scanInput.next();
//					break;
//				} else {
//					System.out.println("Invalid input.Please try again:");
//					scanInput.next();
//				}
//			}
//
//			// VALIDATE USER INPUT XEM DA REGISTER HAY CHUA?-->CHECK TEN, DOB,MOBILE
//			// NEU CHUA REGISTER THI TAO OBJECT USER MOI VOI THONG TIN DA INPUT
//			if (validateUserRegistration(User.objectList, userName, userMobile, userDOB) == true) {
//				new User(userName, userMobile, userDOB);
//
//				// RECORD USER DETAILS VAO FILE THONG QUA METHOD CUA COURSE
//				course.writeDataFile(list);
//
//				// PRINT STUDENT LIST OF THE CHOSEN COURSE
//				User.printUserList();
//			}
		}
	}

//	public static boolean validateUserRegistration(ArrayList<User> objectList, String userName, String userMobile,
//			String userDOB) {
//		for (User user : User.objectList) {
//			if (user.name.equals(userName) && user.mobile.equals(userMobile) && user.date.equals(userDOB)) {
//				System.out.println("You have already registered for this course! Check the student list again");
//				return false;
//			}
//		}
//		return true;
//	}

	public static int selectCourse() {
		System.out.println("Please select your course : ");
		System.out.println(" 1. Back End ");
		System.out.println(" 2. Front End ");
		Scanner userInput = new Scanner(System.in);
		int selectedCourse = 0;
		while (true) { // verify user input
			if (userInput.hasNextInt()) {
				selectedCourse = userInput.nextInt();
				while (selectedCourse < 1 || selectedCourse > 2) { // update EconomyService, selectedRoute now has 3
																	// options
					System.out.println("Invalid input.Please try again:");
					selectedCourse = userInput.nextInt();
				}
				break;
			} else {
				System.out.println("Invalid input.Please try again:");
				userInput.next();
			}
		}
		return selectedCourse;
	}

}
