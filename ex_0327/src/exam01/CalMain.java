package exam01;

public class CalMain {
	public static void main(String[] args) {
		CalMinus minus = new CalMinus();
		CalPlus plus = new CalPlus();
		
		System.out.println("test");
		System.out.println(minus.getResult(1, 2));
		System.out.println(plus.getResult(2, 1));
		
	}
}
