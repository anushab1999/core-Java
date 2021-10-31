public class Saree {

	String sareeType;
	String dimensions;
	String sareeId;
	String weight;

	public Saree(String type, String leng, String id, String wt) {
		sareeType = type;
		dimensions = leng;
		sareeId = id;
		weight = wt;
	}
	public Saree(String sareeType, String dimensions, String sareeId  ) {
		this.sareeType = sareeType;
		this.dimensions = dimensions;
		this.sareeId = sareeId;
	}
	
	public void wear() {
		System.out.println("we look traditional after wearing saree");
	}

	public void displaySareeDetails() {
		System.out.println(sareeType + " " + dimensions + " Dimension " + " / " + " ID " + sareeId + " / " + " weight " + weight);
	}
	
	public void displaySareeDetails2() {
		System.out.println(sareeType + " / " + " Dimension " + dimensions + " / " + " ID " + sareeId + " / " + " weight " + weight);
	}

	public static void main(String[] args) {

		Saree s1 = new Saree("silkSaree", "28 x 20 x 2 Centimeters", "B08RDYXY5Q" , "280g");
		s1.displaySareeDetails();
		s1.wear();
		
		Saree s2 = new Saree("cottonSaree", "28 x 20 x 2 Centimeters", "A09SDZXY6P");
		s2.displaySareeDetails2();
		s2.wear();
	}

}
