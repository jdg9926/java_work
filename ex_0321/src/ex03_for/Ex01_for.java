package ex03_for;

import java.util.Scanner;

public class Ex01_for {
	public static void main(String[] args) {
		// 반복문
		// 특정 명령을 원하는 만큼 반복하여 실행하는 제어문
		// for, while
		
		// for
		// 주로 반복 횟수가 정해져있을 때 사용하는 문법
		
		// for (초기식; 조건식; 증감식) {
		//     반복하고자 하는 명령
		// }
		
		// 초기식 : 반복을 하기 위한 시작값으로 변수를 하나 초기화 한다.
		// 조건식 : 반복을 위한 종료값으로 비교연산자를 많이 사용한다.
		// 증감식 : 초기식에 있는 변수의 값을 증감시켜주는 역할을 한다.
		
		for (int i = 0; i <= 3; i++) {
			System.out.println(i);
		}
		
		int i = 0;
		for (; i <= 3; i++) {
			System.out.println(i);
		}
		
		int j = 0;
		for (; j <= 3;) {
			System.out.println(j);
			j++;
		}
		
		// 초기식에 들어가는 변수 i를 무조건 사용할 필요는 없다.
		// 사용하는게 좋을거 같을 때 쓰면 된다.
		
		
		// 1부터 10까지 출력하는 for 문 작성하기
		for (i = 0; i <= 10; i++) {
			System.out.print(i + " ");
		}
		System.out.println("");
		// 10부터 1까지 출력하는 for 문 작성하기
		for (i = 10; i >= 0; i--) {
			System.out.print(i + " ");
		}
		
		System.out.println("");
		// 1부터 10까지 3의 배수만 출력하는 for문 작성하기
		for (i = 1; i <= 10; i++) {
			if (i % 3 == 0) {
				System.out.print(i + " ");
			}
		}
		
		System.out.println("");
		// 1부터 10까지 총합 구하기
		int sum = 0;
		for (i = 1; i <= 10; i++) {
			sum += i;
		}
		System.out.println(sum);
		
		// 키보드에서 정수를 하나 입력받아
		// 해당 단의 구구단 출력하기
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력한 숫자 : ");
		int number = sc.nextInt();
		
		for (i = 1; i < 10; i++) {
			System.out.println(number + " X " + i + " = " + number * i);
		}
		
		// 키보드에서 정수 n을 입력받아
		// 1부터 정수 n까지의 총합을 계산하여 결과 출력하기
		sum = 0;
		for (i = 1; i <= number; i++) {
			sum += i;
		}
		System.out.printf("%d ~ %d 까지의 총 합은 : %d 입니다. \n",1 , number, sum);
		
		// 10개의 정수를 입력받아 그 중 짝수의 개수가 몇개인지 구하세요.
		int count = 0;
		for (i = 1; i <=10; i++) {
//			System.out.print("입력할 정수 : ");
//			int test = sc.nextInt();
//			if (test % 2 == 0) { 
//				count++;
//			}
		}
//		System.out.printf("입력한 정수중 짝수의 개수는 : %d 개 입니다. \n", count);
		// 1 + (1+2) + (1+2+3) + (1+2+3+4)+ ... +(1+2+3+4+ ... +10)
		int total = 0;
		int totalsum = 0;
		for (i = 1; i <= 10; i++) {
//			total += i * (i + 1) / 2;
			total += i;
			totalsum += total;
			
		}
		System.out.printf("total 의 총 합은 : %d \n", totalsum);
		
		// 양의 정수 x를 키보드에서 입력받아
		// x가 홀수면 x이하의 홀수인 정수의 합을 구하고
		// x가 짝수면 x이하의 짝수인 정수의 제곱의 합을 구하세요.
		// ex) x가 7(홀수) 이면 1+3+5+7 = 16
		//     x가 10(짝수) 이면 2x2 + 4x4 + 6x6 + 8x8 + 10x10 = 220
		
		total = 0;
		if (number % 2 == 0) {
			for (i = 0; i <= number; i++) {
				if (i % 2 == 0) {
					total += (i*i);
				}
			}
			
		} else {
			for (i = 0; i <= number; i++) {
				if (i % 2 == 1) {
					total += i;
				}
			}
		}
		
		System.out.printf("입력받은 number 값은 : %d 이므로 total 의 값은 %d 입니다.", number, total);
	}
}
