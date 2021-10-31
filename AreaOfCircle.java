
public class AreaOfCircle {

	public static void main(String[] args) {
		
		int radius = 5;
		
		double areaofcircle = findAreaOfCircle(radius);
		System.out.print("the area of circle : " + radius + " is : " + areaofcircle);

	}
	
	public static double findAreaOfCircle(int r){
		
		double pivalue = findPiValue();
		double area = pivalue * r * r;
		return area;
	
	}
	
	public static double findPiValue() {
		
		double pi = 22d/7d;
		return pi;
	}

}
