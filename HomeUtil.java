import java.util.Scanner;
class HomeUtil{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size");
		int size = sc.nextInt();
		
		Home home = new Home(size);
		
		for(int i = 0; i < size; i++){
			FurnitureDTO dto = new FurnitureDTO();
			
			System.out.println("Enter furniture id");
			dto.setFurnitureId(sc.nextInt());
			System.out.println("Enter furniture name");
			dto.setFurnitureName(sc.next());
			System.out.println("Enter furniture Number");
			dto.setNumberOfFurniture(sc.nextInt());
			System.out.println("Enter furniture Color");
			dto.setFurnitureColor(sc.next());
			home.addFurniture(dto);
		}

		String text = sc.next();
		do{
			System.out.println("press 1 to get all furnature details");
			System.out.println("Press 2 to update color name by id");
			System.out.println("press 3 to delete furnature by id");
			System.out.println("press 4 to get furnature color by furnature name");

			int choice = sc.nextInt();
			switch(choice){
				case 1:
					home.printDetails();
					break;
				case 2:
					System.out.println("Enter furniture id for updating Furniture color");
					int id = sc.nextInt();
					System.out.println("Enter updated furniture color");
					String color = sc.next();
					boolean update = home.updateColorById(id, color);
					System.out.println("Updated: "+update);
					break;
				case 3:
					System.out.println("Enter furniture id to delete");
					boolean delete = home.deleteById(sc.nextInt());
					System.out.println("Deleted: "+delete);
					break;
				case 4:
					System.out.println("Enter name");
					home.getFurnitureColorByName(sc.next());
					break;
				default:
					System.out.println("Wrong choice.....");
					break;
			}
			System.out.println("Do you want to continue? Y/N");
			text = sc.next();
		} while(text.equals("Y"));
		System.out.println("Thank you for Using the Home Application");
		sc.close();
	}
}