package ex03_polymorphism;

class Animal2 {
	public void cry() {};
}
class Pig2 extends Animal2 {
	@Override
	public void cry() {
		System.out.println("꿀꿀");
	}
}
class Cow2 extends Animal2 {
	@Override
	public void cry() {
		System.out.println("꿀꿀");
	}
}

class Farm2 {
	public void sound(Animal2 animal) {
		animal.cry();
	}
}

public class FormTest2 {
	public static void main(String[] args) {
		Farm2 f = new Farm2();
		Pig2 p = new Pig2();
		Cow2 c = new Cow2();
		f.sound(p);
		f.sound(c);
	}
}
