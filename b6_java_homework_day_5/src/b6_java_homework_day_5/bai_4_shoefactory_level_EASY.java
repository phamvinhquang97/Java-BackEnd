package b6_java_homework_day_5;


public class bai_4_shoefactory_level_EASY {

    public static void main(String[] args) {
        System.out.println("--- Bai 4 Shoe Factory level EASY ----");
        String shoeSizeInLine = "RLLLRRRLLR";
        System.out.println(shoeSizeInLine);
        solution(shoeSizeInLine);
    }

    public static void solution(String s) {

        // Transfer from String to character array
        char[] shoeSizeInLineArray = s.toCharArray();
        for (char c : shoeSizeInLineArray) {
            System.out.print(c + " ");
        }
        System.out.println(); // Print a newline after printing the array

        // Array to store the breaks
        int[] storeArray = new int[shoeSizeInLineArray.length];

        int i = 0;
        int j = 0;
        int counter = 0;
        while (j < shoeSizeInLineArray.length - 1) {
        	j = i + 1;
        	counter = 1;
            if (counter > 1 && shoeSizeInLineArray[i] != shoeSizeInLineArray[j]) {
            	
                storeArray[j] = 1; // Mark the break with 1
                i = j; // move i to j
            }
            else {
            	counter++;
            }
            
            
            i++; // will remove
        }

        // Printing the storeArray
        for (int k = 0; k < storeArray.length; k++) {
            System.out.print(storeArray[k] + " ");
        }
    }
}