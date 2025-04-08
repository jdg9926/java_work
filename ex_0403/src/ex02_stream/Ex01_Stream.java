package ex02_stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Ex01_Stream {
	public static void main(String[] args) {
		
		String[] fruits = {"Apple", "Banana", "Cherry"};
		Stream<String> fruitStream = Arrays.stream(fruits);
		fruitStream.forEach(System.out::println);
		System.out.println("--------------------------");
		
		// 기본자료형의 배열
		// IntStream, DoubleStream, LongStream 으로 처리된다.
		int[] numbers = {1,2,3,4};
		IntStream numberStream = Arrays.stream(numbers);
		numberStream.forEach(System.out::println);
		System.out.println("--------------------------");
		
		// 2. 컬렉션으로부터 생성
		List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
		Stream<String> nameStream = names.stream();
		nameStream.forEach(System.out::println);
		System.out.println("--------------------------");
		
		// 3. stream.of() 로 직접 생성
		Stream<String> stream = Stream.of("A", "B", "C");
		stream.forEach(System.out::println);
		System.out.println("--------------------------");
		
		// 4. 비어있는 스트림 생성
		// 처음부터 아무 요소도 없는 빈 스트림을 생성
		// Stream.empty() 를 사용한다.
		Stream<String> emptyStream = Stream.empty();
		System.out.println(emptyStream.count());
		System.out.println("--------------------------");
		
		List<Integer> list = new ArrayList<>();
		list.add(5);
		list.add(3);
		list.add(1);
		list.add(2);
		list.add(4);
		Stream<Integer> listStr = list.stream();
		listStr.sorted().forEach(x -> System.out.println(x));
//		listStr.sorted().forEach(System.out::println);
//		System.out.println(listStr.count());
		System.out.println("--------------------------");
		
		
//		Stream.sorted().forEach(x -> System.out.println(x));
//		int numOfStr = list.count(x -> x); // 스트림이 닫혔으므로 에러 발생 
	}
}
