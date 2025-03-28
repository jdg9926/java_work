package ex_01_innerClass;

public class PermitExample {
	private class InClass {
		public void print () {
			System.out.println("접근을 private으로 제한한다.");
		}
	}
	public InClass getInClass() {
		return new InClass();
	}
	
	public static void main(String[] args) {
		PermitExample permit = new PermitExample();
		permit.getInClass().print();
		
		// 지역 클래스는 메서드 내에서 선언되어 사용한다.
		// 보통 메서드가 종료되면 클래스도 함께 종료되지만 메서드와 실행되는 위치가 다르기 때문에 종료되지 않고 남아있을 수도 있다.
		// 그래서 지역 클래스에서 메서드 내의 변수를 사용할 때는 변수를 복사해 사용한다.
		// 이러한 이유로 지역 클래스에서 메서드의 변수를 사용할 때 해당 변수가 변경되면 오류가 발생한다.
	}
}
