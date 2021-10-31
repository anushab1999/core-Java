
public class CricketTester {

	public static void main(String[] args) {

		Cricket.seasonSchedule = "IPLT20 2021";

		Cricket match1 = new Cricket();
		match1.matchNumber = 1;
		match1.date = "01/10/2021";
		match1.day = "monday";
		match1.team1 = "Royal Challegers Bangalore";
		match1.team2 = "Chennai Super Kings";
		match1.time = "7:30 pm";
		match1.venue = "Chennai";
		match1.DisplayingSeasonSchedule();

		System.out.println("Winning Team :");
		match1.score(null);
		match1.teamwon("Royal Challegers Bangalore");

		Cricket match2 = new Cricket();
		match2.matchNumber = 2;
		match2.date = "02/10/2021";
		match2.day = "Tuesday";
		match2.team1 = "Sunrisers Hyderabad";
		match2.team2 = "Rajasthan Royals";
		match2.time = "4:30 pm";
		match2.venue = "Hyderabad";
		match2.DisplayingSeasonSchedule();

		System.out.println("Winning Team :");
		match1.score(null);
		match1.teamwon("Sunrisers Hyderabad");

	}

}
