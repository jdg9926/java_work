package ex03_polymorphism;

public class Apple extends Computer {
	@Override
	public void powerOn() {
		super.powerOn();
		System.out.println("사랑해요 Apple");
	}
}
