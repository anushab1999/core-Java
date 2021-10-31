class CupDTO{

 private int cupId;
 private String itemWeight;
 private String itemDimensionsLxWxH;
 private double price;
 
 public CupDTO(){
 System.out.println("CupDTO object is created");
 }
 
 public void setCupId(int cupId){
 this.cupId = cupId;
 }
 public int getCupId(){
 return cupId;
 }
 
 public void setItemWeight(String itemWeight){
 this.itemWeight = itemWeight;
 }
 public String getItemWeight(){
 return itemWeight;
 }

 public void setItemDimensionLxWxH(String itemDimensionsLxWxH){
 this.itemDimensionsLxWxH = itemDimensionsLxWxH;
 }
 public String getItemDimensionLxWxH(){
 return itemDimensionsLxWxH;
 }
 
 public void setPrice(double price){
 this.price = price;
 }
 public double getPrice(){
 return price;
 }

}