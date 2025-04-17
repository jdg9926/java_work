package ex02_FileIOutputStream;

import java.io.FileOutputStream;
import java.util.Scanner;

public class Exam1 {
	public static void main(String[] args) {
		// 학생의 이름과 점수를 저장하는 프로그램
		// 이름과 점수를 FileOutputStream을 이용하여 scores.txt파일에 저장하세요
		
		// 요구사항
		// 1. 사용자로부터 이름과 점수를 입력받는다.
		// 2. 입력받은 데이터를 "이름 : 점수 \n" 형식으로 문자열로 만들어 파일에 쓴다
		//    ex) "김철수 : 84"
		// 3. 이름에 exit 를 입력하면 프로그램 종료
		// 4. 파일은 scores.txt로 저장되며, 기존 내용은 덮어씁니다.
		// 5. "이름 : 점수" 형식의 문자열의 각 문자의 char값을 +3 을 하여 암호화한다.
		
		Scanner sc = new Scanner(System.in);
		FileOutputStream fos = null;
		
		try {
			fos = new FileOutputStream("D:\\full_stack_psh\\scores.txt");
			while (true) {
				System.out.print("이름 입력 : ");
				String scName = sc.next();
				
//				if (scName.equals("exit")) {
//					break;
//				}
				
				// 대문자 무시하고 값을 검증 
				if (scName.equalsIgnoreCase("exit")) {
					break;
				}
				System.out.print("점수 입력 : ");
				String scNum = sc.next();

				String str = scName + " : " + scNum + "\n";
				String ch = "";
				
				System.out.println("str : " + str);
				for (int i = 0 ; i < str.length(); i++) {
					
					ch += (char)(str.charAt(i) + 3);
					
					System.out.println("Ch :: " + ch);
				}
				System.out.println(ch);
				fos.write(ch.getBytes());
			}
		} catch (Exception e) {
			e.printStackTrace();
			
		} finally {
			try {
				if (fos != null) {
					System.out.println("생성되었습니다.");
					fos.close();
					
				}
			} catch (Exception e2) {
				System.out.println("생성에 실패하였습니다.");
			}
		}
		
		System.out.println("프로그램 종료");
	}
}
