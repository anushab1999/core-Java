class FlowerPotUtil{

public static void main(String args[]){

 FlowerPotDTO f1 = new FlowerPotDTO();
 f1.setMaterial("metal");
 f1.setColor("brown");
 f1.setShape("round shape");
 f1.setPrice(499.00);
 
 System.out.println(f1.getMaterial() +" "+ f1.getColor() +" "+ f1.getShape() +" "+ f1.getPrice());

}
}