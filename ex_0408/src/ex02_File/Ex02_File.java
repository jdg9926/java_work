package ex02_File;

import java.io.File;
import java.util.Arrays;

public class Ex02_File {
	public static void main(String[] args) {
		String path = "D:\\full_stack_psh";
		
		File f = new File(path);
		
		// isDirectory()
		// 경로가 폴더인지 판별
		if (f.isDirectory()) {
			// list()
			String[] names = f.list();
			
			System.out.println(Arrays.toString(names));
		}
	}
}
