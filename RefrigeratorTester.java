
public class RefrigeratorTester {
	
		public static void main(String[] args) {

			Refrigerator.country = "Made in India";
			
			Refrigerator f1 = new Refrigerator();
			f1.companyName = "Samsung";
			f1.litreCapacity = 180;
			f1.color = "Red";
			f1.cost = 24000f;
			f1.compartment = 1;
			f1.rating = 4.5f;
			f1.review = true;
			f1.displayingRefrigeratorDetails();
			f1.toStore();
			f1.cooling();

			Refrigerator f2 = new Refrigerator();
			f2.companyName = "whirlpool";
			f2.litreCapacity = 190;
			f2.color = "white";
			f2.cost = 25000f;
			f2.compartment = 2;
			f2.rating = 4f;
			f2.review = true;
			f2.displayingRefrigeratorDetails();
			f2.toStore();
			f2.cooling();
			
			Refrigerator f3 = new Refrigerator();
			f3.companyName = "godrejpool";
			f3.litreCapacity = 200;
			f3.color = "silver";
			f3.cost = 50000f;
			f3.compartment = 4;
			f3.rating = 5f;
			f3.review = true;
			f3.displayingRefrigeratorDetails();
			f3.toStore();
			f3.cooling();

		}

	}

	


