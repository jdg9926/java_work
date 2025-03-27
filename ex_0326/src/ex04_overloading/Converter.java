package ex04_overloading;

public class Converter {
	// cm -> m 로 변환하는 convert
	// m, inch -> cm로 변환하는 convert
	// inch -> cm : inch * 2.54
	
	public String convert(double x) {
		double cver = x / 100;
		String result = String.format("%.2f", cver);
		return result;
	}
	
	public double convert (double x, String unit) {
		if (unit.equals("m")) {
			return x * 100.0;
		} else if (unit.equals("inch")) {
			return x * 2.54;
		} else {
			return 0;
		}
	}
}
