class RingUtil{

public static void main(String args[]){

 RingDTO r1 = new RingDTO();
 r1.setWidth("6.5mm");
 r1.setHeight("2.9mm");
 r1.setApproxWeight("1.17g");
 r1.setSize(12);
 
 System.out.println(r1.getWidth() +": width "+ r1.getHeight() +": height "+ r1.getApproxWeight() +": approx weight "+ r1.getSize() + ": size ");
 
 System.out.println(r1);

}
}