class TrimmerUtil{

 public static void main(String args[]){
 
 TrimmerDTO t1 = new TrimmerDTO();
 t1.setBladeMaterial("stainLessSteel");
 t1.setGender("men");
 t1.setColor("silver");
 t1.setPrice(3499.00);
 
 System.out.println(t1.getBladeMaterial() +" "+ t1.getGender() +" "+ t1.getColor() +" "+ t1.getPrice());
  System .out.println(t1);
 }

}