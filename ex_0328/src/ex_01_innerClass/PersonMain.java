package ex_01_innerClass;

public class PersonMain {
	public static void main(String[] args) {
		Student s = new Student();
		s.mySelf();
		
		Person p = new Person() {
			@Override
			public void mySelf() {
				super.mySelf();
				System.out.println("저는 회사원 입니다.");
			}
		};
		
	}
}
