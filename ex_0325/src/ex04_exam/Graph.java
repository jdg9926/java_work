package ex04_exam;

import java.util.Random;

public class Graph {
	public static void main(String[] args) {
		MethodTest mod = new MethodTest();
		
		Random rd = new Random();
		int[] arr = new int[100];
		for (int i = 0; i < arr.length; i++) {
			int rdNumber = rd.nextInt(10);
			arr[i] = rdNumber;
		}
		mod.PrintGraph(arr);
	}
}
