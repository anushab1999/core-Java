
public class NestedSwitch {

	public static void main(String[] args) {
		
		String college="BMSC";
		String branches="CS";
		
		switch (college) {
		case "AIT": switch (branches) {
		            case "EC": 
		            	System.out.print("AIT: Electronics and Communication");
		                break;
		                
		            case "CS":
		            	System.out.print("AIT: Computer Science");
		                break;
		            
		            case "IS":
		            	System.out.print("AIT: Information Science");
		                break;		            
		            }
		           break;
		           
		case "BMSC": switch (branches) {
		             case "CS":
		                 System.out.print("BMSC: Computer Science");
                         break;
                         
		             case "EC":
		            	 System.out.print("BMSC: Electronics and Communication");
			             break;
			         }
		 default:
           	System.out.print("not available");
			
		}
		
	}

}
