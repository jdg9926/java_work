package ex05_enum;

public class TransportMain {
	public static void main(String[] args) {
		// 각 운송수단별 100을 갔을 때 금액
		// name : xxx, 100km - fare : xxx
		
		Transportation[] tpt = Transportation.values();
		for (Transportation x : tpt) {
			System.out.println("name : " + x + ", " + "100km" + " - fare : " + x.totalFare(100));
		}
	}
}
