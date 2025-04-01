package ex01_set;


import java.util.HashSet;
import java.util.Scanner;

public class Word {
	public static void main(String[] args) {
		// 사용자가 입력한 문장에서 단어가 중복되었는지 검사하기
		// 중복시 true 아니면 false
		// 예시 - I love java and I love coding
		// 중복 단어 있음
		
		Scanner sc = new Scanner(System.in);
		
		HashSet<String> arr = new HashSet<>();
		
		System.out.print("입력 : ");
		String scStr = sc.nextLine();
		
		String[] str = scStr.split(" ");
        for (String word : str) {
        	System.out.println("word : " + word);
        	if (arr.contains(word)) {
        		System.out.println(word + " 중복 데이터가 존재합니다.");
        	}
            arr.add(word);
        }
	}
}