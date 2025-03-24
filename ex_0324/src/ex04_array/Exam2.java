package ex04_array;

public class Exam2 {
	public static void main(String[] args) {
		// 오른차순 정리
		int[] nums3 = {5,3,8,4,2};
		
		for (int i = 0 ; i < nums3.length - 1; i++) {
			for (int j = 0 ; j < nums3.length - 1 - i; j++) {
				if (nums3[j] > nums3[j + 1]) {
					int temp = nums3[j];
					nums3[j] = nums3[j + 1];
					nums3[j + 1] = temp;
				}	
			}
		}
		for (int i = 0; i < nums3.length; i++) {
			System.out.print(nums3[i] + " ");
		}
		System.out.println();
	}
}
