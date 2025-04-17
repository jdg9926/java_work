package ex06_List;

import java.util.ArrayList;
import java.util.Scanner;

public class Exam01 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		
		Scanner sc = new Scanner(System.in);
		
		out:for (int i = 0 ; i < 5;) {
			System.out.print("아이디 생성 : ");
			String scId = sc.next();
			list.add(scId);
			for (int j = 0 ; j < i; j++) {
				if (list.get(j).equals(scId)) {
					System.out.println("중복된 아이디 입니다.");
					list.remove(i);
					continue out;
				}
			}
			i++;
		}
		
		System.out.println(list);
	}
}
