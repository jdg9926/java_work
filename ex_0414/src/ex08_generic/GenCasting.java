package ex08_generic;

import java.util.ArrayList;
import java.util.List;

public class GenCasting {
	public static void main(String[] args) {
		// 일반적인 제네릭 타입에서 하위 타입을 쓸 수 있다.
		// Wrapper클래스
		// Integer, Double, Float -> Number클래스의 자식
		
		List<Number> list = new ArrayList<>();
		
		list.add(1); 	// Integer값 추가 가능
		list.add(1.1);	// Double도 추가 가능
		
		List<Integer> intList = new ArrayList<>();
		
		// 만약 허용된다면, 아래와 같이 할당이 가능하다.
		
//		List<Number> numberList = intList;
		
//		numberList.add(3.14);
	}
}
