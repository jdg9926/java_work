package ex01_multi_array;

public class Ex01_array {
	public static void main(String[] args) {
		int[][] arr = new int[2][3];
		
		arr[0][0] = 1;
		arr[0][1] = 2;
		arr[0][2] = 3;
		arr[1][0] = 4;
		arr[1][1] = 5;
		arr[1][2] = 6;
		
		System.out.print(arr[0][0]);
		System.out.print(arr[0][1]);
		System.out.print(arr[0][2]);
		System.out.print(arr[1][0]);
		System.out.print(arr[1][1]);
		System.out.println(arr[1][2]);
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.println(arr[i][j]);
			}
		}
		
		int[][] ar = new int[3][];
		
		ar[0] = new int[2];
		ar[1] = new int[3];
		ar[2] = new int[1];
		
		int num = 1;
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar[i].length; j++) {
				ar[i][j] = 100 * (num++);
				System.out.println(ar[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("---------------------");
		
	}
}
