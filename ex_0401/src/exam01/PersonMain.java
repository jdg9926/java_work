package exam01;

import java.util.ArrayList;
import java.util.Scanner;

public class PersonMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Person> arr = new ArrayList<>();
		while (true) {
			System.out.println("1. 정보추가 \n2. 정보삭제 \n3. 전체정보 \n4. 삭제");
			System.out.println("----------");
			System.out.print("항목 선택 : ");
			int scInt = sc.nextInt();
			
			if (scInt == 4) {
				System.out.println("시스템 종료");
				break;
			} else {
				PersonFunction person = new PersonFunction();
				person.personFunc(scInt, arr);
			}
		}
	}
}
