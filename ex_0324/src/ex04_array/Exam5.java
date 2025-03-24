package ex04_array;

import java.util.Random;

public class Exam5 {
	public static void main(String[] args) {
		// 동전의 개수 구하기
		// 10 ~ 5000사이의 난수를 변수에 담는다.
		// 1의 자리는 반드시 0이 되도록 한다.
		// 발생된 난수를 동전으로 바꿀 때 몇개씩 필요한지
		// 판단하여 작성하시오.
		// 가능한 적은 수의 동전을 사용한다.
		
		Random rd = new Random();
		
		int rdNumber = rd.nextInt(500) + 1; //		
		rdNumber *= 10;
		int[] coin = {500,100,50,10};
		
		System.out.println(rdNumber + " : ");
		
		for (int i = 0; i < coin.length; i++) {
			int res = rdNumber / coin[i];
			System.out.printf("%d원 : %d 개 \n", coin[i], res);
			rdNumber %= coin[i];
		}
		

	}
}
