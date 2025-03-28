package ex02_Exception;

public class NullPointerException {
	public static void main(String[] args) {
		String [] strArray = null;
		
		// 생성되지 않는 배열을 출락혀라고 할 때 예외 처리
		System.out.println(strArray[0]);
	}
}
