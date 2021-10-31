
public class Shoe {

	String shoeType;
	double prize;
	String brand;
	String color;

	public Shoe() {
		System.out.println("Shoe object is created");
	}

	public void wear() {
		System.out.println("walking , running ");
	}

	public void DisplayShoeDatailes() {
		System.out.println(shoeType + " " + prize + " " + brand + " " + color);

	}

}
