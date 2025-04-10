package ex02_FileIOutputStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Ex03_CopyTest {
	public static void main(String[] args) {
		// read()와 write()를 이용하여 복사
		
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try {
			fis = new FileInputStream("D:\\full_stack_psh\\KakaoTalk_20250409_160856683.jpg");
			fos = new FileOutputStream("D:\\\\full_stack_psh\\\\wall_copy.jpg");
			
			byte[] buffer = new byte[fis.available()];
			
			// 현재 시간을 m/s단위로 나타냄
			long start = System.currentTimeMillis();
			System.out.println("이미지 읽기 시작");
			int read = 0;
			
			// read() 를 통해 읽는다.
			while ((read = fis.read(buffer)) != -1) {
				// 읽어온 내용을 write() 로 쓴다.
				fos.write(buffer, 0, read);
			}
			System.out.println("이미지 읽기 종료");
			
			long end = System.currentTimeMillis();
			
			double time = (double)(end - start) / 1000;
			System.out.println(time + "초");
		} catch (Exception e) {
			e.printStackTrace();
			
		} finally {
			try {
				if (fos != null) {
					fos.close();
				}
				
				if (fis != null) {
					fis.close();
				}
			} catch (Exception e2) {
				
			}
		}
		// 직접 복사하는것보다 바이트배열을 이용하여 이미지를 복사했을때 속도가 매우 빠르다.
	}
}
