package ex01_StringBuilder;

public class Ex01_StringBuilder {
	public static void main(String[] args) {
		StringBuilder str = new StringBuilder("Hello");
		
		// append(String str)
		// 기존 문자열 뒤에 더하여 반환
		str.append(" world");
		System.out.println(str);
		System.out.println("문자열의 길이 :" + str.length());
		
		// delete(int start, int end)	
		// 시작 위치부터 끝 위치 전까지 삭제
		str.delete(0, 6); // 실질적으로는 0 ~ 5 까지 삭제
		System.out.println(str);
		
		// insert(int offset, String str)
		// 시작 위치부터 문자열을 삽입
		str.insert(0, "Hello ");
		System.out.println("문자열의 길이 : " + str.length());
		
		// reverse()
		// 문자열을 반대로 출력
		str.reverse();
		System.out.println(str);
		 
		
	}
}
