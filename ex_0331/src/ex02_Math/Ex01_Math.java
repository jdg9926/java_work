package ex02_Math;

public class Ex01_Math {
	public static void main(String[] args) {
		// 수학에서 자주 사용하는 상수들과 함수들을
		// 미리 구현해놓은 클래스로 자바에서 수학 계산이 필요할 때 사용한다.
		// 객체를 선언하지 않고 바로 사용할 수 있도록 해당 클래스가 
		// 제공하는 모든 메서드는 모두 정적 메서드로 이루어져 있다.
		
		// ceil(); 
		// 올림
		System.out.println("3.55 올림 : " + Math.ceil(3.55));
		
		// floor();
		// 내림
		System.out.println("3.55 내림 : " + Math.floor(3.55));
		
		// round()
		// 반올림
		System.out.println("3.55 반올림 : " + Math.round(3.55));
		
		// abs()
		// 절대값
		System.out.println("3.55 절대값 : " + Math.abs(3.55));
		
		// max()
		// 최대값 구하기
		System.out.println("30, 60 최대값 : " + Math.max(30, 60));
		
		// min()
		// 최소값 구하기
		System.out.println("30, 60 최소값 : " + Math.min(30, 60));
		
		// 배열에서 최대값 찾기
		int[] numbers = {3,7,2,9,4,10,6};
		int num = numbers[0];
//		for (int i = 0; i < numbers.length; i++) {
//			if (num < numbers[i]) {
//				num = numbers[i];
//			}
//		}
		for (int arr : numbers) {
			if (num < arr) {
				num = arr;
			}
		}
		System.out.println(num);
		
		// 소수점 둘째자리에서 반올림
		double pi = 3.141592;
		double result = Math.round(pi * 100.0) / 100.0;
		System.out.println(result);
		
		// pow()
		// 거듭제곱
		System.out.println("2의 0제곱 : " + Math.pow(2, 0));
		System.out.println("2의 1제곱 : " + Math.pow(2, 1));
		System.out.println("2의 2제곱 : " + Math.pow(2, 2));
		System.out.println("2의 3제곱 : " + Math.pow(2, 3));
		
		// sqrt()
		// 제곱근(루트)
		System.out.println("16의 제곱근 : " + Math.sqrt(16));
		
		// random()
		// 난수 생성
		// 0.0 이상 1.0 미만의 double난수 생성
		System.out.println((int)(Math.random() * 100));
	
			
	}
}
