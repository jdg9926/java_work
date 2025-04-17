package ex01_multi_array;

public class Exam1 {
	public static void main(String[] args) {
		int[][] arr = { {1,2,3,4,5}, {6,7,8,9,10}, {11,12,13,14,15}, {16,17,18,19,20} }; 
		
		System.out.println(arr.length);
		System.out.println(arr[0].length);
		
		int sum = 0;
		double avg = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				sum += arr[i][j];
				
			}
		}
		avg = sum / 20f;
		
		System.out.println("총합 : " + sum);
		System.out.println("평균 : " + avg);
	}
}
