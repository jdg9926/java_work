package ex04_overloading;

public class ConverterMain {
	public static void main(String[] args) {
		Converter cvt = new Converter();
		
		System.out.println("cm --> m 로 변환값 : " + cvt.convert(1056.124));
		System.out.println(cvt.convert(23, "inch"));
	}
}
