
public class SmallAndLargeNumber {

	public static void main(String[] args) {
		
		int a[] = new int[] { 1, 2, 3, 4, 5};
		int n = a.length;
		int small = a[0];
		int large = a[0];
		
		for(int i=0; i<n; i++) {
			
			if(a[i]>large) {
				large = a[i];
			}
			
			if(a[i]<small) {
				small = a[i];
			}
			
			System.out.println("largest : " + large + " smallest : " + small);
		}
				
	}

}
