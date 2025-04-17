package ex03_Map;

import java.util.HashMap;
import java.util.Scanner;

public class Ex02_Map {
	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<>();
		
		map.put("kim", 1111);
		map.put("lee", 2222);
		map.put("park", 3333);

		out:while (true) {
			Scanner sc = new Scanner(System.in);
			System.out.print("id 입력 : ");
			String scStr = sc.next();
			
			System.out.print("pw 입력 : ");
			int scInt = sc.nextInt();
			if (!map.containsKey(scStr)) {
				System.out.println("id : " + scStr);
				System.out.println("아이디가 존재하지 않습니다.");
				continue out;
				
			} else {
				if (map.get(scStr) != scInt) {
					System.out.println("pw : " + scInt);
					System.out.println("비밀번호 불일치");
					continue out;
				}
			}
			System.out.printf("id : %s \npw : %d \n로그인 성공! \n", scStr, scInt);
			System.out.println("프로그램 종료");
			break;	
		}
	}
}
