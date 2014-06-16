import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * TestPersonalLibrary is the Controller Class, it calls methods in Model class
 * through View class.
 * 
 * @author taylorxleung
 */

public class TestPersonalLibrary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GUI gui = new GUI();

	}

}

/*--------------------------proof of compiling-----------------------
 GUI constructor is reached.
 Personal Library constructor is reached.
 addNewEntry() in class PersonalLibrary is reached.
 SortByType() in class PersonalLibrary is reached.
 printLibrary() in class PersonalLibrary is reached.
 deleteEntry() in class PersonalLibrary is reached.
 sizeOfLibrary() in class PersonalLibrary is reached.
 Entry's sortByType() is reached.
 Entry's sortByTitle() is reached.
 Entry's sortByTypeAndTitle() is reached.
 CompareTo() in class Entry is reached
 Title: Unknown Title
 Format: Unknown Format
 Location: Unknown Location
 Note: Unknown Note
 Title: Unknown Title
 Format: Unknown Format
 Location: Unknown Location
 Note: Unknown Note
 Author: Unknown Author
 CompareTo() in class Entry is reached
 Title: Unknown Title
 Format: Unknown Format
 Location: Unknown Location
 Note: Unknown Note
 Author: Unknown Artist
 Genre: Unknown Genre
 CompareTo() in class Entry is reached
 Title: Unknown Title
 Format: Unknown Format
 Location: Unknown Location
 Note: Unknown Note
 Star: Unknown Star
 CompareTo() in class Entry is reached
 Title: Unknown Title
 Format: Unknown Format
 Location: Unknown Location
 Note: Unknown Note
 CompareTo() in class Entry is reached
 Object is write to the disk
 IO exception in writing is caught
 Object is read back from the disk
 IO exception in reading is caught
 Error in casting in reading is caught


 ------------------------------------------------*/

/*
 * // instantiate two objects, one GUI (View Class), one PersonalLibrary //
 * (Model Class) //GUI gui = new GUI(); PersonalLibrary mediaLibrary = new
 * PersonalLibrary();
 * 
 * //When add new Entry is called, it creates Entry, Book, Song, VideoGame,
 * Video objects Entry newEntry= new Entry(); Entry anotherEntry = new Entry();
 * Book newBook= new Book(); Book anotherBook= new Book(); Song newSong= new
 * Song(); Song anotherSong= new Song(); Video newVideo= new Video(); Video
 * anotherVideo= new Video(); VideoGame newVideoGame= new VideoGame(); VideoGame
 * anotherVideoGame= new VideoGame();
 * 
 * //Manually call methods on PersonalLibrary
 * mediaLibrary.addNewEntry(newEntry);
 * //mediaLibrary.sortByTypeAndTitle(newEntry); //mediaLibrary.printLibrary();
 * mediaLibrary.deleteEntry(newEntry); mediaLibrary.sizeOfLibrary();
 * mediaLibrary.retrieveByType("Search Type");
 * mediaLibrary.retrieveByTitle("Search Title");
 * mediaLibrary.retrieveByTypeAndTitle("Search Key");
 * 
 * //Manually call methods on Entry
 * 
 * newEntry.compareTo(anotherEntry); System.out.println(newEntry); //Manually
 * call methods on Book System.out.println(newBook);
 * //newBook.compareTo(anotherBook); //Manually call methods on Song
 * System.out.println(newSong); //newSong.compareTo(anotherSong); //Manually
 * call methods on Video System.out.println(newVideo);
 * //newVideo.compareTo(anotherVideo); //Manually call methods on VideoGame
 * System.out.println(newVideoGame); //newVideoGame.compareTo(anotherVideoGame);
 * 
 * // write object to disk (write = output not a typo) //try catch block is
 * omitted at this point, because catch clutch is never reached FileOutputStream
 * outFile; ObjectOutputStream outObject; //try {
 * System.out.println("Object is write to the disk"); //} //catch (IOException
 * ioe) { System.out.println("IO exception in writing is caught"); //}
 * 
 * // read object to disk (read = input not a type) //try catch block is omitted
 * at this point, because catch clause is never reached FileInputStream inFile;
 * ObjectInputStream inObject; //try {
 * System.out.println("Object is read back from the disk"); //} //catch
 * (IOException ioe) { System.out.println("IO exception in reading is caught");
 * //} catch (ClassNotFoundException cnfe) {
 * System.out.println("Error in casting in reading is caught"); //}
 */
