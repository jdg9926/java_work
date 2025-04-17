package ex04_overloading;

public class Overload_main {
	public static void main(String[] args) {
		Overload ol = new Overload();
		
		ol.result();
		ol.result(100);
		ol.result('A');
		ol.result("A", 100);
		ol.result(10, "A");
		
	}
}
