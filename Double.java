
public class Double {

	public static void main(String[] args) {
	    
		double[] d = {1.0,2.0,3.0,4.0,5.0};		
		System.out.println("the length of the array is :" + d.length);
		
		System.out.println("the 1st element of the array is :" + d[0]);
		System.out.println("the 2st element of the array is :" + d[1]);
		System.out.println("the 3st element of the array is :" + d[2]);
		System.out.println("the 4st element of the array is :" + d[3]);
		System.out.println("the 5st element of the array is :" + d[4]);
		
		
		
			System.out.println("the value in the array are :");
			for (int n=0; n<5; n++)
			    System.out.println(d[n]);
		
		System.out.println("increment the array value by 5 :" );
		for (int n=0; n<5; n++)
				System.out.println(d[n]+2);
		
	}

}
