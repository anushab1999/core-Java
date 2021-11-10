class InkPotDTO{

 private String inkColor;
 private String brand;
 private String packageInformation;
 private String itemVolume;
 
 public InkPotDTO(){
 System.out.println("InkPotDTO object is created");
 }
 
 public void setInkColor(String inkColor){
 this.inkColor = inkColor;
 }
 public String getInkColor(){
 return inkColor;
 }
 
 public void setBrand(String brand){
 this.brand = brand;
 }
 public String getBrand(){
 return brand;
 }
 
 public void setPackageInformation(String packageInformation){
 this.packageInformation = packageInformation; 
 }
 public String getPackageInformation(){
 return packageInformation;
 }
 
 public void setItemVolume(String itemVolume){
 this.itemVolume = itemVolume;
 }
 public String getItemVolume(){
 return itemVolume;
 }
 
 @Override
 public String toString(){
	 return "InkPot - [Ink Color = " +getInkColor()+ ", Brand = " +getBrand()+ ", Package Information = " +getPackageInformation()+ ", Item Volume = " +getItemVolume()+"]";
 }
}