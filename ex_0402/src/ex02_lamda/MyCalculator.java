package ex02_lamda;

@FunctionalInterface // 어노테이션을 선언한 순간 인터페이스는 무조건 1개의 추상 메서드가 있어야 한다.
public interface MyCalculator {
	int plus(int num1, int num2);
}
