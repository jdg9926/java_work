package ex02_stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Ex02_Stream {
	public static void main(String[] args) {
		// 스트림의 중간연산
		
		// filter()
		// 주의 : 중간 연산으로 끝맺음을 할 수 없음.
		//       항상 최종 연산으로 마무리 해야함.
		// 조건에 맞는 요소만 걸러냄
		List<String> list = Arrays.asList("Apple", "Banana", "Avocado");
		list.stream().filter(t -> t.startsWith("A")).forEach(System.out::println);
		System.out.println(list.stream().count());
		System.out.println("-----------------");
		
		// map()
		// 각 요소를 변환
		list.stream().map(t -> t.toUpperCase()).forEach(x -> System.out.println(x));
		System.out.println("-----------------");
		
		// distinct()
		// 중복 제거
		Stream.of("a", "b", "c", "a").distinct().forEach(System.out::println);
		System.out.println("-----------------");
		
		// sorted()
		// 정렬
		Stream.of("apple", "banana", "avocado").sorted().forEach(System.out::println);
		System.out.println("-----------------");
		
		// limit()
		// 제한
		Stream.of(1,2,3,4,5).limit(3).forEach(System.out::println);
		System.out.println("-----------------");
		
		// skip()
		// 넘기기
		Stream.of(1,2,3,4,5).skip(2).forEach(System.out::println);
		System.out.println("-----------------");
		
		// peek()
		// 값을 그대로 유지하면서 중간에 볼 수 있게 해준다.
		// 중간 디버깅용으로 많이 사용
		Stream.of(1,2,3,4,5).peek(t -> System.out.println("peek : " + t)).forEach(System.out::println);
		Stream.of("one","two","three").peek(t -> System.out.println("test:: " + t)).map(String::toUpperCase).forEach(System.out::println);
		
	}
}
