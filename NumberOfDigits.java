
public class NumberOfDigits {

	public static void main(String[] args) {
		
		int n=456;
		int count = 0;
		
		while(n>0){			
			n=n/10 ;
			count=count+1;
		}
		System.out.print("the number of digits of 456 is :" +count);
	}	

}
