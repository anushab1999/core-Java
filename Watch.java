
public class Watch {

	boolean isDigital;
	float cost;
	String batteryType;
	String brand;
	String color;
	String beltMaterial;
	
	public Watch() {
		System.out.println("watch object is created");
	}

	public void showtime() {
		System.out.println("Time now is: " + 8.45);
	}

	public void setAlaram(String time) {
		System.out.println("Setting alaram to :" + time);
	}
	
	public void displayWatchDetails() {
	System.out.println("Watch is Digital :" + isDigital);
	System.out.println("Watch cost :" + cost);
	System.out.println("Watch batteryType :" + batteryType);
	System.out.println("Watch brand :" + brand);
	System.out.println("Watch color :" + color);
	System.out.println("Watch beltMaterial :" + beltMaterial);
	}
}
