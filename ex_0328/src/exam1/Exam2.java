package exam1;

import java.util.Scanner;

public class Exam2 {
	public static void main(String[] args) {
		// 키보드에서 특수문자를 제외한 알파벳을 무작위로 받는다.
		// 입력받은 문자열에서 소문자 a가 몇개 있는지 판별하시오
		// 예시
		// 입력 : asdasdasd
		
		Scanner sc = new Scanner(System.in);
		
//		System.out.print("문자 입력 : ");
//		String str = sc.next();
//		
//        int count = 0;
//        for (int i = 0; i < str.length(); i++) {
//            if (str.charAt(i) == 'a') {
//                count++;
//            }
//        }
//		
//		
//		System.out.println("a는 총 :" +  count + "개가 있습니다.");
//		
		// 생일과 성별 구하기
		// 예시
		// 주민번호를 모두 입력하세요 (-포함)
		// 911223-103345
		// 당신은 1999년 12월 23일에 태어난 남자 입니다.
		
//		System.out.print("주민번호를 모두 입력하세요 : ");
//		String birSc = sc.next();
//		String gender =  birSc.charAt(7) == '1' ? "남자" : "여자";
//		String gender2 =  birSc.contains("-1") == true ? "남자" : "여자";
//		
//		String year  = birSc.substring(0,2);
//		String month  = birSc.substring(2,4);
//		String date = birSc.substring(4,6);
//		
//		String birth = year + "년 " + month + "월 " + date + "일";
//		
//		System.out.printf("당신은 %s에 태어난 %s 입니다.", birth ,gender);
		
		// 회문 판별하기
		// 앞으로 읽어도 뒤로 읽어도 똑같이 읽히는 문자열
		// 키보드에서 문자열을 입력받아 회문이면 xxx는 회문입니다.
		// 아니면 xxx는 회문이 아닙니다.
		
		System.out.print("입력 :: ");
		String text = sc.next();
		
		
		String origin = text;
		String revers = text;
		
		StringBuilder str = new StringBuilder(revers);
		str.reverse();
		
		System.out.println(origin + " :: " + str);
		if (origin.equals(revers.toString())) {
			System.out.println(text + "(는)은 회문입니다.");
		} else {
			System.out.println(text + "(는)은 회문이 아닙니다.");
		}
	}
}
