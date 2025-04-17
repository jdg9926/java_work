package exam;

public class Exam4 {
	public static void main(String[] args) {
		// 과수원이 있다.
		// 배, 사과, 오렌지를 키우고 있는데 하루에 생산되는 양은 각각 5, 7, 5개이다.
		// 과수원에서 하루에 생산되는 총 개수를 출력하고, 시간당 전체 과일의 평균 생산 갯수를 출력하시오.
		// 평균값을 담는 변수는 float으로 할것
		
		int apple = 5, pear = 7, orange = 5;
//		float div = (float) ((double)(apple + pear + orange) / 24);
		float div = (apple + pear + orange) / 24f; // float 연산
		
		System.out.println("하루에 생산되는 총 개수 : " + (apple + pear + orange));
		System.out.println("시간당 전체 과일의 평균 생산 갯수 : " + div);
		
	}
	
}
