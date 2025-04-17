package ex02_lamda;

@FunctionalInterface
public interface Iadd {
	int add(int x, int y);
	
	// 인터페이스에서 System.out.println 쓰는 방법
	// default 접근제한자를 가진 메서드는 정의가 가능하다.
	default void f () {
		System.out.println("Hi");
	}
}
