
public class OddNumbers {

	public static void main(String[] args) {

		int n = 35;
		System.out.println("Odd numbers between 15 to " + n + " are :");

		for (int i = 15; i <= 35; i++)
			if (i % 2 != 0)
				System.out.println(i);
	}

}
