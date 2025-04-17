package ex04_api;

public class Ex01_equals {
	public static void main(String[] args) {
		// (묵시적)암시적 객체 생성
		// 문자열 리터럴
		// 같은 문자열일때 이미 메모리에 올라가 있으면 참조를 해버린다.
		String str1 = "Hello";
		String str2 = "Hello";
		
		// 명시적 객체 생성
		String str3 = new String("Hello");
		
		// 주소의 비교
		System.out.println("str1 vs str2 : " + (str1 == str2));
		System.out.println("str1 vs str2 : " + (str2 == str3));
		
		System.out.println("str1 hasCode: " + System.identityHashCode(str1));
		System.out.println("str2 hasCode: " + System.identityHashCode(str2));
		System.out.println("str3 hasCode: " + System.identityHashCode(str3));
		
		// 실제 값에대한 비교
		System.out.println("str1 vs str2 : " + str1.equals(str2));
		System.out.println("str2 vs str3 : " + str2.equals(str3));
		
		// 얕은복사(shallow copy)
		// 주소를 복사해주기 떄문에 원본값이 바뀌면 복사본도 바뀐다.
		
		str1 = "bye";
		System.out.println(str2);
		
		// 문자열을 불변 (immutable)
		// 문자열의 값은 바뀌지 않는다.

	}
}
