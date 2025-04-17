package ex02_constructor;

public class Snak_main {
	public static void main(String[] args) {
		// 생성자 : 특수한 기능을 가진 메서드다.
		// 메서드는 선언을 한 뒤 -> 호출
		
		Snak chip = new Snak(5000);
		chip.info();
		Snak fries = new Snak(3000);
		fries.info();
	}
}
