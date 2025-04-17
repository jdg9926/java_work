package ex05_enum;

public class OperationMain {
	public static void main(String[] args) {
		
		Operation[] option = Operation.values();
		for (Operation x : option) {
			System.out.println(x + " : " + x.apply(15, 5));
		}
	}
}
