package ex02_for;

public class Ex01_for {
	public static void main(String[] args) {
		// JDK 1.5부터 새롭게 추라된 기능으로 배열과 컬렉션의 모든 요소를 반복하는 요소이다.
		
		// for (변수 : 배열) {
		//     반복하고 싶은 명령
		// }
		
		int[] ar = {1,2,3,4,5};
		
		// 향상된 for문
		// 반복 대상의 요소를 하나씩 꺼내어 변수에 대입하면서
		// 진행하고, 반복 대상의 길이만큼 꺼내어 반복한다.
		for (int x : ar) {
			System.out.println(x);
		}
	}
}
