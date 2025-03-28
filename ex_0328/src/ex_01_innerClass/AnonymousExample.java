package ex_01_innerClass;

interface buttonClickLister {
	public void click();
}

public class AnonymousExample {
	public class Button {
		private buttonClickLister listener;
		
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
		AnonymousExample exam = new AnonymousExample();
		AnonymousExample.Button button = exam.new Button();
//		Button button = new Button();
		
		// 이름이 없는 imple 클래스의 역할을 함.
		button.setListener(new buttonClickLister () {
			@Override
			public void click() {
				System.out.println("버튼 클릭됨");
			}
		});
	}
}
