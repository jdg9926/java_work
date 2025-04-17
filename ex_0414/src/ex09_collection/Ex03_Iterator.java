package ex09_collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Ex03_Iterator {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
		
		Iterator<Integer> iter = list.iterator();
		
		while (iter.hasNext()) {
			int value = iter.next();
			System.out.println(value + " ");

			if (value % 2 == 0) {
				iter.remove(); 
			}
		}
		
		// Iterator 가 리스트 원본의 주소를 참조한다.
		// next()메서드를 호출하면, 참조한 주소로가서 요소를 직접 읽어온다.
		
		// 한번 사용한 Iterator객체는 재사용할 수 없다.
		// 순회를 하고 나면 hasNext()가 가리키는게 리스트의 끝이기 때문에
		// false를 반환하므로 재사용이 불가능하다.
		
		// 이미 위에서 iter.hasNext()를 통해 순회를 했기 때문에
		// 아래 while의 iter.hasNext() 의 값은 false 로 들어와 돌지 않는다.
		while (iter.hasNext()) {
			int value = iter.next();
			if (value % 2 == 0) {
				iter.remove(); 

			}
		}
		
		Set<Integer> hs = new HashSet<>();
		hs.add(3);
		hs.add(5);
		hs.add(1);
		hs.add(2);
		
		Iterator<Integer> hsIter = hs.iterator();
		while (hsIter.hasNext()) {
			int value = hsIter.next();
			System.out.println(value + " ");
		}
		
		
		System.out.println(list);
	}
}
