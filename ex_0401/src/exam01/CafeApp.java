package exam01;

import java.util.ArrayList;
import java.util.Scanner;

class MenuItem {
	private String MenuName;
	private int price;
	
	public String getMenuName() {
		return MenuName;
	}
	public void setMenuName(String menuName) {
		MenuName = menuName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
//	public void MenuItem (String MenuName, int price) {
//		this.MenuName = MenuName;
//		this.price = price; 
//	}
};

public class CafeApp {
	public static void main(String[] args) {
		// 카페 주문 프로그램
		// 1. 메뉴보기
		// 2. 주문하기
		// 3. 결제하기
		// 4. 프로그램 종료
		
		/*
			[ 현재 주문 내역 ]
			1. 아메리카노 - 3000원
			2. 라떼 - 3500원
			취소할 주문 번호를 입력하세요: 2
			'라떼' 주문이 취소되었습니다.
		*/
		
		ArrayList<MenuItem> arr = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		
		String[] Menu = {"아메리카노", "라떼", "카푸치노"};
		int[] pic = {3000, 3500, 4000};
		
		while (true) {
			System.out.println("=== 카페 주문 시스템 === \n1. 메뉴 보기\n" + "2. 주문 추가\n" + "3. 결제하기\n" + "4. 종료\n5. 취소하기");
			MenuItem mi = new MenuItem();
			System.out.print("번호선택 : ");
			int scInt = sc.nextInt();
			
			if (scInt == 4) {
				System.out.println("프로그램이 종료됩니다.");
				break;
				
			} else { 
				if (scInt == 1) {
					System.out.println("[ 메뉴판 ]\n"+ "1. 아메리카노 - 3000원\n"+ "2. 라떼 - 3500원\n"+ "3. 카푸치노 - 4000원\n");
					
				} else if (scInt == 2) {
					System.out.print("메뉴 번호 입력 : ");
					int MenuSc = sc.nextInt();
					
					if (MenuSc < 1 || MenuSc > 4) {
						System.out.println("잘못된 메뉴 번호입니다.");
					} else {
						mi.setMenuName(Menu[MenuSc-1]);
						mi.setPrice(pic[MenuSc-1]);
						System.out.println(mi.getMenuName() + "가 주문에 추가되었습니다.");
						arr.add(mi);
					}
					
				} else if (scInt == 3) {
					if (arr.isEmpty()) {
						System.out.println("선택된 메뉴가 없습니다.");
					} else {
						int sum = 0;
						for (MenuItem data : arr) {
							System.out.println(data.getMenuName() + " : " + data.getPrice());
							sum += data.getPrice();
						}
						System.out.println("총 금액 : " + sum);
						System.out.println("결제가 완료되었습니다. 감사합니다!");
						arr.clear();
					}

				} else if (scInt == 5) {
					if (arr.isEmpty()) {
						System.out.println("주문내역이 없습니다.");
					} else {
						System.out.println("[현재 주문 내역]");
						int cnt = 0;
						for (MenuItem data : arr) {
							System.out.println(++cnt + ". " + data.getMenuName() + " : " + data.getPrice());
						}
						System.out.print("취소할 번호를 선택하세요 : ");
						int cancle = sc.nextInt();
						System.out.println(cancle + "번. " + arr.get(cancle - 1).getMenuName() + " 주문이 취소되었습니다.");
						arr.remove(cancle - 1);
					}
				}
			}
		}
	} 
}
