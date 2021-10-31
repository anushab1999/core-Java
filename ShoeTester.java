
public class ShoeTester {

	public static void main(String[] args) {

		Shoe s1 = new Shoe();
		s1.shoeType = "runningShoes";
		s1.prize = 2500.00;
		s1.brand = "nike";
		s1.color = "blue";
		s1.DisplayShoeDatailes();

		s1.wear();
		
		Shoe s2 = new Shoe();
		s2.shoeType = "sneakers";
		s2.prize = 4500.00;
		s2.brand = "adidas";
		s2.color = "yellow";
		s2.DisplayShoeDatailes();

		s2.wear();
		
		Shoe s3 = new Shoe();
		s3.shoeType = "casual shoes";
		s3.prize = 3000.00;
		s3.brand = "puma";
		s3.color = "white";
		s3.DisplayShoeDatailes();

		s3.wear();
	}
}
