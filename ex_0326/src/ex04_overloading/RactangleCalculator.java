package ex04_overloading;

public class RactangleCalculator {
	
	// 다양한 방식으로 사각형의 넓이 구하기
	// 메서드명 : area
	// 1. 정사각형의 한 변의 길이를 받아 넓이 반환하기
	// 2. 가로 세로 길이를 받아 직사각형의 넓이 반환하기
	// 3. 실수형 가로, 세로를 받아 실수의 넓이 결과 반환하기
	public int area (int x) {	
		return x * x;
	}
	public int area (int x, int y) {
		return x * y;
	}
	public double area (double x, double y) {
		return x * y;
	}
}
