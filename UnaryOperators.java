class UnaryOperators{
    public static void main(String args[]){
	
	int num1 = 22;
	int num2 = 33;
	System.out.println("the numbers are:" + num1 + " " + num2);
	
	int preinc = ++num1;
	int postinc = num2++;
	
	System.out.println("the result of preinc:" + preinc);
	System.out.println("the result of portinc:" + postinc);
	
	System.out.println("the new num of num2 is:" + num2);
	
	int a = 44;
	int b = 55;
	System.out.println("the num are:" + a + " " + b);
	
	int predec = --a;
	int postdec = b--;
	
	System.out.println("the num of predec:" + predec);
	System.out.println("the num of postdec:" + postdec);
	
	System.out.println("the new number of b:" + b);
	
	boolean flag = true;
	boolean result = !flag;
	
	System.out.println("the result is:" + result);
	
	}
}