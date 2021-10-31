class Calculator {
   
   boolean solar;
   boolean battery;
   String brand;
   String color;
   String dimension;
   boolean displayTypeLCD;
   String weight;
   
   public Calculator(boolean solar , String brand , String color , String dimension , boolean displayTypeLCD){
   this.solar = solar;
   this.brand = brand;
   this.color = color;
   this.dimension = dimension;
   this.displayTypeLCD = displayTypeLCD;
   }
   
   public Calculator(boolean battery , String brand , String color , String weight) {
   this.battery = battery;
   this.brand = brand;
   this.color = color;
   this.weight = weight;
   }
   
   public void calculating(){
   System.out.println("easy to calculate numerical problems");
   }
   
   public void displayCalculatorDetails(){
   System.out.println("solar power source : " + solar + "/" + " brand : " + brand + "/" + "color : " +  color );
   System.out.println(" dimension LxWxH : " + dimension + "/" + " display Type LCD : " + displayTypeLCD);
   }
   
   public void displayCalculatorDetails1(){
	   System.out.println("battery power source : " + battery + " / " + " brand : " + brand);
	   System.out.println("color : " + color + " / " + " weight : " + weight);
   }
   
   
   public static void main(String[] args) {
  
   Calculator c1 = new Calculator(true , "casio Dj" , "grey" , "14 x 12.3 x 3 Centimeters" , true);
   c1.displayCalculatorDetails();
   c1.calculating();
   
   Calculator c2 = new Calculator(true , "Orpat OT" , "white" , "109g");
   c2.displayCalculatorDetails1();
   c2.calculating();
   
   }










}