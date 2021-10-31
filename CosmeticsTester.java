
public class CosmeticsTester {

	public static void main(String[] args) {

		Cosmetics a1 = new Cosmetics();
		a1.cosmeticType = "lipstick";
		a1.brand = "mac";
		a1.cost = 1100.00;
		a1.shades = "red";
		a1.displayCosmeticDetails();

		a1.makeup();
		
		Cosmetics a2 = new Cosmetics();
		a2.cosmeticType = "sunScreen";
		a2.brand = "ponds";
		a2.cost = 500.00;
		a2.shades = "white";
		a2.displayCosmeticDetails();

		a2.makeup();
		
		Cosmetics a3 = new Cosmetics();
		a3.cosmeticType = "bodyLotion";
		a3.brand = "vaseline";
		a3.cost = 250.00;
		a3.shades = "pink";
		a3.displayCosmeticDetails();

		a3.makeup();
		

	}

}
