package ex04_array;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Exam1 {
	public static void main(String[] args) {
		int[] iArr = new int[10];
		int sum = 0;
//		for (int i = 0; i <= 9; i++) {
//			iArr[i] = i + 1;
//			sum += iArr[i];
//			System.out.print(iArr[i] + " ");
//		}
//		System.out.println(sum + " ");
		
		Random rd = new Random();
		
		// iArr에 각 index에 난수를 넣고
		// 배열의 짝수 요소들의 총 합 구하기
		for (int i = 0 ; i < 10; i++) {
			int randomNumber = rd.nextInt(30) + 1; // 1 ~ 30 사이의 난수 생성
			iArr[i] = randomNumber;
			
			if (iArr[i] % 2 == 0) {
				sum += iArr[i];
			}
			System.out.print(iArr[i] + " ");
		}
		System.out.println("랜덤값 중 짝수의 총합 : " + sum);
		
		int[] nums = {5,7,2,9,4,10,3};
		int max = 0;
		int min = nums[0];
		// 배열에서 최대값과 최소값을 출력하는 프로그램 만들기
		for (int i = 0; i < nums.length; i++) {
			max = Math.max(max, nums[i]);
		}
		System.out.println("for문 최대값 : " + max);
		for (int i = 0; i < nums.length; i++) {
			min = Math.min(min, nums[i]);
		}
		System.out.println("for문 최소값 : " + min);
		max = 0;
		min = 0;
		for (int i = 0 ; i < nums.length; i++) {
			if (i == 0) {
				max = nums[0];
				min = nums[0];	
			}
			
			if (max < nums[i]) {
				max = nums[i];
			}
			
			if (min > nums[i]) {
				min = nums[i];
			}
			
		}
		
		System.out.println("함수 사용 없는 최대값 : " + max);
		System.out.println("함수 사용 없는 최소값 : " + min);
		
		System.out.println("Arrays.stream 최대값 : " + Arrays.stream(nums).max().getAsInt());
		System.out.println("Arrays.stream 최소값 : " + Arrays.stream(nums).min().getAsInt());
		
		System.out.println("---------------------------------");
		
		int[] sums2 = {1,2,1,3,2,1,4};
		int cnt = 0;

		
		
	}
}
