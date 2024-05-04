package be6_java_homework_day_14;

public class findNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {4, 5, 11, 44, 56, 92, 100}; // sorted Array
//		int findNumber = 0;
		int index = findNumber(11, arr);
		if(index != -1) {
			System.out.println(index);
		} 
		else {
			System.out.println("Can not found value in array");
		}
			
	}
	
	// recursive function -- using Binary Search
	// Assume that this is the sorted Array
	public static int findNumber(int num, int[] arr) {

		return binarySearch(num, 0, arr.length - 1, arr);
			
	}
	
	// Recursive function
	public static int binarySearch(int num, int left, int right,int[] arr) {
		
		if(right >= left) {
			// find the middle value
			int middle = (left + right)/ 2;
			
			// if the element is middle
			if(arr[middle] == num) {
				return middle;
			}
			
			// if the middle > num -> find [0, mid]
			if(arr[middle] > num) {
				
				return binarySearch(num, left, middle - 1, arr); 
			}
			
			// if middle < num -> find [mid, arr.length]
			if(arr[middle] < num) {
				return  binarySearch(num, middle+1 , right, arr);
			}
		}
		
		
		return -1;
		
	}


}


// Time complexity is : O(logN)