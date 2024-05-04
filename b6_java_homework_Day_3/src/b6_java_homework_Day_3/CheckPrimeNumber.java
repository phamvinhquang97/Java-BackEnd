package b6_java_homework_Day_3;
import java.util.Scanner;

public class CheckPrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("-----------Homework - CHECK PRIME NUMBER -------");
		
		// user input
		int integerNumber = userInput();
		isPrimeNumber(integerNumber);
		
		// check it Prime number or not 
	}
	
	// user input - ask user input again if they input invalid number
	public static int userInput() {
		Scanner scanner = new Scanner(System.in);
		boolean userInputIsValid = false;
		int numberUserInput = 0;
		while(!userInputIsValid) {
			System.out.print("Please input integer number: ");
			// hasNextInt() --> return true if user input is integer.
			if(scanner.hasNextInt()) {
				numberUserInput = scanner.nextInt();
				System.out.println("Pass! You entered an integer");
				userInputIsValid = true;
			}else {
				String input = scanner.next();
	            System.out.println("You did not enter an integer");
			}
		}
		scanner.close();
		return numberUserInput;
	}
	
	// check isPrime number or not -- divide from 2 to 9
	public static void isPrimeNumber(int integerNumber) {
		for(int i = 2; i < (integerNumber-1); i++) {
			System.out.println(i);
			if(integerNumber % i == 0 && integerNumber != 2) {
				System.out.println(integerNumber + " is a NOT Prime Number");
				break;
			}else {
				System.out.println(integerNumber + " is Prime Number");
				break;
			}
			
		}
	}
	

}
