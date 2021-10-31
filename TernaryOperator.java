
public class TernaryOperator {

	public static void main(String[] args) {
		int a = 5, b  = 7, c =9;
		
		System.out.println("the numbers are :" +a+ " " +b+ " " +c);
		
		int largestnum = c > ((a>b) ? a : b) ? c : ((a>b) ? a : b);
		System.out.println("the largest of three numbers is :" +largestnum);

	}

}
