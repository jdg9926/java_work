package ex01_ThreadMathod;

public class JoinMain {
	public static void main(String[] args) {
		JoinExample je = new JoinExample();
		je.start();
		
		try {
			je.join(); // 메인 스레드는 worker 스레드가 끝날때까지 기다린다.
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("main 스레드 종료");
	}
}
