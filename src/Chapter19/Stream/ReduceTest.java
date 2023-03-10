package Chapter19.Stream;

import java.util.Arrays;
import java.util.function.BinaryOperator;

//BinaryOperator : FunctionalInterface 
class CompareString implements BinaryOperator<String> {

	@Override
	public String apply(String s1, String s2) {
		if (s1.getBytes().length >= s2.getBytes().length)
			return s1;
		else
			return s2;
	}

}

public class ReduceTest {

	public static void main(String[] args) {
		String[] greetings = { "안녕하세요~~~~~~~~~~", "HI!", "GOOD MORNING", "점심시간입니다" };

		// BinaryOpertaor의 apply
		String str = Arrays.stream(greetings).reduce(new CompareString()).get(); // apply호출
		System.out.println(str);

		// 람다식
		System.out.println(Arrays.stream(greetings).reduce("", (s1, s2) -> {
			if (s1.getBytes().length >= s2.getBytes().length)
				return s1;
			else
				return s2;
		}));

	}

}
