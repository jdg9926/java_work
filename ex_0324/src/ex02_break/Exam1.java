package ex02_break;

import java.util.Random;
import java.util.Scanner;

public class Exam1 {
	public static void main(String[] args) {
		// 1 ~ 50 사이의 난수를 생성하고 난수를 맞추는 프로그램 만들기
		// 적은 값이 난수보다 작으면 "맞춰야할 숫자가 더 큽니다."
		// 적은 값이 난수보다 크면 "맞춰야할 숫자가 더 작습니다.
		
        Random random = new Random();
        int randomNumber = random.nextInt(50) + 1; // 1 ~ 50 사이의 난수 생성
        
        Scanner sc = new Scanner(System.in);
        int cont = 0;
//        boolean result = true;
//        do {
//        	cont++;
//        	System.out.print("입력 할 값 : ");
//        	int scInt = sc.nextInt();
//        	if (scInt < randomNumber) {
//        		System.out.println("맞춰야할 숫자가 더 큽니다.");
//        	}
//        	if (scInt > randomNumber) {
//        		System.out.println("맞춰야할 숫자가 더 작습니다.");
//        	}
//        	if (scInt == randomNumber) {
//        		System.out.printf("정답입니다. 총 시도 횟수는 %d 번입니다.", cont);
//        		result = false;
//        	}
//        } while (result);        
        
        out:for (int i = 1; ; ) {
        	cont++;
        	System.out.print("입력 할 값 : ");
        	int scInt = sc.nextInt();
        	if (scInt < randomNumber) {
        		System.out.println("맞춰야할 숫자가 더 큽니다.");
        		continue out;
        	}
	    	if (scInt > randomNumber) {
	    		System.out.println("맞춰야할 숫자가 더 작습니다.");
	    		continue out;
	    	}
    		System.out.printf("정답입니다. 총 시도 횟수는 %d번입니다.", cont);
    		return;
        }
	}
}
