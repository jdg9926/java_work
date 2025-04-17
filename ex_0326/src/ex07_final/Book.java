package ex07_final;

public class Book {
	String title = "홍길동전";
	int price = 25000;
	final int price2 = 25000; // 상수 : 다른값을 대입할 수 없다. 
	
	void test () {
		System.out.println(price);
	}
	
	// final 메서드
	// 자식클래스에서 오바라이드 할 수 없다.
	public final void info_title() {
		System.out.println("책의 제목은 " + title + "입니다.");
	}
	public final void info_price() {
		System.out.println("책의 가격은 " + price + "입니다.");
	}
	
	public final void info_price2() {
		System.out.println("책의 가격은 " + price2 + "입니다.");
	}
}
