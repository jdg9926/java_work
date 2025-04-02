package ex03_Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class Ex01_HashMap {
	public static void main(String[] args) {
		HashMap<Integer, Character> map = new HashMap<>();
		// put(Key k, Value v)
		// HashMap에 데이터 추가하기
		map.put(1, 'A');
		map.put(2, 'B');
		map.put(3, 'C');
		map.put(4, 'A'); // map에 저장되는 value는 중복될 수 있다.
		System.out.println(map);
		
		map.put(1, 'F'); // 같은 값을 가진 key가 있다면 value를 갱신한다.
		System.out.println(map);
		
		// remove(K k)
		// 데이터의 삭제
		map.remove(3);
		System.out.println(map);
		
		// size()
		System.out.println("map 의 크기 : " + map.size());
		
		// get(K k)
		char res = map.get(1);
		System.out.println(res);
		
		HashMap<String, Double> map2 = new HashMap<>();
		
		map2.put("K1", 100.0);
		map2.put("K2", 3.14);
		map2.put("K3", 4.15);
		System.out.println(map2.get("K2"));
		
		// containsKey(K k)
		// map 안에 key가 존재하면 true, 없으면 false
		// containsValue(V v)
		// map 안에 value가 존재하면 true, 없으면 false
		System.out.println(map2.containsKey("K3"));
		System.out.println(map2.containsValue(100.0));
		
		// KeySet() --> 모든 키를 Set으로 변환
 
		Iterator<String> iter = map2.keySet().iterator();
		
		while (iter.hasNext()) {
			String val = iter.next();
			System.out.println("key : " + val);
		}

		// value() -->  모든 value를 Collection 타입으로 반환
		Iterator<Double> iter2 = map2.values().iterator();
		while (iter2.hasNext()) {
			Double val = iter2.next();
			System.out.println("value : " + val);
		}
		
		// entrySet() -> key-value 쌍을 하나의 Entry로 반환
		//  - key 와 value를 동시에 다룰 때 효과적이다.
		// Set<Map.Entry<K,V>>
		Iterator<Map.Entry<String, Double>> iter3 = map2.entrySet().iterator();
		
		// Entry
		// HashMap 내부에서 key-value쌍 하나를 표현할 수 있는 객체
		while (iter3.hasNext()) {
			Entry<String, Double> entry = iter3.next();
			System.out.println("entry : " + entry.getKey() + " : " + entry.getValue());
		}
	}
}
