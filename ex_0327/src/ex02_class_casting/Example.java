package ex02_class_casting;

class Parent {
	
}

class Child extends Parent {
	
}

public class Example {
	public static void main(String[] args) {
		Parent p1 = new Parent(); //p1 객체 생성
		Child c1 = new Child();   //c1 객체 생성
		
		Parent p2 = new Child(); // 자동 타입 변환
		Parent p3 = c1;			 // 자동 타입 변환
		//Child c2 = p1;         // 자동 타입 변환이 되지 않음
		
		//기본 자료형끼리 비교를 할 때 == 연산자는 값이 같은지 비교하지만
		//객체끼리 비교를 할 때 == 연산자는 주소값이 같은지 비교한다.
		if (p3 == c1) {
			System.out.println("p3와 c1은 같은 객체를 참조하고 있습니다.");
		}
	}
}
