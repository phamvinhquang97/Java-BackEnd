package be6_java_homework_day_14;

public class squareroot {

	public static double squareRoot(double x) {
        if (x == 0 || x == 1) {
            return x;
        }
        
        double start = 0;
        double end = x;
        double precision = 0.01; // precision of the result
        
        if (x < 1) {
            end = 1;
        }
        
        while (end - start > precision) {
            double mid = (start + end) / 2;
            double midSquare = mid * mid;
            if (midSquare == x) {
                return mid;
            } else if (midSquare < x) {
                start = mid;
            } else {
                end = mid;
            }
        }
        
        return (start + end) / 2;
    }
    
    public static void main(String[] args) {
        double number = 25; // Change this to the number you want to find the square root of
        double result = squareRoot(number);
        System.out.println("Square root of " + number + " is approximately: " + result);
    }

}
