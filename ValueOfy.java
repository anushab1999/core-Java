
public class ValueOfy {
	
	public static void main(String args[]) {
		
		int y=7;
		
		int y1=y++;
		System.out.print("y1 is:" + "" + y++);
		
		int y2=--y;
		System.out.print("y2 is: " + --y);
		
		int y3=++y;
		System.out.print("y3 is: " + ++y);
		
		int y4=y--;
		System.out.print("y4 is:" + y--);
		
		y = y1 - y2 + y3 - y4;
		System.out.print("the value of y is :" + y);
	}
}

	
		
		
	

