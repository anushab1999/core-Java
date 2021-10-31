//modifiers/class keyword/class name
public class Book { // user defined object

	String bookType;
	String size;
	int noOfPages;
	
	public Book() {
		System.out.println("Book object is created");
	}
 
	public void toRead() {
		System.out.println("to read story");
	}

	public void toWrite() {
		System.out.println("to write article");
	}

	public void toDraw() {
		System.out.println("to draw scenery");
	}
	
	public void displayBookDetails() {
		System.out.println("Brand of the book :" + bookType);
		System.out.println("Size of the book :" + size);
		System.out.println("Number of pages :" + noOfPages);
	}
}
