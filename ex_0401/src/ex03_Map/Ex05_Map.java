package ex03_Map;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Ex05_Map {
	public static void main(String[] args) {
		// 가장 많이 주문된 상품 구하기
		// 각 사용자는 여러 상품을 주문할 수 있으며
		// 주문 내역은 ArrayList에 문자열 형태로 저장되고
		// "사용자 이름 : 상품 이름" 형태로 저장이 된다.
		// 가장 많이 주문된 상품 이름과 주문 수량을 출력하세요.
		
		List<String> orders = Arrays.asList("Alice:TV", "Bob:TV", "Alice:Phone", "Charlie:TV", "David:Tablet", "Eve:Phone", "Frank:Phone", "Alicee:Phone");
		System.out.println(orders);
		Map<String, Integer> map = new HashMap<>();
		
		for (int i = 0 ; i < orders.size(); i++) {
			String[] arrStr = orders.get(i).split(":");
			String str = arrStr[1];
			map.put(str, map.getOrDefault(str, 0) + 1);
		}
		
		System.out.println(map);
		
		System.out.println("----------------");
		String maxStr = "";
		int maxCnt = 0;
		
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
			if (maxCnt < entry.getValue()) {
				maxStr = entry.getKey();
				maxCnt = entry.getValue();
			}
			
		}
		System.out.println("----------------");
		System.out.println(maxStr + " ==> " + maxCnt);
		
		System.out.println("----------------");
		maxStr = "";
		maxCnt = 0;
		for (String key : map.keySet()) {
			System.out.println(key + " : " + map.get(key));
			if (maxCnt < map.get(key)) {
				maxStr = key;
				maxCnt = map.get(key);
			}
		}
		System.out.println("----------------");
		System.out.println(maxStr + " => " + maxCnt);
	}
}
