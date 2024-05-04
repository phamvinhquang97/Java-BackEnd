package thuy.service;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import thuy.dto.User;

public class FrontEndCourse extends Course {

	public FrontEndCourse(String fileName) {
		super.fileName = fileName;
	}

	@Override
	public void writeDataFile(ArrayList<User> list) {
		FileWriter writer; // moi lan write file thi write tu dau, cac du lieu cua file trc do deu bi
		// delete het
		try {
			writer = new FileWriter("fe.csv");
			for (User student : list) {
				writer.write(student.name + "," + student.mobile + "," + student.date + System.lineSeparator());
			}
			writer.close();
			System.out.println(" Registered successfully!!! ");

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void showWelcome() {
		System.out.println("Welcome to Front End class");

	}

}
