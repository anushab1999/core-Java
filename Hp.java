class Hp extends Laptop{
     
	 String brand;
	 
	 public void laptopDetails(){
	 System.out.println("Brand: " +brand+ "Laptop id: " +laptopId+ "color:" +color+ "price: " +price);
	 }
	 
	 public void setBrand(String brand){
	 this.brand = brand;
	 }

}