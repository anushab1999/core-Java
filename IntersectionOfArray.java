
public class IntersectionOfArray {

	public static void main(String[] args) {
	
		int a1[] = {21, 22, 34, 35, 41};
		int a2[] = {11, 21, 34, 45, 61}; 
		int i = 0;
		int j = 0;
		
		while(i < a1.length && j < a2.length) {
			if(a1[i] == a2[j]) {
				System.out.println(a1[i]+ " ");
				i++;
				j++;
			} else if (a1[i] > a2[j]) {
			j++;
		}else {
			i++;
		}
		}
	}
	}

