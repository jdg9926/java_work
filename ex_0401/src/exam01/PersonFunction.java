package exam01;

import java.util.ArrayList;
import java.util.Scanner;

public class PersonFunction {
	
	public void personFunc (int scInt, ArrayList<Person> arr) {
		Person per = new Person();
		Scanner sc = new Scanner(System.in);
		if (scInt == 1) {
			System.out.println("===정보추가===");
			System.out.print("이름 : ");
			per.setName(sc.next());
			System.out.print("나이 : ");
			per.setAge(sc.next());
			System.out.print("전화번호 : ");
			per.setHp(sc.next());
			
			arr.add(per);
			
			for (Person data : arr) {
				System.out.println("이름 : " + data.getName() + "\n나이 : " + data.getAge() + "\n전화번호 : " + data.getHp());
			}
			System.out.println("정보가 저장되었습니다.");	
			
		} else if (scInt == 2) {
			System.out.println("===정보삭제===");
			if (arr.isEmpty()) {
				System.out.println("등록된 정보가 존재하지 않습니다.");
			} else {
				System.out.print("삭제할 이름 : ");
				String scStr = sc.next();
				
				for (int i = 0; i < arr.size(); i++) {
					if (arr.get(i).getName().equals(scStr)) {
						arr.remove(i);
						System.out.println("삭제가 완료되었습니다.");
						break;
					} else {
						if (arr.size() == i + 1) {
							System.out.println("'" + scStr + "' 입력한 정보를 찾지 못하였습니다.");
						}
					}
				}
			}

		} else if (scInt == 3) {
			System.out.println("===전체정보===");
			if (arr.isEmpty()) {
				System.out.println("등록된 정보가 존재하지 않습니다.");
			} else {
				System.out.println("등록인원 : " + arr.size() + "명");
				System.out.println("------------------");
				
				for (Person data : arr) {
					System.out.println("이름 : " + data.getName() + "\n나이 : " + data.getAge() + "\n전화번호 : " + data.getHp());
					System.out.println("---------");
				}
			}
		}
	}
}

/*
고객의 인적사항을 추가하고, 삭제하고, 확인하기 위한 문제출제.

이름과 나이, 번호를 갖는 Person클래스를 만든 후, ArrayList를 사용하여
아래의 결과처럼 Person객체의 정보추가와 전체정보 보기를 할 수 있도록 만들어보자 

기능은 PersonFunction클래스를 만들어서 personFunc메서드로 만든다.

PersonMain에서 메서드를 호출하여 실행하기

결과 : 
1. 정보추가
2. 정보삭제
3. 전체정보
4. 종료
항목선택 : 1 <- 정보추가 항목
-----정보추가-----
이름 : 홍길동
나이 : 30
전화 : 010-1111-1111
정보가 저장되었습니다.

1. 정보추가
2. 정보삭제
3. 전체정보
4. 종료
항목선택 : 3 <- 정보보기 항목
----전체정보----
등록인원 1명
이름 : 홍길동
나이 : 30
*/