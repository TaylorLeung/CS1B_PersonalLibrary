import java.io.Serializable;

/**
 * class VideoGame is a specific type of entry
 * 
 * @author Bowen
 * 
 */
public class VideoGame extends Entry implements Serializable, Comparable {

	/**
	 * default constructor
	 */
	public VideoGame() {
		super();
	}

	/**
	 * customized constructor only calls Entry's super()
	 * 
	 * @param title
	 * @param format
	 * @param location
	 * @param note
	 */
	public VideoGame(String title, String format, String location, String note) {
		super(title, format, location, note);
	}

	/**
	 * VideoGame's own toString()
	 */
	public String toString() {
		String s;
		s = super.toString();
		return s;
	}

}
