package exam;

import java.util.Scanner;

public class Exam2 {

	public static void main(String[] args) {
		// 국어, 영어, 수학에 대한 점수를 키보드를 이용해 정수로 입력받고
		// 1. 세 과목에 대한 합계 출력하기
		// 2. 평균 출력하기
		Scanner sc = new Scanner(System.in);
		System.out.print("국어 점수 : ");
		int test1 = sc.nextInt();
		System.out.printf("영어 점수 : ");
		int test2 = sc.nextInt();
		System.out.printf("수학 점수 : ");
		int test3 = sc.nextInt();
		
		sc.nextLine();
		System.out.println("점수 총합 : " + (test1 + test2 + test3));
		System.out.println("점수 평균 : " + (test1 + test2 + test3) / 3);

		int sum = (test1 + test2 + test3);
		int avg = (test1 + test2 + test3) / 3;
		System.out.println((avg >= 60 ? true : false) && (test1 >= 40 ? true : false && test2 >= 40 ? true : false && test3 >= 40 ? true : false));
		
	}

}
