package junit_exercise_answer;

//Matcher関連メソッドを利用するためのstaticインポート
import static org.hamcrest.CoreMatchers.*;
//JUnit関連メソッドを利用するためのstaticインポート
import static org.junit.Assert.*;

import org.junit.Test;

public class ExerciseMathTest {
	@Test
	public void testFactorial() {
		int answer = 0;
		try {
			answer = ExerciseMath.factorial(-1);
			fail("TC1:例外が発生しなければなりません");
		} catch (IllegalArgumentException e) {
			assertThat("TC1:メッセージが一致しません", e.getMessage(), is("0以下の値は不正です。"));
		}

		try {
			answer = ExerciseMath.factorial(0);
			fail("TC2:例外が発生しなければなりません");
		} catch (IllegalArgumentException e) {
			assertThat("TC2:メッセージが一致しません", e.getMessage(), is("0以下の値は不正です。"));
		}

		answer = ExerciseMath.factorial(1);
		System.out.println(answer);
		assertThat("TC3:値が一致しません", answer, is(1));

		answer = ExerciseMath.factorial(2);
		assertThat("TC4:値が一致しません", answer, is(2));

		answer = ExerciseMath.factorial(3);
		assertThat("TC5:値が一致しません", answer, is(6));

		answer = ExerciseMath.factorial(4);
		assertThat("TC6:値が一致しません", answer, is(24));

		answer = ExerciseMath.factorial(11);
		assertThat("TC7:値が一致しません", answer, is(39916800));

		answer = ExerciseMath.factorial(12);
		assertThat("TC8:値が一致しません", answer, is(479001600));

		try {
			answer = ExerciseMath.factorial(13);
			fail("TC9:例外が発生しなければなりません");
		} catch (IllegalArgumentException e) {
			assertThat("TC9:メッセージが一致しません", e.getMessage(), is("13以上の値は不正です。"));
		}

		try {
			answer = ExerciseMath.factorial(14);
			fail("TC10:例外が発生しなければなりません");
		} catch (IllegalArgumentException e) {
			assertThat("TC10:メッセージが一致しません", e.getMessage(), is("13以上の値は不正です。"));
		}
	}
}
