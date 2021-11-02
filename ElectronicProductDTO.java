public class ElectronicProductDTO{
	int productId;
	String productName;
	String productColor;
	double productPrice;
	
	public void setproductId(int productId){
		this.productId = productId;
	}
	public int getproductId(){
		return productId;
	}
	public void setproductName(String productName){
		this.productName = productName;
	}
	public String getproductName(){
		return productName;
	}
	public void setproductColor(String productColor){
		this.productColor = productColor;
	}
	public String getproductColor(){
		return productColor;
	}
	public void setproductPrice(double productPrice){
		this.productPrice = productPrice;
	}
	public double getproductPrice(){
		return productPrice;
	}
}