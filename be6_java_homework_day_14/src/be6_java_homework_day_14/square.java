package be6_java_homework_day_14;

public class square {

	public static void main(String[] args) {
		double result = sqrt(25);
		System.out.println(result);
	}

	public static double sqrt(double num) {
		double l = 0;
		double r = num;
		double m = (l + r) / 2;
		
		while (r - l > 0.01) {
			m = (l + r) / 2;
			if (m * m == num) {
				return m;
			}else if (m * m > num) {
				r = m - 1;
			}else {
				l = m + 1;
			}
		}
		return m;
	}

}
