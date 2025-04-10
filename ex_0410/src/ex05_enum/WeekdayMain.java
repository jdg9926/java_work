package ex05_enum;

public class WeekdayMain {
	public static void main(String[] args) {
		Weekday[] wd = Weekday.values();

		System.out.println(wd[0]); 
		for (Weekday data : wd) {
			if (data.name().equals("일")) {
				System.out.println("쉬는날입니다.");
			} else {
				System.out.println("출근하는 날입니다.");
			}
		}
	}
}
