
public class SwapTwoNumbers {

	public static void main(String[] args) {
	     
		System.out.println("swap two numbers");
			
			swapNumber(10, 20);
			swapNumber(33, 66);
			
	}
	
	public static void swapNumber(int num1, int num2) {
	
		System.out.println("Before Swapping value of a is  "+num1 + " and b is  "+num2);
		
		int temp;
		temp = num1;
		num1 = num2;
		num2 = temp;
		System.out.println("After Swapping value of a is  "+num1+ " and b is  "+num2);
	}

}
