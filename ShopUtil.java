import java.util.Scanner;
class ShopUtil{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size");
		int size = sc.nextInt();
		
		Shop shop = new Shop(size);
		
		for(int i = 0; i< size; i++){
			ElectronicProductDTO dto  = new ElectronicProductDTO();
			
			System.out.println("Enter product id");
			dto.setproductId(sc.nextInt());
			System.out.println("Enter product Name");
			dto.setproductName(sc.next());
			System.out.println("Enter product color");
			dto.setproductColor(sc.next());
			System.out.println("Enter product price");
			dto.setproductPrice(sc.nextDouble());
			
			shop.addElectronicProduct(dto);
		}

		String text = null;
		do{
			System.out.println("press 1 to get all product details");
			System.out.println("Press 2 to update product name by id");
			System.out.println("press 3 to delete product by id");
			System.out.println("press 4 to get product name by account id");
			int choice = sc.nextInt();

			switch(choice){
				case 1:
					shop.printDetails();
					break;
				case 2:
					System.out.println("Enter product id update name");
					int id = sc.nextInt();
					System.out.println("Enter updated product name");
					String name = sc.next();
					boolean update = shop.updateproductNameByproductId(id, name);
					System.out.println(update);
					break;
				case 3:
					System.out.println("Enter product id to delete");
					boolean delete = shop.deleteById(sc.nextInt());
					System.out.println(delete);
					break;
				case 4:
					System.out.println("Enter product id");
					shop.getproductNameById(sc.nextInt());
					break;
				default:
					System.out.println("Wrong choice");
					break;
			}
			System.out.println("Do you want to continue? Y/N");
			text = sc.next();
		} while(text.equals("Y"));
		System.out.println("Thank you for Using the shop Application");
	}
}