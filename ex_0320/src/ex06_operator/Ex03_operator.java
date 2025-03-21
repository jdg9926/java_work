package ex06_operator;

public class Ex03_operator {
	public static void main(String[] args) {
		
		// 비트연산자
		// 논리연산자와 유사하지만 bit단위의 연산만 가능하다.
		// & 논리곱(and) 두 항이 모두 참이면 참 아니면 거짓
		// | 논리합(or) 두 항 중 하나라도 참이면 참 아니면 거짓
		// ^배타적논리합(xor) 두 항이 다르면 참 같으면 거짓
		// ~부정(not) 참을 거짓으로 거짓을 참으로 연산
		
		int a = 10; // 1 0 1 0
		int b = 7;  // 0 1 1 1
		// ------------------- 
		//             0 0 1 0
		//             0 0 2 0 = 2
		int c = a & b;
		System.out.println("c : " + c); // 2

		int a2 = 12; // 1 1 0 0
		int b2 = 8;  // 1 0 0 0
		// --------------------- 
		//              1 1 0 0
		//              8 4 0 0 = 12
		int c2 = a2 | b2;
		System.out.println("c2 : " + c2); // 12
		
		int a3 = 9;  // 1 0 0 1
		int b3 = 11; // 1 0 1 1
		// --------------------- 
		//              0 0 1 0
		//              0 0 2 0 = 2
		int c3 = a3 ^ b3;
		System.out.println("c3 : " + c3); // 2
		
		// ~(not)
		int x = 7; // 0 1 1 1
		System.out.println("~x : " + ~x); // 1 0 0 0
		// ~x 은 -(x + 1) 과 같다.
		// ex -(7 + 1) = -8
		
		// 시프트연산자
		// 비트의 이동
		// <<, >>
		x = 10; // 1 0 1 0
		int result = x << 1; // 1 0 1 0 0
		System.out.println(result); // 20
		
		result = x >> 1;	 // 0 1 0 1
		System.out.println(result); // 5
		
		// 삼항연산자
		// 조건식 ? 참일 때 실행할 명령 : 거짓일 때 실행할 명령;
		int i = 10;
		int i2 = 15;
		result = ++i >= i2 ? 1 : 0;
		System.out.println("result : " + result);
				
	}
}
