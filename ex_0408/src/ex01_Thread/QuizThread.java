package ex01_Thread;

import java.util.Random;
import java.util.Scanner;

public class QuizThread extends Thread{
	int su1, su2;
	int timer = 0;
	int playCount = 0;
	boolean isCheck = true;
	final int FINISH = 1; //정답 개수
	
	public void startGame() {
		while(isCheck) {
			try {
				su1 = new Random().nextInt(100)+1;
				su2 = new Random().nextInt(100)+1;
				System.out.printf("%d + %d = ",su1,su2);
				Scanner sc = new Scanner(System.in);
				int result = sc.nextInt();
				
				//정답검증
				if(result == (su1+su2)) {
					System.out.println("정답!!");
				} else {
					System.out.println("오답");
					continue;
				}
				
				playCount++;
				
				if(playCount == FINISH) {
					System.out.println("결과 : " + timer+"초...");
					isCheck=false;
				}
				
			} catch (Exception e) {
				System.out.println("정답은 정수로 입력하세요");
			}
		}	
	}//startGame()
	
	@Override
	public void run() {
		while(isCheck) {
			try {
				Thread.sleep(1000);
				timer++;
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
}