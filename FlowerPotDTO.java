class FlowerPotDTO{

 private String material;
 private String color;
 private String shape;
 private double price;
 
 public FlowerPotDTO(){
 System.out.println("FlowerPotDTO object is created");
 }
 
 public void setMaterial(String material){
 this.material = material;
 }
 public String getMaterial(){
 return material;
 }
 
 public void setColor(String color){
 this.color = color;
 }
 public String getColor(){
 return color;
 }
 
 public void setShape(String shape){
 this.shape = shape;
 } 
 public String getShape(){
 return shape;
 }
 
 public void setPrice(double price){
 this.price = price;
 }
 public double getPrice(){
 return price;
 }
 
}