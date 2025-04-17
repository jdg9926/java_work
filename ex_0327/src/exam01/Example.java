package exam01;

public class Example {
    public static void main(String[] args) {
    	Example example = new Example();
        B b = example.new B(11);
//    	B b = new B(11);
    }
    
    class A {
        public A () {
        	System.out.println("A");
        }
        public A (int x) {
        	System.out.println("A : " + x);
        }
    }

    class B extends A {
        public B () {
        	super(100);
        }
        
        public B (int x) {
        	System.out.println("B : " + x);
        }
    }

}

//class A {
//    public A () {
//    	System.out.println("A");
//    }
//    public A (int x) {
//    	System.out.println("A : " + x);
//    }
//}
//
//class B extends A {
//    public B () {
//    	super(100);
//    }
//    
//    public B (int x) {
//    	System.out.println("B : " + x);
//    }
//}

// 출력 결과 예상하기 : 
