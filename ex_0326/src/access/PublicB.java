package access;

public class PublicB {
	public static void main(String[] args) {
		// Default클래스가 default 제한이라서 다른 패키지에서 만들이지지 않는다.
//		DefaultA a = new DefaultA();
//		a.variableC = 10;
		//a.varableC = 10; 필드가 public 이더라도 객체를 생성하지 못하기 때문에 사용할 수 없다.
	}
}
