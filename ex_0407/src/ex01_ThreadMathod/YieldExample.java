package ex01_ThreadMathod;

public class YieldExample extends Thread {
	// 현재 실행중인 스레드가 CPU를 다른 스레드에게 양보하도록 한다.
	// 하지만 양보가 반드시 일어나는것은 아니다.
	
	@Override
	public void run() {
		this.setName("스레드1");
		String name = currentThread().getName();
		
		for (int i = 0; i <= 5; i++) {
			System.out.println(name + " : " + i);
			Thread.yield(); // 양보요청
		}
	}
}
