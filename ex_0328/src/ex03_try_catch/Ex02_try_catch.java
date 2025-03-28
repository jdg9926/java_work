package ex03_try_catch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex02_try_catch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.print("정수 입력");
			int score = sc.nextInt();
			
			if (score >= 65) {
				System.out.println("합격입니다.");
				
			} else {
				System.out.println("불합격 입니다.");
			}
		} catch (InputMismatchException e) {
			e.printStackTrace();
			System.out.println("올바른 입력값이 아닙니다.");
		}
		System.out.println("프로그램 종료");
	}
}
