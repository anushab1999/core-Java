class Ring extends Ornament{

  String color;
  String ringSize;
  
  public Ring(){
	System.out.println("sub class");
  }
  
  public void setColor(String color){
  this.color = color; 
  }
  
  public void setRingSize(String ringSize){
  this.ringSize = ringSize;
  }
  
  public void OrnamentDetails(){
  System.out.println(baseMaterial +" "+ plating +" "+ color +" "+ ringSize);
  }


}