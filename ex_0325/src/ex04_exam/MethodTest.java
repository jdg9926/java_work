package ex04_exam;

import java.util.Arrays;

public class MethodTest {
	// 배열의 최대값을 찾는 maxFinder 메서드
	// 임의의 배열로 매개변수로 받자.
	public int maxFinder (int[] x) {	
		int num = Arrays.stream(x).max().getAsInt();
		return num;
	}
	// 원의 넓이와 둘레 구하기
	// 함수를 호출하면서 반지름을 받는다.
	// 원의 넓이를 구하는 circleArea
	// 원의 둘레를 구하는 circleRound
	// circleArea는 결과 출력하기 3.14 * r * r
	// circleRound는 결과 반환하기 2 * 3.14 * r
	
	// 원의 넓이
	public void circleArea (double sclength) {
		System.out.println("원의 넓이 : " + (3.14 * sclength * sclength) );
	}
	// 원의 둘레
	public double circleRound (double x) {
		return 2 * 3.14 * x;
	}
	// 계산기 만들기
	// 사칙연산을 할 수 있는 calculator 메서드 만들기
	// 두 수와 연산자를 매개변수로 받는다.
	public void calculator (double x, double y, String z) {
		if (z == "+") {
			System.out.println("z == '+' 이므로 " + (x + y));
		} else if (z == "-") {
			System.out.println("z == '-' 이므로 " +  (x - y));
		} else if (z == "*") {
			System.out.println("z == '*' 이므로 " +  (x * y));
		} else if (z == "/") {
			System.out.println("z == '/' 이므로 " +  (x / y));
		}
	}
	
	// 1 ~ 50 사이의 난수로 생성
	// main 쪽에서 키보드를 통해서 정수를 입력 받는다.
	// check() 메서드를 만들어서 사용자가 입력한 숫자를 판단
	// 발생한 난수보다 크다면 DOWN! 작다면 UP!을 출력
	// 사용자가 입력한 숫자와 발생한 난수가 같을경우 프로그램 종료
	public String check (int x, int rdNumber) {
		if (x == rdNumber) {
			return "true";
			
		} else if (x < rdNumber) {
			return "UP";
			
		} else if (x > rdNumber) {
			return "DOWN";
			
		}
		return "";
	}
	
	// Graph라는 이름의 메인 클래스를 만들어 
	// 0 ~ 9사이의 난수를 100개 저장하는 배열을 만들고, 
	// 해당 배열이 가지고 있는 각 방의 난수를 판별하여 그래프화 해 보자.
	//
	// 단, 발생한 난수의 그래프화 작업은 PrintGraph클래스가 하도록 한다.
	//
	// 결과:
	// 0507...... //난수 100개
	// 0의 갯수 : ############ 12
	// 1의 갯수 : ######### 9
	// 2의 갯수 : ########### 11
	// 3의 갯수 : ######## 8
	// 4의 갯수 : ############## 14
	// 5의 갯수 : ####### 7
	// 6의 갯수 : ######### 9
	// 7의 갯수 : ############# 13
	// 8의 갯수 : ####### 7
	// 9의 갯수 : ########## 10
	
	public void PrintGraph (int[] arr) {
		System.out.println("난수 값 : " + Arrays.toString(arr));
		int cnt = 0;
		for (int i = 0 ; i < 10; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (i == arr[j]) {
					cnt++;
				}
			}
			String gm3 = "#".repeat(cnt);
			System.out.printf("%d 의 갯수 : %s %d \n", i, gm3 ,cnt);
			cnt = 0;
			gm3 = "#";
		}		
	}
}
