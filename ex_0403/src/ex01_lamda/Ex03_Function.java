package ex01_lamda;

import java.util.function.Predicate;

public class Ex03_Function {
	public static void main(String[] args) {
		
		// Predicate의 결합
		// Predicate<T> - boolean test(T t)
		Predicate<Integer> p = t -> t < 100;
		Predicate<Integer> q = t -> t < 200;
		Predicate<Integer> r = t -> t % 2 == 0;
		
		Predicate<Integer> all = p.and(q).or(r).negate();
		
		int x = 150;
		// and () 
		//  - p and r ( 100미만 이면서 짝수면 참)
		boolean result = p.and(r).test(x);
		System.out.println("x < 100 and 짝수인가? : " + result);
		
		// or () 
		//  - p or q (100 미만이거나 또는 200 미만이면 참)
		result = p.or(q).test(x);
		System.out.println("x < 100 또는 x < 200 ? : " + result);
		
		// negate() 
		//  - not p (100 이상이면 참)
		result = p.negate().test(x);
		System.out.println("x >= 100 ? : " + result);
		
	}
}

