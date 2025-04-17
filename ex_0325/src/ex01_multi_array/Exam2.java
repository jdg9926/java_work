package ex01_multi_array;

import java.util.Scanner;

public class Exam2 {
	public static void main(String[] args) {
		// 학생들의 정보를 입력하고, 출력하는 프로그램 작성하기
		// 학생들의 수학과 영어성적을 등록하는 프로그램입니다.
		// 1. 프로그램을 실행하면 몇 명의 정보를 저장할 것인지 입력받는다.
		// 2. 입력받은 수 만큼 학생들의 이름, 수학, 영어성적을 입력받는 프로그램 작성하기
		Scanner sc = new Scanner(System.in);
		
		System.out.print("학생의 수 : ");
		int scInt = sc.nextInt();
		
		String scStr = "";
		String scMath = "";
		String scEng = "";

		String result = "";
//		for (int i = 0 ; i < scInt; i++) {
//		    System.out.print("학생의 이름 : ");
//		    scStr = sc.next();
//		    result += scStr + " ";
//
//		    System.out.print("수학 성적 : ");
//		    scMath = sc.next();
//		    result += scMath + " ";
//
//		    System.out.print("영어 성적 : ");
//		    scEng = sc.next();
//		    result += scEng + "\n
//		}
//		System.out.printf("%d 명 등록 완료 \n", scInt);
//		System.out.println(result);
		
		System.out.println("--------------------------");
		
		scStr = "";
		scMath = "";
		scEng = "";
		String[][] strArr = new String[scInt][3];
		
		for (int i = 0 ; i < strArr.length; i++) {
		    System.out.print("학생의 이름 : ");
		    scStr = sc.next();
		    strArr[i][0] = scStr + " ";
		    
		    System.out.print("수학 성적 : ");
		    scMath = sc.next();
		    strArr[i][1] = scMath + " ";
		    
		    System.out.print("영어 성적 : ");
		    scEng = sc.next();
		    strArr[i][2] = scEng + " ";
		}
		
		for (int i = 0 ; i < strArr.length; i++) {
			for (int j = 0 ; j < strArr[i].length; j++) {
				System.out.print(strArr[i][j] + " ");
			}
			System.out.println();
		}
		
		// 학생 수와 정보 항목 설정
		String[] subjects = {"이름", "수학 성적", "영어 성적"};  // 항목들

		for (int i = 0; i < strArr.length; i++) {  // 외부 루프: 학생마다 반복
		    System.out.println("학생 " + (i + 1) + "의 정보를 입력하세요.");

		    // 내부 루프: 각 항목(이름, 수학 성적, 영어 성적)에 대해 반복
		    for (int j = 0; j < subjects.length; j++) {  // 내부 루프: 항목별 반복
		        System.out.print(subjects[j] + " : ");  // 항목명 출력
		        strArr[i][j] = sc.next() + " ";  // 각 항목에 입력 값 저장
		    }
		}

	}
}
