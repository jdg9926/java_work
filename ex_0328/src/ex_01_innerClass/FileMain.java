package ex_01_innerClass;

import java.util.List;

public class FileMain {
	public static void main(String[] args) {
		List<String> content = List.of(
			  "첫번째 줄"
			, "두번째 줄"
			, "세번째 줄"
		);
		FileProcessor processor = new FileProcessor();
		processor.processFile(content);		
	}
}
