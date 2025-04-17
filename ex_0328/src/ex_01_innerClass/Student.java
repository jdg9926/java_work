package ex_01_innerClass;

public class Student extends Person{
	@Override
	public void mySelf() {
		super.mySelf();
		System.out.println("학생입니다.");
	}
}
