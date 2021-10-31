class TV extends ElectronicDevice{
   
   String color;
   String size;
   String brand;
   
   public void setColor(String color){
   this.color = color;
   }
   
   public void setSize(String Size){
   this.size = size;
   }
   
   public void setBrand(String brand){
   this.brand = brand;
   }
   
   public void TvDetails(){
   System.out.println(connectorType +" "+ supportedServices +" "+ displayTechnology +" "+ color +" "+ size +" "+ brand);
   }

}