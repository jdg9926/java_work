package ex02_FileInputStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Exam01 {
	public static void main(String[] args) {
		// file.txt 파일을 만들고
		// 문장을 입력하고 저장을한다.
		// FileInputStream으로 읽어온 뒤 회문인지 아닌지 검증하세요.
		
		String path = "D:\\full_stack_psh\\file.txt";
		
		File f = new File(path);
		byte[] b_read = new byte[(int)f.length()];
		
		if (f.exists()) {
			try {
				FileInputStream fis = new FileInputStream(f);				
				fis.read(b_read);
				String res = new String(b_read);
				
				StringBuilder stb = new StringBuilder(res);
				stb.reverse();

				System.out.println(res + " : " + stb);
				if (res.equals(stb)) {
					System.out.println("회문입니다.");
					
				} else {
					System.out.println("회문이 아닙니다.");
				}
				
			} catch (FileNotFoundException e) {
				e.printStackTrace();
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
