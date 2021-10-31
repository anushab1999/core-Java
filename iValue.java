
public class iValue {

	public static void main(String[] args) {
		int i=36;
		int j=19;
		
		int k1=i--;
		System.out.print("k1 =" + i--);
		
		int k2=i++;
		System.out.print("k2 =" + i++);
		
		int k3=--j;
		System.out.print("k3 =" + --j);
		
		int k4=++j;
		System.out.print("k4 =" + ++j);
		
		int k5=--i;
		System.out.print("k5 =" + --i);
		
		int k6=j--;
		System.out.print("k6 =" + j--);
		
		int k7=++i;
		System.out.print("k7 =" + ++i);
		
		int k8=j++;
		System.out.print("k8 =" + j++);
		
		int k;
		k=k1 - k2 + k3 - k4 + k5 - k6  + k7 - k8;
		System.out.print("the value of k is:" + " " + k);
		

 }

}
