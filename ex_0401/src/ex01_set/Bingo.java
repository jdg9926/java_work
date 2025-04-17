package ex01_set;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class Bingo {
	public static void main(String[] args) {
		// HashSet을 이용한 5 * 5 의 랜덤 빙고판 만들기
		// 숫자는 1 ~ 50 까지

		Random rd = new Random();
		Set<Integer> set = new HashSet<>();
		
		for (int i = 0 ; i < 5; i++) {
			for (int j = 0; j < 5;) {
				int randomNumber = rd.nextInt(50) + 1;
				if (!set.contains(randomNumber)) {
					set.add(randomNumber);
					j++;
				}
			}
		}
		System.out.println(set);
		
		int cnt = 0;
		for (Integer x : set) {
			cnt++;
			System.out.printf("%02d ", x);
			if (cnt % 5 == 0) {
				System.out.println();
			}
		}
		
		System.out.println("--------------------");
		
		int[][] board = new int[5][5];
		
		// set은 index가 없기 때문에 하나씩 꺼낼수가 없다.
		// 그렇기 때문에 iterator를 통해서 꺼낸다.
		
		// shuffle(List)
		List<Integer> list = new ArrayList<>(set);
		Collections.shuffle(list);
		
		Iterator<Integer> iter = list.iterator();
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				board[i][j] = iter.next();
				System.out.printf("%02d ", board[i][j]);
			}
			System.out.println();
		}
		

	}
}
