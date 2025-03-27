package ex04_overloading;

public class RactangleCalculatorMain {
	public static void main(String[] args) {
		RactangleCalculator rm = new RactangleCalculator();	
		
		int test1 = rm.area(5);
		int test2 = rm.area(5, 6);
		double test3 = rm.area(5.1, 6.5);
		
//		System.out.printf("1 번 : %d \n", test1);
//		System.out.printf("2 번 : %d \n", test2);
//		System.out.printf("3 번 : %f \n", test3);
		
		System.out.printf("1 번 : %d \n2 번 : %d \n3 번 : %f \n", test1, test2, test3);
	}

}
