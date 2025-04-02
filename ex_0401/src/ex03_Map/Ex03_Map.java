package ex03_Map;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Ex03_Map {
	public static void main(String[] args) {
		// 문장을 입력받고 단어별로 몇번 등장했는지 출력하세요
		// 예시
		// hello world hello java world
		
		Scanner sc = new Scanner(System.in);
		System.out.print("문장 입력 : ");
		String[] arrStr = sc.nextLine().split(" "); 

		
		int cnt = 1;
		System.out.println(Arrays.toString(arrStr));
		for (int i = 0 ; i < arrStr.length; i++) {
			
			for (int j =0 ; j < i; j++) {
				if (arrStr[i].equals(arrStr[j])) {
					cnt++;
				}
			}
//			System.out.printf("arrStr[%d] = %s 의 단어별 등장 횟수는 : %d\n", i, arrStr[i], cnt);
			cnt = 1;
			
		}
		
		HashMap<String, Integer> map = new HashMap<>();
		for (String x : arrStr) {
//			if (map.containsKey(x)) {
//				// 이미 키가 존재한다면 값 1 증가
//				int count = map.get(x);
//				map.put(x, count + 1);
//				
//			} else {
//				map.put(x, 1);
//			}
			map.put(x, map.getOrDefault(x, 0) + 1);
		}
		System.out.println("단어별 등장 횟수");
		for (String key : map.keySet()) {
			System.out.println(key + " : " + map.get(key) + "개");
		}
		// Map 인터페이스에서 제공하는 메서드
		// V getOrDefault(K key, defaultValue)
		// 키가 존재하면 Value를 반환
		// 키가 존재하지 않으면 defaultValue를 반환한다.
		
		// V replace(K key, V value)
		// put은 키가 없으면 추가가 된다.
		// replace는 키가 없으면 추가가 안된다.
		
		// V putIfAbsent(K key, V value)
		// 키가 없을 경우에만 추가
		
		// 키가 있을 경우
		// put() -> 덮어쓰기
		// putIfAbsent() -> 아무 동작도 하지 않는다.
	}
}
