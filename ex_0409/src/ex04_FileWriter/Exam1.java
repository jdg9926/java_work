package ex04_FileWriter;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Exam1 {
	public static void main(String[] args) {
		// 메모장 프로그램 만들기
		// 사용자가 키보드로 입력한 내용을 "memo.txt"에 저장하고
		// 입력이 종료되면 해당 파일의 내용을 다시 읽어서 화면에 출력하기
		
		// 사용자로부터 여러 줄의 텍스트를 입력받는다.
		// 사용자가 exit를 입력하면 종료합니다.
		
		// 메모 입력 (exit 입력 시 종료):
		// > 오늘 날씨가 좋다.
		// > 내일은 시험이다.
		// > exit
		//
		// 저장 완료. 저장된 메모 내용:
		// 오늘 날씨가 좋다.
		// 내일은 시험이다.
		// 다 했으면 단어별로 개수 체크
		Scanner sc = new Scanner(System.in);
		
		FileWriter fw = null;
		List<String> arrStr = new ArrayList<>();
		try {
			fw = new FileWriter("D:\\full_stack_psh\\memo.txt");
			
			while (true) {
				System.out.print("메모 입력 (exit 입력 시 종료) : ");
				String scStr = sc.nextLine();
				if (scStr.equalsIgnoreCase("exit")) {
					break;
				}
				arrStr.add(scStr);
				fw.write(scStr + "\n");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (fw != null) { 
					fw.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
		FileReader fr = null;
		try {
			fr = new FileReader("D:\\full_stack_psh\\memo.txt");
			
			Map<String, Integer> ReadMap = new HashMap<String, Integer>();
			
			for (String data : arrStr) {
				String[] datas = data.split(" ");
				for (String result : datas) {
					if (!result.isEmpty()) {
						ReadMap.put(result, ReadMap.getOrDefault(result, 0) + 1);
					}
				}
			}
			
			for (Entry<String, Integer> entry : ReadMap.entrySet()) {
				System.out.println(entry.getKey() + " : " + entry.getValue());
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			
		} finally {
			try {
				if (fr != null) {
					fr.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
		
//		try {
//			FileWriter fw = new FileWriter("D:\\full_stack_psh\\memo.txt");
//			FileReader fr = null;
//			while (true) {
//				System.out.print("메모 입력 (exit 입력 시 종료) : ");
//				String scStr = sc.nextLine();
//				
//				if (scStr.equalsIgnoreCase("exit")) {
//					fw.close();
//					System.out.println("저장 완료 저장된 메모 내용");
//					fr = new FileReader("D:\\full_stack_psh\\memo.txt");
//					
//					List<String> ArrStr2 = new ArrayList<>();
//					int code = 0;
////					String str = "";
////					while ((code = fr.read()) != -1) {
////						str += (char) code;
////					}
//					ArrStr2.add(scStr);
//					
////					ArrStr2.split(" ");
//					
//			        // HashMap을 사용하여 카운트
//			        Map<String, Integer> countMap = new HashMap<>();
////			        System.out.println(Arrays.asList(ArrStr));
//			        for (String item : ArrStr2) {
//			            String[] words = item.toLowerCase().split(" ");
//			            for(String word : words) {
//			               if(word.isEmpty())continue;
//			               countMap.put(word,countMap.getOrDefault(word, 0)+1);
//			            }
//			        }
//			        // hello world
//			        // hello java
//			        // i love java
//
//			        // 결과 출력
//			        for (Map.Entry<String, Integer> entry : countMap.entrySet()) {
//			            System.out.println(entry.getKey() + ":" + entry.getValue());
//			        }					
//					
//					break;
//				} else {
//					fw.write(scStr + " \n");
//				}
//			}
//			
//			fr.close();
//			System.out.println("프로그램 종료");
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
	}
}
