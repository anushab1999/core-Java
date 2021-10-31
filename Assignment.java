class Assignment{
  public static void main(String args[]){
  
  int a = 10;
  System.out.println("a::" + (a+=2));
  
  int b=6;
  System.out.println("b:" + (b-=3));
  
  int c=80;
  System.out.println("c:" + (c*=2));
  System.out.println("d:" + (c/=40));
  }
}