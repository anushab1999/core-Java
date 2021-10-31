
public class Cosmetics {

	String cosmeticType;
	String brand;
	double cost;
	String shades;
	
	public Cosmetics() {
		System.out.println("cosmetic object is created");
	}

	public void makeup() {
		System.out.println("used for makeup");
	}
	
	public void displayCosmeticDetails() {
		System.out.println(cosmeticType + " " + cost + " rupees " +shades + " shade ");

	}

}
