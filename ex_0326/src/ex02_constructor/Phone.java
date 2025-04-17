package ex02_constructor;

public class Phone {
	String brand;
	int series;
	String color = "검정색";

	
	// 자바에서는 외부에서 제공할 수 있는 데이터만큼만 매개변수로 전달하여 객체를 생성할 수 있다.
	// 생성자를 다양한 형태로 선언하는 것을 '생성자 오버로딩' 이라고 한다.
	
	// 오버로딩 규칙
	// 1. 매개변수의 개수가 다를 때
	// 2. 매개변수의 개수가 같아도 자료형이 다를 때
	// 3. 생성자나 메서드의 이름은 그대로 사용해야 한다.
	public Phone (String b, int s) {
		brand = b;
		series = s;
	}
	
	
	// this()
	// 같은 클래스 안에 있는 생서자 중 매개변수의 개수, 자료형, 순서에 맞는
	// 다른 생성자를 호출하는 메서드로 생성자 내부에서만 사용할 수 있다.
	public Phone (String b, int s, String c) {
		// brand = b;
		// series = s;
		this(b, s); // this()는 첫줄에서만 사용할 수 있다.
		color = c;
	}
	
	public void phoneInfo () {
		System.out.println(color + " " + brand + " " + series);
	}
}
