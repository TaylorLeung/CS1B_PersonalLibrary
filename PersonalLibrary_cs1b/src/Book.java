import java.io.Serializable;

/**
 * class Book is a specific type of entry has its own variable "author"
 * 
 * @author Administrator
 */
public class Book extends Entry implements Serializable {

	private String author;

	/**
	 * default constructor
	 */
	public Book() {
		super();
		this.setAuthor("Unknown Author");
	}

	/**
	 * customized constructor also call super() from Entry
	 * 
	 * @param title
	 *            , format, location, note, author
	 */
	public Book(String title, String format, String location, String note,
			String author) {
		super(title, format, location, note);
		this.setAuthor(author);
	}

	/**
	 * set the author for one Book object
	 * 
	 * @param author
	 */
	void setAuthor(String author) {
		this.author = author;
	}

	/**
	 * get the author of one Book object
	 * 
	 * @return author
	 */
	String getAuthor() {
		return author;
	}

	/**
	 * Book's own toString()
	 * 
	 * @return bookString
	 */
	public String toString() {
		String bookString;
		bookString = super.toString() + "\nAuthor: " + getAuthor();
		return bookString;
	}
}
