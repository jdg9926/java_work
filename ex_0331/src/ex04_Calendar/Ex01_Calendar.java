package ex04_Calendar;

import java.time.LocalDateTime;
import java.util.Calendar;

public class Ex01_Calendar {
	public static void main(String[] args) {
		// java.util 패키지에 있는 날짜와 시간 정보를 제공해주는 클래스
		// 객체를 만들 때 new 키워드를 이용하여 선언하지 않고 생성된 객체를 받아오는 형식으로 선언한다.
		
		// Calendar cal = new Calendar(); //에러 발생
		Calendar cal = Calendar.getInstance();
		
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH) + 1;
		int day = cal.get(Calendar.DAY_OF_MONTH);
		
		System.out.println("오늘 날짜는 " + year + "년 " + month+"월 " + day+"일 입니다.");
		System.out.printf("오늘 날짜는 %d년 %d월 %d일 입니다.", year, month, day);
		
		// LocalDateTime
		// 날짜 + 시간
		// java.time 패키지에 있음
        LocalDateTime now = LocalDateTime.now();
        
	}
}
