package ex02_synchronized;

class Counter {
	
	private int count = 0;
	
	// 이 메서드에 두개의 스레드가 동시에 접근할 때 에러가 발생할 수 있다.
	// 동기화 메서드로 만들어 준다.
	public void increment () {
		count++; // 동기화 안함.
		System.out.println(Thread.currentThread().getName() + " - count : " + count);
	}

	public int getCount() {
		return count;
	}
}

public class SynchronizedExample {
	public static void main(String[] args) throws InterruptedException {
		Counter counter = new Counter();
		Thread t1 = new Thread (() -> {
			for (int i = 0 ; i < 2000; i++) {
				counter.increment();
			}
		}, "Thread_1");
		
		Thread t2 = new Thread (() -> {
			for (int i = 0 ; i < 2000; i++) {
				counter.increment();
			}
		}, "Thread_2");
		t1.start();
		t2.start();
		
		// t1 과 t2 가 끝날때까지 main을 기다린다.
		t1.join();
		t2.join();
		System.out.println("최종 count : " + counter.getCount());
			
	}
}
