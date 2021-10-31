
public class FibonacciOfNumber {

	public static void main(String[] args) {
		
		int n=10, f1=0, f2=1;
		
		System.out.print("the Fibonacci of the num 10 is :");

		for(int i=1; i<=n; ++i) 
		{
			System.out.print(f1+" ");
			int sum = f1+f2;
			f1 = f2;
			f2 = sum;			
		}
			
	}

}	
