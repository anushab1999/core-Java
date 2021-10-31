
public class BookTester {

	public static void main(String[] args) {

		Book ruledBook = new Book();
		ruledBook.bookType = "classMate";
		ruledBook.size = "kingsize";
		ruledBook.noOfPages = 100;
		ruledBook.displayBookDetails();

		ruledBook.toWrite();

		Book storyBook = new Book();
		storyBook.bookType = "moralStory";
		storyBook.size = "smallSize";
		storyBook.noOfPages = 50;
		storyBook.displayBookDetails();
		
		storyBook.toRead();

		Book drawingBook = new Book();
		drawingBook.bookType = "navNeet";
		drawingBook.size = "bigSize";
		drawingBook.noOfPages = 30;
		drawingBook.displayBookDetails();

		drawingBook.toDraw();
	}

}
