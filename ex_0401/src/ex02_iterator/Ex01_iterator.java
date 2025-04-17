package ex02_iterator;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Ex01_iterator {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
		Iterator<Integer> iter = list.iterator();
		int count = 0;
		
		while(iter.hasNext()) {
			int val = iter.next();
//			System.out.printf("list 데이터 [%d] : %d\n",count++,val);
			System.out.print(val + " ");
		}
		
		System.out.println();
		System.out.println("========================");
		
		Set<Integer> set = new HashSet<>();
		for (int i = 0; i <= 10; i++) {
			set.add(i);
		}
		
		Iterator<Integer> iter2 = set.iterator();
		while (iter2.hasNext()) {
			int val = iter2.next();
			
			System.out.print(val + " ");
			
		}
	}
}
