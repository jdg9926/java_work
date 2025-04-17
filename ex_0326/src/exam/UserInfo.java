package exam;

public class UserInfo {
	int deposit;
	
	public void deposit (int inMoney) {
		System.out.println("입금");
		deposit += inMoney;
	}
	
	public void withdraw (int outMoney) {
		System.out.println("출금");
		
		if (deposit < outMoney) {
			System.out.println("잔액이 부족합니다.");
		} else {
			deposit -= outMoney;
		}
	}
	
	public void showMoney () {
		System.out.println("잔액 : " + deposit);
	}
}
