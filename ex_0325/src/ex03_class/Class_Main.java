package ex03_class;

public class Class_Main {
	public static void main(String[] args) {
		// 자동차 객체 c를 만든다.
		Car c = new Car();
		
		// 클래스에 선언된 필드를 사용하는법
		// 객체명.필드명;
		System.out.printf("바퀴에 갯수는 %d개 입니다. \n", c.wheel);
		
		// 구현한 메서드를 사용하는 방법은 필드의 사용법과 동일함.
		// 다른 클래스에서 메서드를 사용하려면 객체를 생성한 후 참조변수를 이용해 그 객체의 메서드를 사용해야한다.
		c.ride();
		c.ride();
		c.ride();
		
		// 메서드를 한 번 선언해 두면 필요할 때마다 여러 번 호출하여 사용할 수 있다.
		// 즉, 메서드를 사용하면 반복적인 프로그래밍을 보다 쉽고 간단하게 해결할 수 있다.
		
		// 가족 구성원 객체를 생성
		Family father = new Family();
		Family son = new Family();
		
		// 정적변수는 클래스명.필드명을 통해 대입이나 출력을 한다.
		Family.address = "인천";
		System.out.println(father.address);
		System.out.println(son.address);
		
		
		// 정적 변수와 정적 메서드의 경우에는
		// 객체 생성없이 사용할 수 있다.
		
		System.out.println(Student.schoolName);
		Student.goToSchool();
		System.out.println();
		
		// 필드
		// 일반 필드 -> 객체마다의 상태 (이름, 나이, 직업, 키, 몸무게 ....)
		// 정적 필드 -> 객체 공통의 상태 (눈, 코, 귀, 입 갯수들...)
		Student stu1 = new Student();
		stu1.studentName = "홍길동";
		stu1.hello();
		
		
		// 메서드
		// 메서드는 메서드 안에서 저의할수 없다.
		// 메서드는 메서드 안에사만 호출할 수 있다.
		
		
		
		

	} 
	
}
