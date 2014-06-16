import java.io.Serializable;
import java.util.Collections;
import java.util.List;

/**
 * class Entry is the super class for Book, Song, Video and VideoGame, the
 * variables and methods in Entry is shared by its subclasses. one Entry object
 * represents an entry (book, song, video or video game)
 * 
 */
public class Entry implements Serializable, Comparable {

	// some common properties
	private String title;
	private String format;
	private String location;
	private String note;
	private static int entryCounter = 0;
	private int id;

	/**
	 * default constructor
	 */
	public Entry() {
		this.setTitle("Unknown Title");
		this.setFormat("Unknown Format");
		this.setLocation("Unknown Location");
		this.setNote("Unknown Note");
		id = entryCounter;
		entryCounter++;

	}

	/**
	 * customized constructor
	 * 
	 * @param title
	 *            , format , location, note
	 */
	public Entry(String title, String format, String location, String note) {
		this.setTitle(title);
		this.setFormat(format);
		this.setLocation(location);
		this.setNote(note);
		id = entryCounter;
		entryCounter++;
	}

	/**
	 * set the title for an entry
	 * 
	 * @param title
	 */
	void setTitle(String title) {
		this.title = title;
	}

	/**
	 * get the entry's title
	 * 
	 * @return title
	 */
	String getTitle() {
		return title;
	}

	/**
	 * set the format for one entry
	 * 
	 * @param format
	 */
	void setFormat(String format) {
		this.format = format;
	}

	/**
	 * get the format of one entry
	 * 
	 * @return format
	 */
	String getFormat() {
		return format;
	}

	/**
	 * set the location for one entry
	 * 
	 * @param location
	 */
	void setLocation(String location) {
		this.location = location;
	}

	/**
	 * get the location of one entry
	 * 
	 * @return locomotion
	 */
	String getLocation() {
		return location;
	}

	/**
	 * set the note for one entry
	 * 
	 * @param note
	 */
	void setNote(String note) {
		this.note = note;
	}

	/**
	 * get the note of one entry
	 * 
	 * @return note
	 */
	String getNote() {
		return note;
	}

	/**
	 * Use case 2 testing
	 * 
	 * typeCategorize() categorizes Entry into different type and add them to
	 * corresponding subList
	 * 
	 * @param e
	 * @author taylorxleung
	 */
	public void typeCategorize(Entry e) {
		System.out.println("Entry's sortByType() is reached.");
		if (e instanceof Book) {

		} else if (e instanceof Song) {

		} else if (e instanceof Video) {

		} else {

		}
	}

	/**
	 * Use case 2 testing sortByTitleWithinType sorts subList of the same type
	 * by their title.
	 * 
	 * @author taylorxleung
	 */
	/*
	 * public void sortByTitleWithinType(){ Collections.sort(List<Book>) ;
	 * Collections.sort((List<Song>) ); Collections.sort((List<Video>) );
	 * Collections.sort((List<VideoGame>) ); }
	 */

	/**
	 * toString() print the entry
	 * 
	 * @return entryString
	 */
	public String toString() {
		String entryString;
		entryString = "Title: " + getTitle() + "\nFormat: " + getFormat()
				+ "\nLocation: " + getLocation() + "\nNote: " + getNote();
		return entryString;
	}

	/**
	 * compare two entries to see if they are equal
	 * 
	 * @param anotherEntry
	 * @author taylorxleung
	 */
	public int compareTo(Object anotherEntry) {
		System.out.println("CompareTo() in class Entry is reached");
		return 0;
	}

}