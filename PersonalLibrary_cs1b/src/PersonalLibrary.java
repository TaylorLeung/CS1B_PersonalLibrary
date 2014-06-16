import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

/**
 * In this class, PersonalLibrary is an array list that contains different kinds
 * of entries(medias). User can add, search and delete an entry, and print the
 * entire library.
 */
public class PersonalLibrary implements Serializable {

	private ArrayList<Entry> personalLibrary;

	/**
	 * default constructor
	 * @author Bowen Yang
	 */
	public PersonalLibrary() {
		personalLibrary = new ArrayList<Entry>();
	}

	/**
	 * addNewEntry adds a new Entry to the personalLibrary
	 * @author Bowen Yang
	 * @param Entry
	 */
	public void addNewEntry(Entry e) {
		personalLibrary.add(e);
	}

	/**
	 * sort the entries in the library by their titles and types
	 * 
	 * @param e
	 * @author taylorxleung
	 */

	public void sortByTypeAndTitle(ArrayList<Entry> library) {
		System.out.println("Entry's sortByTypeAndTitle() is reached.");

		// sort by Type
		// for (int i= 0; i <this.sizeOfLibrary() ;i++) {
		// ((Entry) personalLibrary.get(i)).typeCategorize(e);
		// sort by Title within the same type
		// ((Entry) personalLibrary.get(i)).sortByTitleWithinType();

	}

	/*
	 * sort by the type
	 * 
	 * @param Entry
	 * 
	 * public void sortByType(Entry e){ //call sortByTpe() in Entry
	 * System.out.println("SortByType() in class PersonalLibrary is reached.");
	 * }
	 * 
	 * /** sort the entries by their titles
	 * 
	 * @param e
	 * 
	 * public void sortByTitle(Entry e) {
	 * System.out.println("Entry's sortByTitle() is reached.");
	 * //Collections.sort(personalLibrary); }
	 */

	/**
	 * delete a specified entry
	 * 
	 * @param Entry
	 */
	public void deleteEntry(Entry e) {
		System.out
				.println("deleteEntry() in class PersonalLibrary is reached.");
	}

 /*-------------------------------------------------------------------------
	// I don't think this is necessary since we could simply call
	 * size() --- Bowen
	public int sizeOfLibrary() {
		int sizeOfLibrary = 0;
		System.out
				.println("sizeOfLibrary() in class PersonalLibrary is reached.");
		return sizeOfLibrary;
	}
---------------------- */
	/**
	 * search the list for a particular entry or entries by type
	 * 
	 * @param serachType
	 * @return matchType
	 */
	public String retrieveByType(String searchType) {
		String matchType = "retrieveByType() in class PersonalLibrary is reached.";
		return matchType;

	}

	/**
	 * search the list for a particular entry or entries by title
	 * 
	 * @param serachTitle
	 * @return matchList
	 */
	public String retrieveByTitle(String serarchTitle) {
		String matchList = "retrieveByTitle() in class PersonalLibrary is reached.";
		return matchList;
	}

	/**
	 * search the list for a particular entry or entries by type and title
	 * 
	 * @param serachTitle
	 * @return matchList
	 */
	public String retrieveByTypeAndTitle(String serachTitle) {
		String matchList = "retrieveByTypeAndTitle() in class PersonalLibrary is reached.";
		return matchList;
	}

	/**
	 * write the whole library list to disk
	 * 
	 * @param library
	 * @author Bowen Yang
	 */
	public void writeEntry() {

		FileOutputStream outFile;
		ObjectOutputStream outObject;
		try {
			outFile = new FileOutputStream("data");
			outObject = new ObjectOutputStream(outFile);
			outObject.writeObject(personalLibrary);
			outFile.close();
			outObject.close();
		} catch (IOException ioe) {
			System.out.println("Error writing objects to the file: "
					+ ioe.getMessage());
		}
	}

	/**
	 * read the whole library from disk
	 * 
	 * @param library
	 * @author Bowen Yang
	 */
	public String readEntry() {
		FileInputStream inFile;
		ObjectInputStream inObject;

		try {
			inFile = new FileInputStream("data");
			inObject = new ObjectInputStream(inFile);
			personalLibrary = (ArrayList<Entry>) inObject.readObject();
			inFile.close();
			inObject.close();
			return personalLibrary.toString();
		} catch (IOException ioe) {
			// TODO Auto-generated catch block
			System.out.println("Error reading objects from the file: "
					+ ioe.getMessage());
			return null;
		} catch (ClassNotFoundException cnfe) {
			System.out.println("Error in casting to Entry: " + cnfe);
			return null;
		}
	}
	
	
	/**
	 * toString() that prints the content of the arrayList
	 * @author Bowen Yang
	 */
	public String toString(){
		return personalLibrary.toString();
	}
}
