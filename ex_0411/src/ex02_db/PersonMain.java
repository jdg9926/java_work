package ex02_db;

import java.util.List;

public class PersonMain {
	public static void main(String[] args) {
		
//		PersonMethod.add(4, "허길동", 20);
		
		List<Person> list = PersonMethod.find("홍길동");
		for (Person x : list) {
			System.out.println("idx : " + x.getIdx() + ", 이름 : " + x .getName() + ", 나이 : " + x.getAge());
		}
	}
}
