package ex05_enum;

public class OrderStatusMain {
	public static void main(String[] args) {
		OrderStatus[] os = OrderStatus.values();
		
		for (OrderStatus x : os) {
			System.out.println(x.name() + " -> " + x.next(x));
		}
		
		OrderStatus os_ord = OrderStatus.ORDERED;
		
		try {
			System.out.println("현재 상태 : " + os_ord);
			os_ord = os_ord.next1();
			System.out.println("현재 상태 : " + os_ord);
			os_ord = os_ord.next1();
			System.out.println("현재 상태 : " + os_ord);
			os_ord = os_ord.next1();
			System.out.println("현재 상태 : " + os_ord);
			
		} catch (Exception e) {
			System.out.println("예외 발생" + e.getMessage());
		}

		
	}
}
