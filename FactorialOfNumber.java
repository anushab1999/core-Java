
public class FactorialOfNumber {

	public static void main(String[] args) {

		int n = 10;
		long factorial = 1;
		System.out.println("factorial of the number is :");

		for (int i = 1; i <= n; i++)
			factorial *= i;
		
			System.out.println(factorial);
		
	}
}
