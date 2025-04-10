package ex03_FileReader;

import java.io.FileReader;

public class Ex01_FileReader {
	public static void main(String[] args) {
		FileReader fr = null;
		
		try {
			fr = new FileReader("D:\\full_stack_psh\\text.txt");
			int code = 0;
			
			while ((code = fr.read()) != -1) {
				System.out.print((char) code);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
