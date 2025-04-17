package exam03;

public class CalMain {
	public static void main(String[] args) {
		Calc c = new Calc();
		int[] a = {10,21,3};
		
		int test1 = c.add(3, 4);
		int test2 = c.substract(3, 4);
		double test3 = c.average(a);
		
		System.out.println(test1 + " : : :" + test2 + " : : :" + test3);
	}
}
