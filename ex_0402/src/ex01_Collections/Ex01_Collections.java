package ex01_Collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Ex01_Collections {
	public static void main(String[] args) {
		// Collections
		// Java에서 컬렉션을 다룰 때 유용한 기능들을 제공하는 클래스
		// Java.util.Collections 패키지에 포함되어 있으며
		// 모든 메서드는 정적 메서드이다.

		List<Integer> numbers = Arrays.asList(5,3,8,1,2,4,9,6,7);
		
		// sort(list)
		// 리스트의 요소를 오름차순으로 정렬
		Collections.sort(numbers);
		System.out.println(numbers);
		
		// reverse (list)
		// 리스트 요소 뒤집기
		Collections.reverse(numbers);
		System.out.println(numbers);
		
		// shuffle(list)
		// 리스트 요소 무작위 섞기
		Collections.shuffle(numbers);
		System.out.println(numbers);
		
		// min (Collection c)
		// 리스트에서 최소값을 찾는다.
		int min = Collections.min(numbers);
		System.out.println(min);
		
		// max (Collection c)
		// 리스트에서 최대값을 찾는다.
		int max = Collections.max(numbers);
		System.out.println(max);
		
		// set 이나 map 은 list로 변환한 다음 사용해야 한다.
	}
}
