package ex02_FileIOutputStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

// 학생의 이름과 점수를 입력받아 scores.txt저장 이어쓰기를 한다.
// 마지막에는 파일 내용을 읽어 콘솔에 출력하는 기능 구현하기
public class Exam2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		FileInputStream fis = null;
		try {
			FileOutputStream fos = new FileOutputStream("D:\\full_stack_psh\\scores.txt", true);
			
			while (true) {
				System.out.print("이름 입력 : ");
				String scName = sc.next();
				
				if (scName.equalsIgnoreCase("exit")) {
					break;
				}
				
				System.out.print("점수 입력 : ");
				String scNum = sc.next();
				String ch = "";

				String str = scName + " : " + scNum + "\n";

				System.out.println("str : " + str);
				for (int i = 0 ; i < str.length(); i++) {
					ch += (char)(str.charAt(i) + 3);
				}
				
//				fos.write(str.getBytes());
				fos.write(ch.getBytes());
			}
			
			File f = new File("D:\\full_stack_psh\\scores.txt");
			byte[] b_read = new byte[(int)f.length()];
			
			fis = new FileInputStream(f);
			fis.read(b_read);
			
			String res = new String(b_read);
			String ch2 = "";
			for (int i = 0 ; i < res.length(); i++) {
				ch2 += (char)(res.charAt(i) -3);
			}
			
			System.out.println("현재 저장된 점수 목록");
			System.out.println(ch2);
			
		} catch (Exception e) {
			e.printStackTrace();
			
		} finally {
			try {
				if (fis != null) {
				fis.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
