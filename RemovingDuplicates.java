
public class RemovingDuplicates {
	
	public static void main(String[] args) {

		int a[] = { 1, 2, 2, 3, 4, 5, 6, 6 };
        int leng = a.length;
        int temp[] = new int[a.length];
        int j = 0;
  
        for(int i = 0; i<leng-1; i++) {
        	
        	if(a[i] != a[i+1]) {
        		temp[j] = a[i];
        		j++;
        	}
        }
        temp[j++] = a[leng-1];
        
        for(int k = 0; k<j; k++) {
        	System.out.print(temp[k]);
        }
		}
	}

		
		
		
		
		
		
		
		
		

