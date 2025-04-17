package ex05_Generic;

public class GenericExam {
	public static void main(String[] args) {
		Gen<Integer> arrI = new Gen<>();
		Gen<Double> arrD = new Gen<>();
		Gen<Character> arrC = new Gen<>();

		Integer[] arI = {1, 2, 3, 4, 5};
		Double[] arD = {1.1, 2.2, 3.3, 4.4, 5.5};
		Character[] arC = {'A', 'B', 'C', 'D', 'E'};

		// Gen class --> public void printArr(T[] arr) {
		arrI.printArr(arI);
		arrD.printArr(arD);
		arrC.printArr(arC);
		
		System.out.println("=============");
		// Gen class --> public <T> void printArr(T[] arr) { 
		// <T> 를 넣으면 하나로 가능
		arrI.printArr(arI);
		arrI.printArr(arD);
		arrI.printArr(arC);
	}
}
