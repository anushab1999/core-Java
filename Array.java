
public class Array {

	public static void main(String[] args) {
		 
		int[] number = {10,20,30,40,50};
		int leng = number.length;
		System.out.println("the size of the array is :" +leng);
		
		System.out.println("the first element of the array is :" +number[0]);
		System.out.println("the second element of the array is :" +number[1]);
		System.out.println("the third element of the array is :" +number[2]);
		System.out.println("the fourth element of the array is :" +number[3]);
		System.out.println("the last element of the array is :" +number[4]);

	
		{
		System.out.print("the value in the array are :");
		for (int i=0; i<leng; i++)
		System.out.println(number[i]);
		}
		System.out.println("increment the array value by 5");
		for (int i=0; i<=leng-1; i++)
		{
			System.out.println(number[i]+5);
		}
	}
}
