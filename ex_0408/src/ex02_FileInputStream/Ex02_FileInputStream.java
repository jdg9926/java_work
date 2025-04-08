package ex02_FileInputStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Ex02_FileInputStream {
	public static void main(String[] args) {
		String path = "D:\\full_stack_psh\\text.txt";
		
		File f = new File(path);
		
		byte[] b_read = new byte[(int)f.length()];
		
		FileInputStream fis = null;
		InputStreamReader isr = null;
		if (f.exists()) {
			try {
				fis = new FileInputStream(f);
				isr = new InputStreamReader(fis,"UTF-8");
				
				
				// 파일에서 읽어온 내용을 바이트배열에 담는다.
				// read() : 1바이트씩 읽어온다.
				// read(byte[] b) : 한번에 읽어와서 배열에 담는다.
				fis.read(b_read);
				
				// 문자열 객체의 생성자에 바이트배열을 전달함으로써 문자열로 변환이 가능하다.
				String res = new String(b_read);
				
				String res1 = new String(b_read, "UTF-8"); // ISO-8859-1로 시도
				
				System.out.println(res);
				System.out.println(res1);
				
//				�ȳ��ϼ���abc
			} catch (Exception e) {
				
			} finally {
				try {
					if (fis != null) {
						fis.close();
					}
				} catch (Exception e) {
					
				}
			}
		}
	}
}
