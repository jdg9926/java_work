package ex01_FileInputStream;

import java.io.IOException;
import java.util.Scanner;

public class Ex01_FileInputStream {
	public static void main(String[] args) {
		byte[] keyboard = new byte[100];
		
		System.out.println("값 : ");
		
		// Scanner sc = new Scanner(System.in);
		// System : System클래스
		// in : input스트림 객체를 의미
		// System.in : 표준 입력 스트림
		
		// 표준입력스트림	
		// 자바에서 프로그램이 외부로부터 데이터를 입력받을 수 있게 해주는 기본 통로
		// 기본대상 : 키보드
		
		// 사용자가 키보드로 입력한 값을 keyborad 배열에 저장
		// 사용자가 엔터를 입력할 때까지 입력을 받는다.
		// 엔터키 값까지 포함되어 저장
		try {
			System.in.read(keyboard);
			
			String s = new String(keyboard).trim();
			System.out.println(s);
			
			Scanner sc = new Scanner(System.in);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
