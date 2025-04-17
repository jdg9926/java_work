package ex01_inheritance;

public class AnimalMain {
	public static void main(String[] args) {
		Cat cat = new Cat();
		System.out.println("---고양이---");
		System.out.println("눈의 개수 : " + cat.eye);
		System.out.println("다리 개수 : " + cat.leg);
		System.out.println("다리 개수 : " + cat.cute);
		Dog dog = new Dog();
		System.out.println("---강아지---");
		System.out.println("눈의 개수 : " + dog.eye);
		System.out.println("다리 개수 : " + dog.leg);
		System.out.println("다리 개수 : " + dog.smell);
	}
}

