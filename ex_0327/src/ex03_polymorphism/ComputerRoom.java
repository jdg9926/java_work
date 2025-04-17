package ex03_polymorphism;

public class ComputerRoom  {
//	Samsung com1;
//	Samsung com2;
	
//	LZ com1;
//	LZ com2;
	
	Computer com1;
	Computer com2;
	Computer com3;
	
	public void allPowerOn() {
		com1.powerOn();
		com2.powerOn();
		com3.powerOn();
	}
	
	public void allPowerOff() {
		com1.powerOff();
		com2.powerOff();
		com3.powerOff();
	}
}
