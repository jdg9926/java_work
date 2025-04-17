package ex09_collection;

import java.util.HashSet;

public class Ex02_HashSet {
	public static void main(String[] args) {
		HashSet<Integer> hs = new HashSet<>();
		hs.add(3);
		hs.add(5);
		hs.add(1);
		hs.add(2);
		
		System.out.println(hs);
	}
}
