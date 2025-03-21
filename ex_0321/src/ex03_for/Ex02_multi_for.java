package ex03_for;

public class Ex02_multi_for {
	public static void main(String[] args) {
		// for문안에 또 다른 for문을 사용하는 경우
		// 반복문을 반복하는것
		// for (초기식; 조건식; 증감식) {
		//     반복하고자 하는 명령
		//     for (초기식; 조건식; 증감식) {
		//         반복하고자 하는 명령
		//     }
		// }
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.println(i + " : " + j);
			}
		}
		
		// A B C D
		// E F G H
		// I J K L
		char ch = 'A';
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print(ch++ + " ");
			}
			System.out.println();
		}
		
		// 두 개의 주사위가 던져졌을때, 눈의 합이 6이 되는 모든 경우의 수를 출력하는 프로그램을 작성하시오.
		// 1-5, 2-4, 3-3, 4-2, 5-1
		int count = 0;
		for (int i = 1; i <= 6; i++) {
			for (int j = 1; j <= 6; j++) {
				if (i + j == 6) {
					count++;
				}
			}
		}
		System.out.printf("두 주사위의 눈 합이 6이 되는 모든 경우의 수는 : %d 번 입니다.", count);
	}
}
