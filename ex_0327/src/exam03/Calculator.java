package exam03;

public abstract class Calculator {

	// 합 메서드
	public abstract int add (int a, int b);
	
	// 차 메서드
	public abstract int substract (int a, int b);
	
	// 평균 메서드
	public abstract double average (int[] a);
}

class Calc extends Calculator  {

	@Override
	public int add(int a, int b) {
		return a + b;
	}

	@Override
	public int substract(int a, int b) {
		return a - b;
	}

	@Override
	public double average(int[] a) {
		int num = 0;
		for (int i = 0 ; i < a.length; i++) {
			num += a[i];
		}
		return num / a.length;
	}
}
