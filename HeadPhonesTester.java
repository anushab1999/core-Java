
public class HeadPhonesTester {

	public static void main(String[] args) {

		HeadPhones h1 = new HeadPhones();
		h1.brand = "boat";
		h1.bluetooth = true;
		h1.prize = 1500.00;
		h1.displayHeadPhonesDetails();

		h1.toListen();
		System.out.println("and");
		h1.toSpeak();
		
		HeadPhones h2 = new HeadPhones();
		h2.brand = "wings";
		h2.bluetooth = true;
		h2.prize = 1000.00;
		h2.displayHeadPhonesDetails();

		h2.toListen();
		System.out.println("and");
		h2.toSpeak();
		
		HeadPhones h3 = new HeadPhones();
		h3.brand = "noise";
		h3.bluetooth = true;
		h3.prize = 3250.00;
		h3.displayHeadPhonesDetails();

		h3.toListen();
		System.out.println("and");
		h3.toSpeak();


	}

}
