package ex02_lamda;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;

public class Ex03_Function {
	public static void main(String[] args) {
		// 컬렉션 프레임워크의 인터페이스에 일부는 함수형 인터페이스를 사용한다.
//		Arrays.asList(1,2,3).forEach(null);
		
		ArrayList<String> list = new ArrayList<>();
		list.add("이름1");
		list.add("이름2");
		list.add("이름3");
		list.add("이름4");
		list.add("이름5");
		list.add("이름6");
		
		// void accpt(T t)
		// list에 들어있는 요소를 하나씩 꺼내서 출력
		list.forEach(x -> System.out.println(x));
		System.out.println("-----------------");
		list.forEach(System.out::println);
		
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		map.put("test1", 1);
		map.put("test2", 2);
		map.put("test3", 3);
		map.put("test4", 4);
		
		System.out.println(map);
//        map.forEach((key, value) -> {
//            System.out.println("Key: " + key + ", Value: " + value);
//        });
		map.forEach((x, y) -> System.out.println(x + " : " + y));
	}
}
