package ex02_BufferedReader;

import java.io.BufferedReader;
import java.io.FileReader;

public class Ex01_BufferedReader {
	public static void main(String[] args) {
		FileReader reader = null;
		BufferedReader br = null;
		
		try {
			reader = new FileReader("D:\\full_stack_psh\\book.txt");
			br = new BufferedReader(reader);
			
			String str = "";
			// 버퍼는 문자를 저장하기 때문에 한번에 불러오는것이 가능하다.
			while ((str = br.readLine()) != null) {
				System.out.println(str);
			}
		} catch (Exception e) {
			e.printStackTrace();
			
		} finally {
			try {
				if (br != null) {
					br.close();
				}
				
				if (reader != null) {
					reader.close();
				}
				
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
}
