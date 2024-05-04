package b6_java_homework_Day_3;
import java.util.Arrays;
import java.util.Scanner;  

public class homework_Day3 {

	public static void main(String[] args) {
		System.out.println("Welcome to Palindorme App !!!");
		
		int [] array = initializeArray();
		// print the initialize array
		printArray(array, "initialize");
		
		// check array is Palindrome or NOT
		isPalindrome(array);
		
	}
	
	// function create the array
	public static int[] initializeArray() {
		// user input array
		Scanner scanner = new Scanner(System.in);
		// declare the integer array
		System.out.print("Please input you array length: ");
		int arrayLength = scanner.nextInt();
				
		int[] newArray = new int[arrayLength];
				
		for(int i = 0; i < arrayLength; i++) {
			System.out.print("Please enter element " + (i+1) + ": ");
			newArray[i] = scanner.nextInt();
		}
		return newArray;
	}
	
	// function print the array
	public static void printArray(int[] array, String arrayType ) {
		System.out.print("The " + arrayType + " array is: ");
	    for(int i = 0; i < array.length; i++) {
	        System.out.print(array[i] + " ");
	    }
	    System.out.println("\n");
	}
	
	// check array is Palindrome or NOT
	public static void isPalindrome(int[] array) {
		 int [] oppositeArray = new int[array.length];
		 
		 for(int i = (array.length-1), j = 0; i >= 0; i--, j++) {
//			 System.out.print(array[i]);
			 oppositeArray[i] = array[j]; 
		 }

		 printArray(oppositeArray, "opposite"); // print the oppositeArray
		 
		 // compare the both of the array by using Arrays.equals function AND "PRINT RESULT"
		 boolean isBothArrayEqual = Arrays.equals(array, oppositeArray);
		 System.out.println("-------- RESULT ----------");
		 if(isBothArrayEqual) {
			 System.out.println("The array is Palindorme");
		 } 
		 else  System.out.println("The array is NOT Palindorme");
		 
		 
		 
	}

}
