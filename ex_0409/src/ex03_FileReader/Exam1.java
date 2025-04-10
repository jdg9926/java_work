package ex03_FileReader;

import java.io.FileReader;

public class Exam1 {
	public static void main(String[] args) {
		// test.txt 파일을 만들고 한글, 영어(대문자,소문자) 섞어서 작성
		// test.txt 파일의 내용을 읽어와서
		// 영어 대문자의 개수, 소문자의 개수를 판별하여 출력하세요.
		// 대문자 : x개
		// 소문자 : x개
		
		try {
			FileReader fr = new FileReader("D:\\full_stack_psh\\test.txt");
			int code = 0;
			
//			System.out.println(fr.read());
			String str = "";
			while ((code = fr.read()) != -1) {
				System.out.println(code + " : " + (char) code);
				str += (char) code;
				
			
			}
			System.out.println(str);

			int kor = 0;
			int B_eng = 0;
			int S_eng = 0;
			
			for (int i = 0 ; i < str.length(); i++) {
				if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
					B_eng++;
					
				} else if(str.charAt(i) >= 'a'  && str.charAt(i) <= 'z') {
					S_eng++;
					
				} else {
					kor++;
				}
			}
			System.out.printf("대문자 : %d개 \n소문자 : %d개 \n한글 : %d개", B_eng, S_eng, kor);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
