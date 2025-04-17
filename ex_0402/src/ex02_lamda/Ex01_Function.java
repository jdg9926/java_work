package ex02_lamda;

public class Ex01_Function {
	public static void main(String[] args) {
		Iadd add = (x, y) -> x + y;
		int res = result(add);
		
		System.out.println("res : " + res);
		
//		Iadd addd = (x, y) -> {
//			return x + y;
//		}; 
	}
	
	public static int result(Iadd lamda) {
		System.out.println(1);
		return lamda.add(1, 2);
	}
}
