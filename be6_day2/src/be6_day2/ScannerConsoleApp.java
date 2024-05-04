package be6_day2;
import java.util.Scanner;
import java.lang.Math; // import Math

import java.util.Scanner;

public class ScannerConsoleApp {

	public static void main(String[] args) {
			
			// ------------ Grade Application --------
		
		// declare variable and user input 3 subject 
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input your math: ");
		float mathGrade = scanner.nextFloat();
			
		System.out.print("Input your english: ");
		float englishGrade = scanner.nextFloat();
		
		System.out.print("Input your literature: ");
		float literatureGrade  = scanner.nextFloat();
		
		// calculate AVERAGE of 3 subject and round until 2 decimal
		float averageGrade = (float) (Math.round((mathGrade + englishGrade + literatureGrade)/3 * 100)) / 100;  
		System.out.println("Grade Average: " + averageGrade);
		
		boolean isFail = mathGrade < 5 || englishGrade < 5 || literatureGrade < 5; // check mark "FAIL" or "NOT"
		
		// compare averageGrade with each subject -> Add one rate if the averageGrade any subject.
		if(averageGrade > mathGrade && isFail != true) {
			averageGrade = mathGrade + 1 ;
		} 
		else if(averageGrade > englishGrade &&  isFail != true){
			averageGrade = englishGrade + 1;
		}
		else if( averageGrade > literatureGrade &&  isFail != true) {

			averageGrade = literatureGrade + 1;
		} else averageGrade = 4;
//		else if(averageGrade)
		
		// PRINT THE GRADE TYPE RESULT
		char type = printTypeOfAverageGrade(averageGrade,'O');
		System.out.println("You Grade Type: " + type);
			
	}
	
	// functional program -> return type
	static char printTypeOfAverageGrade(float grade, char type) { 
		switch((int) grade) {

			case 0,1,2,3,4:
				type = 'F';
		        break;
		    case 5:
		    	type = 'D';
		        break;
		    case 6:
		    	type = 'C';
		        break;
		    case 7:
		    	type = 'B';
		        break;
		    case 8:
		    	type = 'A';
		        break;
		    case 9,10,11:
		    	type = 'S';
		        break;
		       
		}
		return type;
		
	}
	
	

}
