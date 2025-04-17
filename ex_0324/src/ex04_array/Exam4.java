package ex04_array;

import java.util.Scanner;

public class Exam4 {
	public static void main(String[] args) {
		// 키보드에서 배열의 길이를 입력받는다.
		// 입력받은 배열의 길이만큼 알바펫을 출력한다.
		// 배열의 길이 : 5
		// 배열의 길이 : 3
		
		Scanner sc = new Scanner(System.in);
		System.out.print("입력할 배열의 길이 값 : ");
		char A = 'A';
		char B = 0;
		int scInt = sc.nextInt();
		for (int i = 0; i < scInt; i++) {
			B = (char) (A + i);
			System.out.print(B);
		}
		
		System.out.println();
		System.out.println("-----------------");
		
		char[] ch = new char[scInt];		
		for (int i = 0; i < ch.length; i++) {
			ch[i] = (char) (A + i);
			System.out.print(ch[i]);
		}
	}
}
