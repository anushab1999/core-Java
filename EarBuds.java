class EarBuds{
    
	String brand;
	String color;
	String connectorType;
	String modelName;
	double price;
	
	public EarBuds(String brnd, String clr, String type, String mdl, double prc){
		System.out.println("EarBuds object is created");
	brand = brnd;
	color = clr;
	connectorType = type;
	modelName = mdl;
	price = prc;
	}
	
	public EarBuds( String brand,String color, String modelName, double price){
	this.brand = brand;
	this.color = color;
	this.modelName = modelName;
	this.price = price;
	}
	
	public void listening(){
	System.out.println("to listening music");
	}
	
	public void displayEarBudsDetails(){
		System.out.println(brand +" "+ color +" "+ connectorType +" "+ modelName +" "+ price);
	}
	
	public void displayEarBudsDetails1(){
		System.out.println(brand +" "+ color +" "+ modelName +" "+ price);
	}
	
	public static void main(String[] args){
	
	EarBuds e1 = new EarBuds("BoAt" , "MidnightBLue" , "wireless" , "Airdopes121v2" , 899.00);
	e1.displayEarBudsDetails();
	e1.listening();
	
	EarBuds e2 = new EarBuds("BoAt" , "cherryBlossom" , "Airdopes12v1" , 999.00);
	e2.displayEarBudsDetails1();
	e2.listening();
	}
}