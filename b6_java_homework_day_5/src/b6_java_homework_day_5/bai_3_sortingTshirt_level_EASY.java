package b6_java_homework_day_5;
import java.util.Arrays;

public class bai_3_sortingTshirt_level_EASY {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("--- Bai 3 Sorting T-Shirt level Easy ----");
		
		// string array with size of T-shirt
		String tShirtSize = "MSSLS";
		String tShirtSize2 = "LLMS";
		String tShirtSize3 = "SMS";
		
		System.out.println(tShirtSize);
		char[] tShirtSizeArray = orderTShirtSize(tShirtSize);
		System.out.println("Sorted character array:");
        for (char c : tShirtSizeArray) {
            System.out.print(c + " ");
        }
		
	}
	
	public static char[] orderTShirtSize(String tShirtSize) {
		// transfer from String to character array
		char[] tShirtSizeArray = tShirtSize.toCharArray();
        // sort the array
        Arrays.sort(tShirtSizeArray);
        // reverse the array in descending order
        char[] reverseArray = reverseArray(tShirtSizeArray);
        return reverseArray;
	}
	
	// function to reverse the array after sorting.
	public static char[] reverseArray(char[] array) {
		int startPoint = 0;
		int endPoint= array.length - 1;
		// while...loop: 0 - 4 -> 1 - 3 -> ...
		while (startPoint < endPoint) {
			char tempValue = array[startPoint]; // store the value in the temporary value to swap
			array[startPoint] = array[endPoint]; // swap value end to start
			array[endPoint] = tempValue; // pass value tempValue
			startPoint++;
			endPoint--;
		}
		return array;
	}

}
