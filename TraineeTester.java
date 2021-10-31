
public class TraineeTester {

	public static void main(String[] args) {

		Trainee t1 = new Trainee();
		t1.name = "anusha b";
		t1.identity = 1;
		t1.gender = "female";
		t1.organization = "x workz";
		t1.displayTraineeDetails();
		t1.training();
		
		Trainee t2 = new Trainee();
		t2.name = "yash";
		t2.identity = 2;
		t2.gender = "male";
		t2.organization = "x workz";
		t2.displayTraineeDetails();
		t2.training();
	}

}
