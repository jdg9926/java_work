package ex05_enum;

public enum OrderStatus {
	ORDERED {
		@Override
		OrderStatus next1() {
			return SHIPPED;
		}
	}, SHIPPED {
		@Override
		OrderStatus next1() {
			return DELIVERED;
		}
	}, DELIVERED {
		@Override
		OrderStatus next1() throws Exception {
			throw new Exception("에러 발생");
		}
	};
	
	// 온라인 쇼핑몰에 주문 상태를 관리하는 시스템을 만들고자 한다.
	// 상태에 따라 다음 상태로 바뀐다.
	// 각 상태에서 next() 메서드를 호출하면 다음상태로 전환되도록 구현하기
	
	// ORDERED -> SHIPPED
	// SHIPPED -> DELIVERED
	// DELIVERED -> "완료 상태이며 상태 전환 불가"
	
	public String next(OrderStatus orderStatus) {
		if (orderStatus.name().equals("ORDERED")) {
			return "SHIPPED";
			
		} else if (orderStatus.name().equals("SHIPPED")) {
			return "DELIVERED";
		} else {
			return "완료 상태이며 상태 전환 불가";
		}
	}
	
	
	abstract OrderStatus next1() throws Exception;
}
