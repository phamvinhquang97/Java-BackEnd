package be6_Java_Algorithms;

public class Sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] unsortArray = {1, 2, 2, 0, 0, 1, 2, 2, 1};
		System.out.print("Array before sort: ");
		printArray(unsortArray);
		int[] result = new int[unsortArray.length];

		int[] counts = countFrequency(unsortArray);
        
        // Add 0,1,2 based on the frequency time.
		
        int index = 0;
        // Add 0
        for (int i = 0; i < counts[0]; i++) {
            result[index++] = 0;
        }

        // Add 1
        for (int i = 0; i < counts[1]; i++) {
            result[index++] = 1;
        }

        // Add 2
        for (int i = 0; i < counts[2]; i++) {
            result[index++] = 2;
        }
        System.out.print("\nArray after sort : ");
        printArray(result);
        
        System.out.println( "\nThe time complexity will be O(n + n + n ) -> O(N)");
	}
	
	
	
	public static void printArray(int[] array) {
        // Iterate through the array and print each element
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println(); // Print a newline after printing all elements
    }

    public static int[] countFrequency(int[] array) {
        int[] counts = new int[3]; // Array to store counts for 0, 1, and 2

        // Iterate through the array to count occurrences
        for (int num : array) {
            if (num == 0) {
                counts[0]++;
            } else if (num == 1) {
                counts[1]++;
            } else if (num == 2) {
                counts[2]++;
            }
        }

        return counts;
    }
}
