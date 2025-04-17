package ex05_enum;

// 추상메서드를 가진다고 해서 추상클래스가 되는것이 아니다.
// enum 자체는 추상메서드를 정의할수가 있고
// 상수들이 그 메서드를 구현 해야한다.
public enum Transportation {
	  BUS(100) {
		  @Override
		  int totalFare(int distacne) {
			  return distacne * fare;
		  };
	  }
	, TRAIN(150) {
		int totalFare(int distacne) {
			  return distacne * fare;
		};
	}
	, SHIP(200) {
		int totalFare(int distacne) {
			  return distacne * fare;
		};
	}
	, AIRPLAN(250) {
		int totalFare(int distacne) {
			  return distacne * fare;
		};
	};
	
	int fare;
	
	private Transportation (int fare) {
		this.fare = fare;
	}
	 
	// 추상메서드를 정의하면
	// 직접 구현을 해야한다며 오류가 발생한다.
	abstract int totalFare(int distacne);
}
