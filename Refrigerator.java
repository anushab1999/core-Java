
public class Refrigerator {
	
		static String country;
		String companyName;
		int litreCapacity;
		String color;
		float cost;
		int compartment;
		float rating;
		boolean review;
		
		public Refrigerator() {
			System.out.println("refrigerator object is created");
		}
		

		public void toStore() {
			System.out.println("to store food item");
		}

		public void cooling() {
			System.out.println("cooling items");

		}

		public void displayingRefrigeratorDetails() {
			System.out.println(country);
			System.out.println("Fridge company name :" + companyName);
			System.out.println("Fridge litre capacity :" + litreCapacity);
			System.out.println("Fridge color :" + color);
			System.out.println("Fridge cost :" + cost);
			System.out.println("Fridge compartment :" + compartment);
			System.out.println("Fridgr rating :" + rating);
			System.out.println("Fridge review good :" + review);
		}

	}


	
		

