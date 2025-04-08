package ex_01_innerClass;

interface buttonClickLister {
	public void click();
}

public class AnonymousExample {
	// 내부클래스
	public class Button {
		// buttonClickLister 타입의 변수를 가진다.
		// 인터페이스의 구현체는 다 들어올 수 있다.
		private buttonClickLister listener;
		
		// 멤버변수는 private으로 지정하는 일이 많기 때문에 직접 접근하는것이 불가능하다.
		
		public void setListener (buttonClickLister listener) {
			this.listener = listener;
		}
		public void click () {
			if (listener != null) {
				this.listener.click();
			}
		}	
	}
	
	public static void main(String[] args) {
		// 외부 클래스의 객체
		AnonymousExample exam = new AnonymousExample();
		// 내부 클래스의 객체 (외부 클래스의 객체로부터 생성 가능)
		AnonymousExample.Button button = exam.new Button();
//		Button button = new Button(); // 생성 안됨
		
		// 이름이 없는 imple 클래스의 역할을 함.
		button.setListener(new buttonClickLister () {
			@Override
			public void click() {
				System.out.println("버튼 클릭됨");
			}
		});
	}
}
