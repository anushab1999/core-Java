public class RouterDTO{

 private int routerID;
 private String name;
 private String color;
 private double price;
 
 public RouterDTO(){
 System.out.println("RouterDTO object is created");
 }
 
 public void setRouterID(int routerID){
 this.routerID = routerID;
 }
 public int getRouterID(){
 return routerID;
 }
 
 public void setName(String name){
 this.name = name;
 }
 public String getName(){
 return name;
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
 @Override
 public int hashCode(){
	 return getRouterID();
 }
 
 public String toString(){
	 return "Router - [Name = " +getName()+ ", Color =" +getColor()+ ", Price =" +getPrice()+"]";
 }
 
}