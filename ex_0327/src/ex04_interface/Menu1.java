package ex04_interface;

public interface Menu1 {
	
	// 상수
	// 값을 한번 넣으면 변경이 불가능한 값
	final String name = "홍길동";
	
	// 인터페이스에서는 어차피 추상메서드만 
	// 들어갈 수 있기 때문에 abstract를 생략해도 된다.
	public String jajang();
}
