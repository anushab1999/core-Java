class  Shop{
	ElectronicProductDTO[] product;
	int index;
	
	public Shop(int size){
		product = new ElectronicProductDTO[size];
	}
	public boolean addElectronicProduct(ElectronicProductDTO product){
		boolean isAdded = false;
		System.out.println("Inside addElectronicProduct()");
		if(product != null){
			System.out.println("Adding Electronic product");
			this.product[index++] = product;
			isAdded = true;
		}
		else{
			System.out.println("Cannot add product");
		}
		return isAdded;
	}
	public void printDetails(){
		for(int i =0 ; i< product.length; i++){
			if(product[i] != null){
				System.out.println(product[i].getproductId()+ ", "+product[i].getproductName()+ ", "+product[i].getproductColor()+ ",  "+product[i].getproductPrice());
			}
		}
	}
	
	public boolean updateproductNameByproductId(int id, String name){
		System.out.println("Inside updateproductNameByproductId()");
		boolean isUpdated = false;
		for(int i = 0; i< product.length; i++){
			if(product[i] != null){
				if(product[i].getproductId() == id){
					product[i].setproductName(name);
					isUpdated = true;
				}
			}
		}
		return isUpdated;
	}
	
	public boolean deleteById(int id){
		System.out.println("Inside deleteById()");
		boolean isDeleted = false;
		for(int i = 0; i<product.length; i++){
			if(product[i] != null){
				if(product[i].getproductId() == id){
					product[i] = null;
					isDeleted = true;
				}
			}
		}
		return isDeleted;
	}

	public ElectronicProductDTO getproductNameById(int id) {
		System.out.println("Inside getOsNameByOsSize()");
		ElectronicProductDTO dto = null;
		for (int i = 0; i < product.length; i++) {
			if(id > 0){
				if(product[i].getproductId() = id){
					dto = product[i];
				}else{
					System.out.println("Not found");
				}
			}
		}
		return dto;
	}
}