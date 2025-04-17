package ex04_while;

import java.util.Scanner;

public class Ex02_do_while {
	public static void main(String[] args) {
		// while문과 같이 조건을 만족할 때까지 반복한다.
		// 다만, while 문과 다른 점은 먼저 루프를 한 번 실행한 후 조건식을 검사한다는 점이다.
		// 즉, 조건식의 결과와 상관없이 무조건 한 번은 실행한다.
		
        int sum = 0;  // 합계를 저장할 변수
        int i = 1;    // 시작 숫자

        do {
            sum += i; // 현재 숫자를 합계에 추가
            i++;      // 숫자 증가
        } while (i <= 10); // 10까지 반복

        System.out.println("1부터 10까지의 합: " + sum);
    	
		
		// 비밀번호 확인 프로그램 만들기
		// 사용자로부터 비밀번호를 입력받아 올바른 비밀번호가 입력될때까지
		// 계속 입력을 요구하는 프로그램 만들기 // 비밀번호 9486
		Scanner sc = new Scanner(System.in);
        boolean test = true;
//        int password = 9486;
//        
//        do {
//        	System.out.print("비밀번호를 입력하세요 : ");
//        	int keyin = sc.nextInt();
//        	System.out.println(keyin + " : " + password);
//        	if (keyin == password) {
//        		System.out.println("접속 성공");
//        		test = false;
//        	} else {
//        		System.out.print("비밀번호가 틀렸습니다. 다시 입력하세요. \n");
//        	}
//        } while (test);
        // 학생의 국어, 영어, 수학 점수를 입력받는다.
        // 단, 각 과목은 40점 이상이어야 하며,
        // 40점 미만이면 전체 과목 점수를 다시 입력받아야 한다.
        
        do {
        	System.out.print("국어 점수를 입력하세요 : ");
        	int korean = sc.nextInt();

        	System.out.print("영어 점수를 입력하세요 : ");
        	int english = sc.nextInt();

        	System.out.print("수학 점수를 입력하세요 : ");
        	int math = sc.nextInt();
        	System.out.println(korean + ":" + english + ":" + math);
        	if ((korean >= 40) && (english >= 40) && (math >= 40)) {
        		System.out.println("점수가 올바르게 입력 되었습니다.");
        		test = false;
        	} else {
        		System.out.println("점수를 다시 입력해주세요.");
        	}
        	
        } while(test);
	}
}
