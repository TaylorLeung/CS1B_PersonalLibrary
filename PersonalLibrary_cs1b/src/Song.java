import java.io.Serializable;

/**
 * class Song is a specific type of entry has its own variables "artist" and
 * "genre"
 * 
 * @author Administrator
 * 
 */
public class Song extends Entry implements Serializable {

	private String artist;
	private String genre;

	/**
	 * default constructor
	 */
	public Song() {
		super();
		this.setArtist("Unknown Artist");
		this.setGenre("Unknown Genre");

	}

	/**
	 * customized constructor also call super() from Entry
	 * 
	 * @param title
	 * @param format
	 * @param location
	 * @param note
	 * @param artist
	 * @param genre
	 */
	public Song(String title, String format, String location, String note,
			String artist, String genre) {
		super(title, format, location, note);
		this.setArtist(artist);
		this.setGenre(genre);
	}

	/**
	 * set the artist for one Song object
	 * 
	 * @param artist
	 */
	void setArtist(String artist) {
		this.artist = artist;
	}

	/**
	 * get the artist of one Song object
	 * 
	 * @return artist
	 */
	String getArtist() {
		return artist;
	}

	/**
	 * set the genre for one Song object
	 * 
	 * @param genre
	 */
	void setGenre(String genre) {
		this.genre = genre;
	}

	/**
	 * get the genre of one Song object
	 * 
	 * @return genre
	 */
	String getGenre() {
		return genre;
	}

	/**
	 * Song's own toString()
	 */
	public String toString() {
		String s;
		s = super.toString() + "\nAuthor: " + getArtist() + "\nGenre: "
				+ getGenre();
		return s;
	}

}
