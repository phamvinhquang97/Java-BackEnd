package be6_day1;
import java.lang.Math; // import Math
import java.util.Scanner;

public class ConsoleApp {
	public static void main(String[] args) {
		
//		// create variable longEdge: value is 5, data type.
//		//STRICT TYPE 
//		int longEdge = 5;
//		int shortEdge = 3;
//		
//		System.out.println(longEdge);
//		
//		int perimeterRectangle =  2 * (longEdge + shortEdge);
//		float square = longEdge * shortEdge;
//		
//
//		System.out.println("perimeter of this rectangle: " + perimeterRectangle);
//		System.out.println("Square: " + square );
		
//	    double number = 1.009;
//	    String formattedNumber = String.format("%.2f", a);
//	    System.out.println(Math.ceil(formattedNumber));
	    
//	    double roundedNumber = Math.ceil(number * 100)/100;
//		
//	    System.out.println(roundedNumber);
//	    
//	    double num = 1902.0;
//        System.out.println("Rounded number: " + Math.ceil(num));
		
        
        
        // ----- Day 2 -----
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("Input your age: ");
//		String name = scanner.nextLine();
//		System.out.println("Your name is: " + name);
//		
//		
//		System.out.println("Input your age: ");
//		int age = scanner.nextInt();
//		System.out.println("Your name is: " + name);
		
		int[] nums = new int[3];
		nums[0] = 12;
		nums[1] = 26;
		nums[2] = 55;
		
		int i =0;
		while(i< nums.length) {
			System.out.println("The value is :" +nums[i]);
			i++;
		}
		
		
	}
}
