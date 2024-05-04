package b6_java_homework_Day_3;

import java.util.Arrays;
import java.util.Scanner;

public class FindSingleNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("HOMEWORK - Find Single Number");
		int [] myArray = initializeArray();
		// print the initialize array
		printArray(myArray);
		findNumberDisplaySingleTime(myArray);
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
	public static void printArray(int[] array ) {
		System.out.print("The array is: ");
	    for(int i = 0; i < array.length; i++) {
	        System.out.print(array[i] + " ");
	    }
	    System.out.println("\n");
	}
	
	// Find which one is display in single time
	
	public static void findNumberDisplaySingleTime(int[] array) {
		 int [] arrayForCheck = new int[array.length];
		 int countDisplayTime = 0;
		 // copy array to new array to consider

		for (int i = 0; i < arrayForCheck.length; i++) {
			arrayForCheck[i] = array[i];
		}		 

		 printArray(arrayForCheck); // print the oppositeArray
		
		 // check the num in array and return the result
		 for (int i = 0; i < array.length; i++) {
			 for (int j = 0; j < arrayForCheck.length; j++) {
				 	if(array[i] == arrayForCheck[j])
				 	{
				 		countDisplayTime++;
				 	}
				}
			 if(countDisplayTime == 1) {
				 System.out.println(array[i] + " is display single time");
			 }
			 else {
				 countDisplayTime = 0;
			 }
		}	
		 
		
		 
		 
		 
	}
}
