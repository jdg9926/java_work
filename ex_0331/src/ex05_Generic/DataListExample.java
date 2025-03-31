package ex05_Generic;

public class DataListExample {
	public static void main(String[] args) {
//		DataList list = new DataList();
		
		// 제네릭의 탑변수는 기본자료형을 인식하지 않는다.
		// 따라서 int, double등의 기본 자료형을 제레릭 타입으로 이용하고자 할 때는
		// Integer, Double등의 클래스를 이용해야 한다. 
		DataList<Object> list = new DataList();
		
		//Object타입의 배열이기 떄문에 정수, 문자열, 실수가 들어와도 넣을 수 있다.
		// 정수 저장
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		
		// 문자열 저장
		list.add("문자열");
		
		// 실수 저장
		list.add(10.33);
		
		Object sum = 0;
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
//		for (int i = 0; i < list.size(); i++) {
//			Object data = list.get(i);
//			if (data instanceof Integer) {
//				System.out.println("정수 : " + (int)data);
//			} else if (data instanceof Double) {
//				System.out.println("실수 : " + (double)data);
//			} else if (data instanceof String) {
//				System.out.println("문자열 : " + (String)data);
//			}
//		}
	}
}
