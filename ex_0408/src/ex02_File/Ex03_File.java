package ex02_File;

import java.io.File;

public class Ex03_File {
	public static void main(String[] args) {
		String path = "D:\\full_stack_psh\\aaa\\bbb";
		
		File f = new File(path);
		
		// exists()
		// 목적지까지의 경로가 존재하면 true
		if (!f.exists()) {
			System.out.println("폴더생성");
			
			// mkdris
			// 복수의 폴더를 생성한다.
			f.mkdirs();
		}
		
		// File 클래스의 역할
		// 폴더를 만들어준다거나
		// 목적지까지의 검증(파일, 폴더, 존재하는지)
		// 폴더일때 목록의 반환
		// 목적지의 크기도 반환
	}
}
