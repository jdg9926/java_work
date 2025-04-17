package ex02_thread;


// 스레드를 생성하는 방법
// 1. Thread클래스를 상속 받는다.
public class ThreadTest extends Thread {

	@Override
	public void run() {
		for (int i = 0 ; i < 10; i++) {
			System.out.println("스레드 진행중 " + i);
		}
	}
}
