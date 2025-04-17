package ex09_collection;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Ex04_HashMap {
	public static void main(String[] args) {
		HashMap<String, List<Integer>> student = new HashMap<>();
		
		student.put("홍길동", Arrays.asList(100, 98,60));
		student.put("박길동", Arrays.asList(70, 98,60));
		student.put("김길동", Arrays.asList(30, 98,60));
		
		System.out.println(student.get("홍길동").get(1));
		
		System.out.println(student);
		
		// entrySet()
		// 모든 key-value 쌍을 Map.Entry객체로 구성된 Set형태로 반환
		
		
	}
}
