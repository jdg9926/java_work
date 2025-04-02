package ex03_Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        // Scanner를 사용하여 사용자로부터 문장 입력 받기
    	// 문장 입력: hello world hello java world
        Scanner sc = new Scanner(System.in);
        System.out.print("문장 입력: ");
        String[] arrStr = sc.nextLine().split(" ");  // 공백을 기준으로 문자열을 분리

        // HashMap을 사용하여 각 단어의 등장 횟수를 저장
        Map<String, Integer> map = new HashMap<>();

        // 각 단어에 대해 등장 횟수를 세기
        for (String s : arrStr) {
            map.put(s, map.getOrDefault(s, 0) + 1);
        }

        System.out.println(map);
        // 결과 출력
        System.out.println("단어별 등장 횟수:");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
