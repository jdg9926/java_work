package ex02_stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exam1 {
	public static void main(String[] args) {
		
		// 짝수만 출력하기
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6);
		numbers.stream().filter(t -> t % 2 == 0).forEach(x -> System.out.println("numbers 짝수 값 :: " + x));
		
		// 문자열대문자로 변환하여 리스트로 수집하기
		List<String> words = Arrays.asList("java", "stream", "lamda");
		words.stream().map(String::toUpperCase).collect(Collectors.toList());
		System.out.println(words);
	}
}
