package ex01_lamda;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Ex01_Function {
	public static void main(String[] args) {
		
		// Consumer<T>
		Consumer<String> c1 = t -> System.out.println(t);
		c1.accept("홍길동");
		
		
		// BiConsumer<T, U>
		BiConsumer<String, Integer> c2 = (x, y) -> System.out.println("입력값1 : " + x + "\n입력값2 : " + y);
		c2.accept("박길동", 100);
		
		// Supplier<T>
		Supplier<Object> s1 = () -> new Object();
		System.out.println(s1.get());
		
		// Function<T, R>
		Function<Integer, String> f1 = t -> String.valueOf(t);
		String str = f1.apply(100);
		System.out.println("문자열 str : " + str);
		
		// BiFunction<T, U, R>
		BiFunction<String, String, Boolean> f2 = (x, y) -> x.equals(y);
		if (f2.apply("토마토", "토마토")) {
			System.out.println("두 문자열의 값은 같습니다.");
		} else {
			System.out.println("두 문자열의 값은 다릅니다.");
		}

		// Predicate<T> 
		Predicate<Integer> p1 = t -> t >= 60;
		int score = 65;
		boolean pass = p1.test(score);
		if (pass) {
			System.out.println("홍길동 님의 점수는 " + score +  "이고 합격입니다.");
		}
		
	}
}
