
public class FibonacciSeries {

	public static void main(String[] args) {

		fibonacciOfNum(10);
		fibonacciOfNum(20);
	}

	public static void fibonacciOfNum(int num) {

		System.out.println("Fibonacci of given numbers" + num);

		int f1 = 0, f2 = 1;

		for (int i = 1; i <= num; i++) {
			
			System.out.println(f1 + " ");
			
			int sum = f1 + f2;
			f1 = f2;
			f2 = sum;
			//System.out.println(f1 + " ");

		}

	}

}
