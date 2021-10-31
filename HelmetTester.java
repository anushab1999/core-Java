
public class HelmetTester {

	public static void main(String[] args) {

		Helmet h1 = new Helmet();
		h1.fibre = true;
		h1.brand = "heroHonda";
		h1.cost = 3000.00;
		h1.color = "black";

		System.out.println("helmet is made of fibre :" + h1.fibre);
		System.out.println("helmet brand is :" + h1.brand);
		System.out.println(h1.cost + " rupees " + ":" + " color " + h1.color);

		h1.protectHead();
		h1.reduceRisk();
	}

}
