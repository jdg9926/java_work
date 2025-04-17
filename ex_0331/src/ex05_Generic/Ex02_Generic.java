package ex05_Generic;

import java.util.ArrayList;
import java.util.List;

// 멀티타입 파라미터
// 제네릭을 반드시 하나만 사용해야하는 법은 없다.
// 만일 타입 지정이 여러개 필요한 경우 얼마든지 지정해도 된다.
class Peach{};
class Grape{};

class FruitBox2<T,U> {
	List<T> Peaches = new ArrayList<>();
	List<U> Grapes = new ArrayList<>();
	
	public void add (T peach, U grape) {
		// 리스트에 추가하기
		Peaches.add(peach);
		Grapes.add(grape);
	}
}

public class Ex02_Generic {
	public static void main(String[] args) {
		FruitBox2<Peach, Grape> box = new FruitBox2<>();
		box.add(new Peach(), new Grape());
		box.add(new Peach(), new Grape());
		
	}
}
