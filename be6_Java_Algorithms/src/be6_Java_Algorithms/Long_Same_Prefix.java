package be6_Java_Algorithms;

public class Long_Same_Prefix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Longest Same Prefix");
		String[] stringArray = {"flower", "flow", "flight"};
		printArray(stringArray);
		
		
		// Initialize the common prefix with the first string
		String commonPrefix = stringArray[0];

		for (int i = 1; i < stringArray.length; i++) {
		    String currentString = stringArray[i];
		    int j = 0;
		    // Compare characters of the elemetn in string with the common prefix (first element of Array)
		    while (j < commonPrefix.length() && j < currentString.length() && commonPrefix.charAt(j) == currentString.charAt(j)) {
		        j++;
		    }
		   
		    // look for the place to substring from 0 -> return j
		    commonPrefix = commonPrefix.substring(0,j);
		}
		
		if(commonPrefix.length() != 0)
		{
		
			System.out.println("Common Prefix: " + commonPrefix);
		}else {
			System.out.println("No comon Prefix");
		}
		
		System.out.println("\nTime complexity will O(n^2) because 2 loop");
	}
	
	
	
	public static void printArray(String[] array) {
        // Iterate through the array and print each element
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println(); // Print a newline after printing all elements
    }
}
