package ex02_lamda;

public class CalculatorImpl implements MyCalculator {

	//추상메서드를 오버라이딩
	@Override
	public int plus(int num1, int num2) {
		return num1 + num2;
	}
}
