
public class Cricket {

	static String seasonSchedule;
	int matchNumber;
	String day;
	String date;
	String time;
	String team1;
	String team2;
	String venue;
	
	public Cricket() {
		System.out.println("cricket object is created");
	}

	public void score(String score) {
		System.out.println(score);
	}

	public void teamwon(String win) {
		System.out.println(win);
	}

	public void DisplayingSeasonSchedule() {
		System.out.println(seasonSchedule);
		System.out.println("Match Number :" + matchNumber);
		System.out.println("Day :" + day);
		System.out.println("Date :" + date);
		System.out.println("Time :" + time);
		System.out.println("Team 1 :" + team1);
		System.out.println("Team 2 :" + team2);
		System.out.println("Venue :" + venue);

	}

}
