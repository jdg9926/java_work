package ex09_collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import ex01_class_object.Person;

public class Ex01_ArrayList {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
//		arr[1] = 10;
		
		System.out.println(Arrays.toString(arr));
		
		List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
		list.add(1, 10);
		System.out.println(list);
		
		ArrayList<Person> p_list = new ArrayList<>();
		
		Person p = new Person();
		p_list.add(p);
		System.out.println(p); // Person객체의 주소
		System.out.println(p_list.get(0)); // list의 첫번째 요소의 주소
	}
}
