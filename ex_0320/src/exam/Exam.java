package exam;

import java.util.Scanner;

public class Exam {
	public static void main(String[] args) {
		// 다음의 결과값을 예상하여 쓰시오
		int x = 5;
		int y = x++;
		
		// x의 값 : 6;
		// y의 값 : 5;
		System.out.println("x : " + x + " y : " + y);
		
		// 다음 연산의 결과를 예상하여 쓰시오
		x = 10;
		y = 20;
		int z = (++x) + (y--);
		
		System.out.println("z : " + z);
		
		// z의 값 : 11 + 20 = 31;
		
		// 다음 연산의 결과를 예상하여 쓰시오
		int a = 10;
		int b = 12;
		
		// ++a >= b || 2 + 7 <= b && 13 - b >= 0 && (a += b) - (a % b) > 10;
		// 11 >= 12 || 2 + 7 <= 12 && 13 - 12 >= 0 && 12 > 10
		//  true && true = true

		System.out.println(++a >= b || 2 + 7 <= b && 13 - b >= 0 && (a += b) - (a % b) > 10);
		
	}
}
