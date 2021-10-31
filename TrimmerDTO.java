class TrimmerDTO{

 private String bladeMaterial;
 private String gender;
 private String color;
 private double price;
 
 public TrimmerDTO(){
 System.out.println("TrimmerDTO object is created");
 }
 
 public void setBladeMaterial(String bladeMaterial){
 this.bladeMaterial = bladeMaterial;
 }
 public String getBladeMaterial(){
 return bladeMaterial;
 }
 
 public void setGender(String gender){
 this.gender = gender;
 }
 public String getGender(){
 return gender;
 }
 
 public void setColor(String color){
 this.color = color;
 }
 public String getColor(){
 return color;
 }
 
 public void setPrice(double price){
 this.price = price;
 }
 public double getPrice(){
 return price;
 }
}