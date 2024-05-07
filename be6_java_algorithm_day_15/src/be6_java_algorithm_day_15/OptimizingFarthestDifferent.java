package be6_java_algorithm_day_15;

public class OptimizingFarthestDifferent {

	public static void main(String[] args) {
        int[] A = {4, 2, 2, 2, 6, 6,2, 4};
        System.out.println(solution(A));
    }

    public static int solution(int[] A) {
        int[] lastIndex = new int[100];
        int maxDistance = 0;
        int N = A.length;

        for (int i = 0; i < N; i++) {
            if (lastIndex[A[i]] != 0) {
                maxDistance = Math.max(maxDistance, i - lastIndex[A[i]]);
            } else {
                lastIndex[A[i]] = i + 1;
            }
        }

        return maxDistance;
    }

}
	