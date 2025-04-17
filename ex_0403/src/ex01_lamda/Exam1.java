package ex01_lamda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

class P_lamda {
	// 리스트의 필터 메서드를 만든다.
	// 숫자 리스트에서 조건을 결합한 결과만 필터링
	// Predicate<Integer> 를 사용해 다음 조건을 구현
	// 짝수(even)
	// 100 이상 200 미만
	
	public List<Integer> filter(List<Integer> list, Predicate<Integer> condition) {
		List<Integer> data = new ArrayList<>();
		for (int x : list) {
			if (condition.test(x)) {
				data.add(x);
			}
		}
		return data;
	}
}

public class Exam1 {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(50, 80, 120, 150, 180, 210, 250, 300);
		
		Predicate<Integer> p1 = t -> t >= 100;
		Predicate<Integer> p2 = t -> t < 200;
		Predicate<Integer> p3 = t -> t % 2 == 0;
		
		Predicate<Integer> all = p1.and(p2).and(p3);
		
		
		
		P_lamda lamda = new P_lamda();
		System.out.println(lamda.filter(numbers, all));
		
		// 조건 (람다식으로 만들기)
		// 메서드 호출해서 리스트와 조건 넘겨주면 된다.
//		Predicate<Integer> p1 = t -> 
	}
}
