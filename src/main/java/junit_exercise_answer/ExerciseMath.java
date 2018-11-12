package junit_exercise_answer;

public class ExerciseMath {
	public static int factorial(int n) {
		if (n <= 0) {
			throw new IllegalArgumentException("0以下の値は不正です。");
		}

		if (13 <= n) {
			throw new IllegalArgumentException("13以上の値は不正です。");
		}

		int answer = 1;
		for (int i = 1; i <= n; i++) {
			answer *= i;
		}
		return answer;
	}
}
