package ex04_overloading;

public class BreadMain {
	public static void main(String[] args) {
		
		// 생성자
		Bread br = new Bread();
		System.out.println("-----------------");
		Bread br2 = new Bread(2);
		System.out.println("-----------------");
		Bread br3 = new Bread(2, "크림");
		
		System.out.println("=================");
		
		// 메서드
		br.makeBread();
		System.out.println("-----------------");
		br.makeBread(3);
		System.out.println("-----------------");
		br.makeBread(4, "크림");
		
	}
}

