package thuy.service;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import thuy.dto.User;

public abstract class Course {

	public String fileName;

	public abstract void showWelcome();

	public ArrayList<User> readDataFile() {
		try {
			ArrayList<User> list = new ArrayList<User>();
			File file = new File(fileName);
			Scanner scanInput;

			scanInput = new Scanner(file);

			while (scanInput.hasNextLine()) {
				String data = scanInput.nextLine();
				String[] elArray = data.split(",");
				User user = new User(elArray[0].trim(), elArray[1].trim(), elArray[2].trim());
				list.add(user);
			}
			return list;

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

	static public Course courseCreation(int selectedCourse) {

		if (selectedCourse == 2) {
			return new FrontEndCourse("fe.csv");
		} else {
			return new BackEndCourse("be.txt");
		}

	}

	public abstract void writeDataFile(ArrayList<User> list);

}