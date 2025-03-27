package exam;

import java.util.Scanner;

public class Bank {
	
	public void bank_result () {
		try {
			UserInfo usInfo = new UserInfo();
			Scanner sc = new Scanner(System.in);
			boolean result = true;

			int money = 0;
			
			while (result) {
				System.out.println("원하고자 하는 기능 선택 \n1.입금 \n2.출금 \n3.잔액확인 \n4.종료");
				System.out.print("숫자 입력 : ");
				int scInt = sc.nextInt();
				switch (scInt) {
				case 1 : 
					System.out.print("입금 금액 : ");
					money = sc.nextInt();
					usInfo.deposit(money);
					break;
					
				case 2 : 
					System.out.print("출금 금액 : ");
					money = sc.nextInt();
					usInfo.withdraw(money);
					break;
					
				case 3 : 
					usInfo.showMoney();
					break;
					
				case 4 :
					System.out.println("프로그램이 종료됩니다.");
					result = false;
					break;
				}
			}
		} catch (Exception e) {
    	    // e.printStackTrace(); 
            System.out.println("에러 사유 : 잘못된 입력"); 
            // throw e;             
		}
	}
}
