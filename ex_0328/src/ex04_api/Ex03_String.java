package ex04_api;

import java.util.Arrays;

public class Ex03_String {
	public static void main(String[] args) {
		String str = "Kim mal Ddong";
		
		// length(String s)
		// 문자열의 길이를 반환하는 메서드
		System.out.println("str 문자열의 길이 : " + str.length());
		
		// indexOf(Char ch)
		// 인자로 전달된 글자의 인덱스 값을 반환하는 메서드
		// 같은 글자가 여러개 있을 때 가장 먼저 만나는 글자의 index값을 반환
		System.out.println("글자 M의 위치 : " + str.indexOf('D'));
		
		// charAt(int index)
		// 인자로 전달된 인덱스에 해당하는 글자를 반환
		System.out.println("4번 index의 글자 : " + str.charAt(4));
		
		// subString(int start, int end)
		// 일정 인덱스 만큼 글자를 잘라서 반환
		System.out.println("0번 부터 5번 까지 자른 글자 : " + str.substring(0, 5));
		
		// split()
		// 인자로 전달되는 값을 구분자로 문자열을 분할하여 배열형태로 반환
		String[] arr = str.split(" ");
		System.out.println("공백을 잘라서 배열 처리 : " + Arrays.toString(arr));
		
		// replace()
		// 특정 문자열을 치환해주는 메서드
		System.out.println("특정 문자열을 찾아서 찾은 문자열을 치환 : " + str.replace("mal", "Gae"));
		
		// contains()
		// 특정 문자열을 포함하고 있는지 판별
		System.out.println("contains --> " + str.contains("mal"));
		
		// isEmpty()
		// 문자열의 길이가 0인 경우 true 반환
		System.out.println("isEmpty --> " + str.isEmpty());
		
		// trim()
		// 앞 뒤 공백 제거
		String str2 = "     test1";
		System.out.println("trim : " + str2.trim());
		
		// concat()
		// 두 개의 문자열을 이어 붙힌다.
		System.out.println("concat : " + str.concat(str2));
		
		// startWith()
		// 인자로 전달된 문자열로 시작하는지 확인
		System.out.println("startWith : " + str.startsWith("Kim"));
		
		// endsWith()
		// 인자로 전달된 문자열로 시작하는지 확인
		System.out.println("endsWith : " + str.endsWith("Ddong"));
		
	}
}

