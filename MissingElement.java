
public class MissingElement {

	public static void main(String[] args) {
		
		int[] a= {1,2,3,4,6,7,8,9,10};
		int leng=a.length + 1;
		
		int sum = (leng * (leng + 1) ) / 2;
		
		for(int i=0; i<a.length; i++) {
			sum = sum - a[i];
		}
		System.out.print("missing element in given array is :" + sum);
	}

}
