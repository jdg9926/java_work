package exam02;

public class Car {
	
	int gasGauge; // 가스 잔여량
	
	public Car(int gasGauge) {
		this.gasGauge = gasGauge;
	}
	
	public void showCurrentGauge() {
		System.out.println("가스 잔여량 : " + gasGauge);
	}
}
