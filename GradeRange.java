
public class GradeRange {

	public static void main(String[] args) {
		
		int grade;
		grade='A';
		 
		switch(grade) {
		
		case 'A':
			System.out.print("your percentage is between 85 - 100");
			break;
			
		case 'B':
			System.out.print("your percentage is between 65 - 85");
			break;
			
		case 'C':
			System.out.print("your percentage is between 45 - 65");
			break;
			
		case 'D':
			System.out.print("your percentage is below 35");
			break;
			
		default:
			System.out.print("you have failed");
						
		}

	}

}
