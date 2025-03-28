package ex02_Exception;

public class Ex03_ArrayIndexOutOfBoundsException {
	public static void main(String[] args) {
		
		// 배열에서 인덱스(범위)를 초과해 사용할 때 발생한다.

		try {
			int[] arr = {1,2,3,4,5};
			System.out.println(arr[5]);
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
			System.out.println("초과된 인덱스");
		}
	}
	
}
