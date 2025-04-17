package ex03_polymorphism;

//class Animal {};
//class Pig extends Animal {};
//class Cow extends Animal {};

abstract class Animal {
	public abstract void cry();
};

//추상 클래스를 상속 받으면 반드시 추상 메서드를 오버라이드 해야 한다.
class Pig extends Animal {
	@Override
	public void cry() {
		System.out.println("꿀꿀");
	}
};

class Cow extends Animal {
	@Override
	public void cry() {
		System.out.println("음메");
	}
};

class Farm {
	public void sound (Animal animal) {
		if (animal instanceof Pig) {
//			System.out.println("꿀꿀");
		} else {
//			System.out.println("음메");
		}
	}	
}

public class FarmTest {
	public static void main(String[] args) {
		Farm f = new Farm();
		Pig p = new Pig();
		Cow c = new Cow();
		c.cry();
		p.cry();
//		f.sound(p);
//		f.sound(c);
	}
}
