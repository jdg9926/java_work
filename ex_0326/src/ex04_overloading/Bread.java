package ex04_overloading;

public class Bread {
	// 각기 다른 기능을 하느 makeBread()메서드를 세 개 만드는데
	// 메인 클래스에서 각각의 메서드를 호출 했을때의 결과를 보고 로직을 구현해보자.
	
	// 빵을 만들었습니다. <-------- method 1을 호출해서 나온 결과
	
	// 빵을 만들었습니다. <-------- method 2을 호출해서 나온 결과
	// 빵을 만들었습니다.
	// 요청하신 n개의 빵을 만들었습니다.
	
	// 크림빵을 만들었습니다. <-------- method 3을 호출해서 나온 결과
	// 크림빵을 만들었습니다.
	// 요청하신 n개의 빵을 만들었습니다.
	int BreadCnt;
	String BreadNm;
	
	public Bread () {
		System.out.println("빵을 만들었습니다.");
	}
	
	public Bread (int num) {
		for (int i = 0; i < num; i++) {
			System.out.println("빵을 만들었습니다.");
		}
		System.out.printf("요청하신 %d개의 빵을 만들었습니다. \n", num);
	}
	
	public Bread (int num, String Nm) {
		for (int i = 0; i < num; i++) {
			System.out.printf("%s빵을 만들었습니다. \n", Nm);
		}
		System.out.printf("요청하신 %d개의 %s빵을 만들었습니다. \n", num, Nm);
	}
	
	public void makeBread () {
		System.out.println("빵을 만들었습니다.");
	}
	
	public void makeBread (int num) {
		for (int i = 0; i < num; i++) {
			System.out.println("빵을 만들었습니다.");
		}
		System.out.printf("요청하신 %d개의 빵을 만들었습니다. \n", num);
	}
	
	public void makeBread (int num, String Nm) {
		for (int i = 0; i < num; i++) {
			System.out.printf("%s빵을 만들었습니다. \n", Nm);
		}
		System.out.printf("요청하신 %d개의 %s빵을 만들었습니다. \n", num, Nm);
	}
	
}
