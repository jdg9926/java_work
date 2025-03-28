package exam02;

public class HybridCar extends Car {

	int electricGauge; // 전기 잔여량
	
	public HybridCar(int gasGauge, int electricGauge) {
		super(gasGauge);
		this.electricGauge = electricGauge;
		
	}
	
	@Override
	public void showCurrentGauge() {
		super.showCurrentGauge();
		System.out.println("잔여 전기량 : " + electricGauge);
	}
}
