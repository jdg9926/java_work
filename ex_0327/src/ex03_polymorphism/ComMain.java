package ex03_polymorphism;

public class ComMain {
	public static void main(String[] args) {
		ComputerRoom cr = new ComputerRoom();
		System.out.println(cr.com1);
		System.out.println(cr.com2);
		
		cr.com1 = new Samsung();
		cr.com2 = new LZ();
		cr.com3 = new Apple();
		
		cr.allPowerOn();
		cr.allPowerOff();
		
		System.out.println();
	}
}
