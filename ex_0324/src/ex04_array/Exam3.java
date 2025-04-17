package ex04_array;

public class Exam3 {
	public static void main(String[] args) {
		// 배열에서 영문자만 추출하여 이어붙혀 출력하시오.
		char[] cards = {'1', 'L', 'O', '2', 'V', '3', 'E'};
		String myWord = "";
		for (int i = 0 ; i < cards.length; i++) {
			if (Character.isLetter(cards[i])) {
				myWord += cards[i];
			}
		}		
		System.out.println(myWord);
	}
}
