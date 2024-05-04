package b6_java_homework_Day_7;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Bai_1_EASY_DistinctArrayGenerator {

	public static int[] generateUniqueArray() {
		
		
        int[] array = new int[4];
        
       // HashSet is built-in data type with no duplicate value in array.
        Set<Integer> set = new HashSet<>();
        Random random = new Random();
        do
        {
        	set.clear(); // Clear the HASHSET to [] IF it not valid.
	        for (int i = 0; i < 4; i++) {
	            int randomNumber;
	            
	            do {
	            	// generate the random element from 1->10 include the negative number
	            	randomNumber = random.nextInt(21) - 10;// Adjust this range as per your requirement
	            } while (set.contains(randomNumber));
	            // Hashset.contains() method to set contain the value or NOT.
	            
//	            System.out.print("HashSet: " + randomNumber + "\n");
	            
	            array[i] = randomNumber;
	            set.add(randomNumber);
	        }
        }while(sumArrayIsNotZero(array)); // end loop if sum = 0
        
        
        // Check the array SUM is 0 or NOT if NOT - generate other array. -- sumArrayIsZero

        return array;
        
        
    }
	
	public static boolean sumArrayIsNotZero(int[] array) {
		
		int sum = 0;
		
		for(int i=0 ; i < array.length; i++) {
			sum += array[i];
		}
		
		if(sum != 0) {
			return true;
		}
		return false;
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("---------- Bai_1_EASY_DistinctArrayGenerator --------------------");
		int[] uniqueArray = generateUniqueArray();
        System.out.println("Unique Array with Sum is 0:");
        for (int num : uniqueArray) {
            System.out.print(num + " ");
        }
		
	}

}
