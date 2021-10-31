class FootBall{
   
   int size;
   String color;
   String material;
   String brand;
   String style;
   boolean batteriesIncluded;
   
   public FootBall(int size , String color , String brand , String material , String style , boolean batteriesIncluded ){
	   this.size = size;
	   this.color = color;
	   this.material = material;
	   this.brand = brand;
	   this.style = style;
	   this.batteriesIncluded = batteriesIncluded;

   }
   
    public void play(){
		System.out.println("to play");
	}  
	
	public void displayFootBallDetails(){
		System.out.println("FootBall size : " + size + " / " + " color : " + color + " / " + " brand : " + brand );
		System.out.println("Style : " + style + " / " + " batteriesIncluded : " + batteriesIncluded);
	}
	
	public static void main(String[] args){
		
		FootBall f1 = new FootBall(5 , "Orange" , "Nivia" , "Rubber" , "Ball" , false);
		f1.displayFootBallDetails();
		f1.play();
		
		
	}









}