package ex02_class_casting;

public class BikeMain {
	public static void main(String[] args) {
		Bike b = new FourWheelBike("길동");
		b.info();
		b.ride();
		//b.addWheel(); 부모 타입으로는 불가
		
		System.out.println();
		
		
		// 자식 타입으로 다시 변환을 해줌으로써 부모 타입에서는 사용하지 못했던 자식의 멤버들을 모두 사용할 수 있게 되었다.
		// 단, 모든 부모 타입 객체를 자식 타입으로 변환할 수 있는 것은 아니다.
		// 반드시 부모 타입으로 자동 타입 변환되었던 자식 객체를 다시 자식 타입으로 변환할 때만 강제 타입 변환을 사용할 수 있다.
		FourWheelBike fwb = (FourWheelBike)b;
		fwb.addWheel();
		fwb.info();
		fwb.ride();
		
		Bike b2 = new Bike ("길동2");
		FourWheelBike fwb2 = (FourWheelBike)b2;
		
	}
}
