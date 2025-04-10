package ex04_FileWriter;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Test {
   public static void main(String[] args) {
      //메모장 프로그램 만들기
      //사용자가 키보드로 입력한 내용을 "memo.txt"에 저장하고
      //입력이 종료되면 해당 파일의 내용을 다시 읽어서 화면에 출력하기
      //사용자로부터 여러 줄의 텍스트를 입력받는다.
      //사용자가 exit 입력하면 종료합니다.
            
//      메모 입력 (exit 입력 시 종료):
//         > 오늘 날씨가 좋다.
//         > 내일은 시험이다.
//         > exit
//
//         저장 완료. 저장된 메모 내용:
//         오늘 날씨가 좋다.
//         내일은 시험이다.
      
//단어의 빈도수
//오늘 : 1
//날씨가 : 1
//좋다 : 1
      
      Scanner sc = new Scanner(System.in);
      List<String> lines = new ArrayList<>();
      //1. 사용자의 입력을 받아서 파일에 쓰기
      FileWriter fw = null;
      FileReader fr = null;
      try {
         fw = new FileWriter("D:\\full_stack_psh\\memo.txt");
         System.out.println("메모 입력(exit 입력 시 종료):");
         
         while(true) {
            System.out.print("> ");
            String line = sc.nextLine();
            if(line.equalsIgnoreCase("exit")) {
               break;
            }
            
            //메모장에 쓰기 전에 ArrayList에 추가
            lines.add(line);
            fw.write(line+"\n");
         }
         System.out.println("저장 완료");
      } catch (Exception e) {
    	  e.printStackTrace();
      } finally {
         try {
            if(fw != null) {
               fw.close();
            }
         } catch (Exception e2) {
            // TODO: handle exception
         }
      }
      
      //단어별 빈도수 계산
      //Hello world
      //hello Java
      //I love Java
      
      //Hello : 2
      //world : 1
      //java : 2
      //I : 1
      //love : 1
      
      Map<String, Integer> wordCount = new HashMap<>();
      
      for(String line : lines) {
         String[] words = line.toLowerCase().split(" ");
         for(String word : words) {
            if(word.isEmpty())continue;
            wordCount.put(word,wordCount.getOrDefault(word, 0)+1);
         }
      }
      
      //result.txt에 저장
      try {
         fw = new FileWriter("D:\\full_stack_lhj\\3.JAVA\\result.txt");
         for(Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            fw.write(entry.getKey() + " : " + entry.getValue());
         }
         System.out.println("단어 빈도수 저장 완료");
         fw.close();
      } catch (Exception e) {
         // TODO: handle exception
      }
         
      //3. 파일에서 내용 읽어오기
      System.out.println("저장된 메모 내용");
      try {
         fr = new FileReader("D:\\full_stack_lhj\\3.JAVA\\memo.txt");
         int read = 0;
         while((read=fr.read()) != -1) {
            System.out.print((char)read);
         }
      } catch (Exception e) {
         // TODO: handle exception
      } finally {
         try {
            if(fr != null) {
               fr.close();
            }
         } catch (Exception e2) {
            // TODO: handle exception
         }
      }
   }
}
