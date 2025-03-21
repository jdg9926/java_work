package ex02_switch;

public class Ex02_switch {
	public static void main(String[] args) {
		// switch문에 break가 없는 경우
		int num = 1;
		switch (num) {
	    case 1 :
	    	System.out.println("num 은 1 입니다.");
	    case 7 :
	    	System.out.println("num 은 7 입니다.");
	    default :
	    	System.out.println("num은 1도 7도 아닙니다.");
		}
		
		// 10 < x < 20
		// int 형 변수 x 가 10보다 크고 20보다 작을 때 true인 조건식
		
		int x = 10;
		if (x > 10 && x < 20) {
			
		}
		
		// char형 변수 ch가 알파벳(대문자 또는 소문자)일 때 true 인 조건식
		char ch = 'a';
		if (ch >= 97 && ch <= 122 || ch >= 'a' && ch <= 'z') {
		
		}
	}
}
