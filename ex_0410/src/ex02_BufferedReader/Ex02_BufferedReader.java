package ex02_BufferedReader;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex02_BufferedReader {
	public static void main(String[] args) {
		// BufferedReader 를 이용해서 키보드에서 값을 입력받는다
		// 장점 : Scanner 보다 속도가 빠르다.
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			System.out.print("문자열 입력");
			String str = reader.readLine();
			
			// 정수 입력
			System.out.print("정수 입력");
			int n = Integer.parseInt(reader.readLine());
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
