
public class WatchTester {

	public static void main(String[] args) {

		System.out.println("prog to create watch object");

		Watch titanWatch = new Watch();
		titanWatch.isDigital = true;
		titanWatch.cost = 10000.00f;
		titanWatch.batteryType = "lithium";
		titanWatch.brand = "titan";
		titanWatch.color = "black";
		titanWatch.beltMaterial = "Silicon";
		titanWatch.displayWatchDetails();

		titanWatch.showtime();
		titanWatch.setAlaram("7:00 am");

		Watch fossilWatch = new Watch();
		fossilWatch.isDigital = false;
		fossilWatch.cost = 25000.00f;
		fossilWatch.batteryType = "lithium";
		fossilWatch.brand = "fossil";
		fossilWatch.color = "roseGold";
		fossilWatch.beltMaterial = "stainless steel";
		fossilWatch.displayWatchDetails();

		fossilWatch.showtime();
		fossilWatch.setAlaram("9:00 pm");

	}

}
