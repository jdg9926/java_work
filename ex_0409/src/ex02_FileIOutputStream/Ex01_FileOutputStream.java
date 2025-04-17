package ex02_FileIOutputStream;

import java.io.FileOutputStream;

public class Ex01_FileOutputStream {
	public static void main(String[] args) {
		FileOutputStream fos = null;
				
		try {
			fos = new FileOutputStream("D:\\full_stack_psh\\fileOut.txt");
			
			fos.write('f');
			fos.write('i');
			fos.write('l');
			fos.write('e');
			
			String msg = "fileOutput 예제입니다.\n";
			String msg2 = "여러줄도 가능\n";
			
			String msg3 = """
					여러줄
					문자열
					리터럴
					""";
			String msg4 = "asdasdasd";
			for (int i = 0 ; i < 2; i++) {
				fos.write(msg.getBytes());
			}
			fos.write(msg2.getBytes());
			fos.write(msg3.getBytes());
			fos.write(msg4.getBytes());
			
		} catch (Exception e) {
			
		} finally {
			// 경로에 파일이 없으면 파일을 만들어준다.
			// write를 한 내용까지 작성을 해준다.
			// 확장자도 마음대로 지정할 수 있다.
			try {
				if (fos != null) {
					System.out.println("파일 생성 완료");
					fos.close();
				}
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
				
	}
}
