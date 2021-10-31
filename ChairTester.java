
public class ChairTester {

	public static void main(String[] args) {

		Chair c1 = new Chair();
		c1.chairType = "plasticChair";
		c1.noOfSeats = 1;
		c1.Legs = true;
		c1.Wheels = false;
		c1.color = "white";
		c1.displayChairDetails();

		c1.toRelax();

		Chair c2 = new Chair();
		c2.chairType = "wheelchair";
		c2.noOfSeats = 1;
		c2.Legs = false;
		c2.Wheels = true;
		c2.color = "black";
		c2.displayChairDetails();
		
		c2.toStudy();
		
		Chair c3 = new Chair();
		c3.chairType = "woodenChair";
		c3.noOfSeats = 3;
		c3.Legs = true;
		c3.Wheels = false;
		c3.color = "brown";
		c3.displayChairDetails();
	}

}
