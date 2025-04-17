package ex10_lamda;

public class Test {
	public static void main(String[] args) {
        int n = 976;
        int m = 144;
        
//        System.out.println(Math.sqrt(n));
        
        int answer = 0;
        double num1 = Math.sqrt(n);
        
        System.out.println("num1 : " + num1);
        System.out.println(num1 % 1);
        if (num1 % 1 == 0) {
        	
            answer = 1;
        } else {
            answer = 2;
        }
        

        
	}
}

