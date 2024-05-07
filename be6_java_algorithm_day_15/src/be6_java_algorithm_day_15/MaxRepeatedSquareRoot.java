package be6_java_algorithm_day_15;

public class MaxRepeatedSquareRoot {

	public static void main(String[] args) {
        int l = 6000, r = 7000;
        int max = maxRepeatedSquareRoot(l, r);
        System.out.println("Maximum repeated square root between " + l + " and " + r + " is: " + max);
	}
	

    public static int maxRepeatedSquareRoot(int l, int r) {
        int maxCount = 0;
        // Find the start point for the range (reduce the loop)
        int start = (int) Math.ceil(Math.sqrt(l));

        // Iterate through each number from start to r and find the maximum repeated square root
        for (int num = start; num * num <= r; num++) {
            int count = 1;
            double sqrt = Math.sqrt(num);

            // Count the number of repeated square root operations
            while (sqrt % 1 == 0) {
                sqrt = Math.sqrt(sqrt);
                count++;
            }
            maxCount = Math.max(count, maxCount);
        }
        return maxCount;
    }

}
