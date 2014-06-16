import java.io.Serializable;

/**
 * class Video is a specific type of entry has its own variable "star"
 * 
 * @author Bowen
 * 
 */
public class Video extends Entry implements Serializable {

	private String star;

	/**
	 * default constructor
	 */
	public Video() {
		super();
		this.setStar("Unknown Star");
	}

	/**
	 * customized constructor call super() of Entry
	 * 
	 * @param title
	 * @param format
	 * @param location
	 * @param note
	 * @param star
	 */
	public Video(String title, String format, String location, String note,
			String star) {
		super(title, format, location, note);
		this.setStar(star);
	}

	/**
	 * set the star for one Video entry
	 * 
	 * @param star
	 */
	void setStar(String star) {
		this.star = star;
	}

	/**
	 * get the star of one Video object
	 * 
	 * @return star
	 */
	String getStar() {
		return star;
	}

	/**
	 * Video's own toString
	 */
	public String toString() {
		String s;
		s = super.toString() + "\nStar: " + getStar();
		return s;
	}
}