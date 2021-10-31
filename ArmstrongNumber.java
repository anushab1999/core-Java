
public class ArmstrongNumber {

	public static void main(String[] args) {
		
		int num1 = 370, num2;
		int temp;
		int arm = 0;
		num2=num1;
		
		while(num2 != 0) {
			temp = num2 % 10;
			arm += temp*temp*temp;
			num2/=10;
		}
		if(arm == num1)
			System.out.print(num1 + " is an armstrong number");
		else
			System.out.print(num1 + " is not an armstrong number");
	}

}
