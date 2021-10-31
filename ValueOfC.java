public class ValueOfC {

	public static void main(String[] args) {
		int a=5;
     	int b=10;
		
		int c1=a+b;
		System.out.print("c1 = " + c1);
		
		int c2=a++;
		System.out.print("c2 = " + a++);
		
		int c3=b++;
		System.out.print("c3 = " + b++);
		
		int c4=++a;
		System.out.print("c4 = " + ++a);
		
		int c5=++b;
		System.out.print("c5 = " + ++b);
		
		int c;
		c = c1 + c2 + c3 + c4 + c5; 
		System.out.print("c:" +c);
	}

}
