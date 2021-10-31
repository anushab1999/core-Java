
public class SwapTwoNumbers {

	public static void main(String[] args) {
		
		int a=50,b=100;
		int temp;
		System.out.println("Before swapping a = " + a +" and  b = " + b);
		
		temp=a;
		a = b;
		b = temp;
		System.out.println("After swapping a = " + b +" and  b = " + a);
	}

}
