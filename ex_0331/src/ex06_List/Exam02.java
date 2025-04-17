package ex06_List;

import java.util.ArrayList;
import java.util.Scanner;

class test {

	
}

public class Exam02 {
	public static void main(String[] args) {
		// products라는 이름의 ArrayList를 만들고
		// 키보드에서 값을 입력받아 상품을 추가한다. (조회)
		// 상품이 중복되면 제거한다.
		// 최근 조회한 상품목록이 가장 앞에 나오도록 한다.
		
		ArrayList<String> products = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		Exam02 ex = new Exam02();
		System.out.println("상품의 이름을 입력하세요.");
//		String scStr = sc.next();
		while (true) {
			System.out.print("상품명 입력 : ");
			String input = sc.next();
			
			if (input.equals("exit")) {
				break;
			}	
			ex.viewProduct(products, input);
		}
	}
	
	public void viewProduct (ArrayList<String> list, String product) {
		list.remove(product);
		list.add(0, product);
		System.out.println("상품 클릭 : " + product + " -> " + list);
	}
}

