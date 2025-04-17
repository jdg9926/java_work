package exam;

import java.util.Scanner;

public class Exam3 {
	public static void main(String[] args) {
		// 상자 하나에는 농구공이 5개 들어갈 수 있다.
		// x개의 농구공을 담기 위한 박스의 개수를 구하세요.
		// 농구공의 개수는 키보드를 통해 입력받습니다.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("농구공의 개수 : ");
		float ball = sc.nextInt();
		
		int box = (int)Math.ceil(ball / 5);
		System.out.println(ball +"개 의 농구공을 담기 위해서는 상자 " + box + "개가 필요합니다.");
		
		
	}
}
