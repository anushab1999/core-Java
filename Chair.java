
public class Chair {
	
    String chairType;
	int noOfSeats;
	boolean Legs;
	boolean Wheels;
	String color;
	
	public Chair() {
		System.out.println("Chair object is created");
	}

	public void toRelax() {
		System.out.println("to relax");
	}

	public void toStudy() {
		System.out.println("to study");
	}
	
	public void displayChairDetails() {
		System.out.println("Chair type :" +chairType);
		System.out.println("Num of seats :" +noOfSeats);
		System.out.println("Num of legs :" + Legs);
		System.out.println("Num of Wheels :" + Wheels);
		System.out.println("Chair color :" + color);
	}

}
