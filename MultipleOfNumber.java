
public class MultipleOfNumber {

	public static void main(String[] args) {
		System.out.println("prog to print multiple of number :");
		
		multipleOfNumber(5);
		multipleOfNumber(6);
		multipleOfNumber(7);
		
	}
	
	public static void multipleOfNumber(int a) {
		
		System.out.println("table of :" + a);
		for(int i=1; i<=10; i++) {
			System.out.println(a+ " * " + i + " = " + (a*i));
			
		}
		return;
	}
	
}

