package ex01_ThreadMathod;

public class SleepThread extends Thread{
	@Override
	public void run() {
		System.out.println("카운트 다운 5초");
		for (int i = 5 ; i >= 1; i--) {
			try {
				sleep(1000);
				System.out.println(i);
				
				// InterruptedException
				// 스레드가 해야할 일을 처리하지 못할 때
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("시스템 종료");
	}
}
