package exam;

public class Exam {
	public static void main(String[] args) {
		// 삼항연산자로 만들었던 X개의 농구공을 담기 위한 박스의 개수 구하기		
		int ball = 31;
		System.out.println(ball % 5 == 0 ? ball / 5 : (ball / 5) + 1 );
	}
}
