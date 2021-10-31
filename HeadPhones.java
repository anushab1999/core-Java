
public class HeadPhones {

	String brand;
	boolean bluetooth;
	double prize;
	
	public HeadPhones() {
		System.out.println("headphones objet is created");
	}

	public void toListen() {
		System.out.println("listening music");
	}

	public void toSpeak() {
		System.out.println("to communicate");
	}
	public void displayHeadPhonesDetails() {
	System.out.println("headPhones : " +brand);
	System.out.println("bluetooth : " +bluetooth);
	System.out.println("cost " +prize);
	}
}
