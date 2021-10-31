class Orange extends Fruit{
  String fruitName;
  String shape;
  
  public void setShape(String shape){
	this.shape = shape;
  }
  
  public void setFruitName(String fruitName){
  this.fruitName = fruitName;
  }
  
  public void FruittDetails(){
  System.out.println("FruitName" +fruitName+ "color: " + color + "Price: " + price);
  }

}