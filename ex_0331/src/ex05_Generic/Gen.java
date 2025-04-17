package ex05_Generic;

public class Gen<T> {
	public <T> void printArr(T[] arr) {
		for (T x : arr) {
			System.out.print(x + " ");
		}
		System.out.println();
	}
}
