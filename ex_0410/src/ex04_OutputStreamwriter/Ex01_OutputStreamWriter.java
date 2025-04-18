package ex04_OutputStreamwriter;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Ex01_OutputStreamWriter {
	public static void main(String[] args) {
		FileOutputStream in = null;
		OutputStreamWriter is = null;
		
		try {
			in = new FileOutputStream("D:\\full_stack_psh\\test.txt");
			is = new OutputStreamWriter(in);
			
			System.out.println("파일 생성 시작");
			String[] strArray =  {
					  "OutputStreamWriter 에 대해서 배웁니다."
					, "we are learning about OutputStreamWriter"
			};
			
			for (String str : strArray) {
				is.write(str+"\n");
			}
			System.out.println("파일 생성 완료");
			
		} catch (Exception e) {
			
		} finally {
			try {
				if (is != null) {
					is.close();
				}
				
				if (in != null) {
					in.close();
				}
				
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
}
