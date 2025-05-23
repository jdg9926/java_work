package ex_01_innerClass;

import java.util.List;

// 요구사항
// 어떤 메서드에서 텍스트 파일을 처리
// 처리 도중에 줄 수를 세주는 기능이 필요하다.
// 이 기능은 다른곳에서 사용되지 않는다.
// 이러한 경우 지역 내부 클래스로 캡슐화 한다.
public class FileProcessor {
	public void processFile (List<String> lines) {
		class LineCounter {
			int countLines() {
				return lines.size(); // size() == 배열의 length랑 같은 역할
			}
		}
		
		LineCounter counter = new LineCounter();
		int totalLines = counter.countLines();
		
		System.out.println("총 줄 수 :: " + totalLines);
		
		for (String line : lines) {
			System.out.println("> : " + line);
		}
	}
}
