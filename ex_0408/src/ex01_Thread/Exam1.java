package ex01_Thread;

import java.util.Scanner;

// 스캐너를 이용하여 키보드에서 숫자를 입력받고
// 스레드에서 입력받은 숫자부터 1식 감소하다가 0이 되었을 때
// 종료 메세지와 함께 프로그램이 종료되도록 만들어보자
// Thread는 ThreadCount에다 작성하기

class ThreadCount extends Thread {
	private int count;

	public void setCount(int count) {
		this.count = count;
	}

	@Override
	public void run() {
		for (int i = count; i >= 0; i--) {
			System.out.println(i);
			
			try {
				sleep(1000);
				
			} catch (Exception e) {

			}
		}
		System.out.println("시스템 종료");
	}
}

public class Exam1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("반복 횟수 입력 : ");
		int scInt = sc.nextInt();
		
		ThreadCount tc = new ThreadCount();
		
		tc.setCount(scInt);
		tc.start();
	}
}
