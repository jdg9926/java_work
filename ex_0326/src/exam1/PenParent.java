package exam1;

public class PenParent {
	
	private int amount;
	private String color;
	
	public int getAmount () {
		return amount;
	}
	
	public void setAmount (int amount) {
		this.amount = amount;
	}
	
	public String getColor () {
		return color;
	}
	
	public void setColor (String color) {
		this.color = color;
	}	
	
	public static void main(String[] args) {
		Ballpen bp = new Ballpen();
		FountainPen fp = new FountainPen();
		SharpPen sp = new SharpPen();
		
		bp.setAmount(10);
		System.out.println("Ballpen : " + bp.getAmount());
		
		fp.setColor("빨강빨강");
		System.out.println("FountainPen : " + fp.getColor());
		System.out.println("FountainPen : " + fp.getAmount());
	}
}
