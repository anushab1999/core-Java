class RingDTO{

 private String width;
 private String height;
 private String approxWeight;
 private int size; 
 
 public RingDTO(){
 System.out.println("RingDTO object is created");
 }
 
 public void setWidth(String width){
 this.width = width;
 }
 public String getWidth(){
 return width;
 }
 
 public void setHeight(String height){
 this.height = height;
 }
 public String getHeight(){
 return height;
 }
 
 public void setApproxWeight(String approxWeight){
 this.approxWeight = approxWeight;
 }
 public String getApproxWeight(){
 return approxWeight;
 }
 
 public void setSize(int size){
 this.size = size;
 }
 public int getSize(){
 return size;
 }
}