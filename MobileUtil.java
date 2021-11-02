import java.util.Scanner;
class MobileUtil{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size");
		int size = sc.nextInt();
		Mobile mobile =  new Mobile(size);
		
		for(int i = 0; i< size; i++){
			ApplicationDTO dto  = new ApplicationDTO();
			
			System.out.println("Enter App id");
			dto.setAppId(sc.nextInt());
			System.out.println("Enter App name");
			dto.setAppName(sc.next());
			System.out.println("Enter App Type");
			dto.setAppType(sc.next());
			System.out.println("Enter App size");
			dto.setAppSize(sc.nextInt());
			
			mobile.addApplication(dto);
		}

		String text = sc.next();
		do{
			System.out.println("press 1 to get all app details");
			System.out.println("Press 2 to update app name by app id");
			System.out.println("press 3 to delete by app id");
			System.out.println("press 4 to get account name by account id");

			int choice = sc.nextInt();
			switch(choice){
				case 1:
					mobile.printDetails();
					break;
				case 2:
					System.out.println("Enter App id to update name");
					int id = sc.nextInt();
					System.out.println("Enter updated App name");
					String name = sc.next();
					boolean update = mobile.updateAppNameByAppId(id, name);
					System.out.println("Update: "+update);
					break;
				case 3:
					System.out.println("Enter App id to delete");
					boolean delete = mobile.deleteByAppId(sc.nextInt());
					System.out.println("Delete: "+delete);
					break;
				default:
					System.out.println("Wrong choice");
					break;
			}
			System.out.println("Do you want to continue? Y/N");
			text = sc.next();
		} while(text.equals("Y"));
		System.out.println("Thank you for Using Mobile Application");
	}
}