import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 * GUI class, aka graphical user interface it is the View class
 * 
 */
public class GUI extends JFrame {

	private FlowLayout fl;

	private PersonalLibrary pl;

	private JFrame mainFrame, addEntryFrame, printLibraryFrame,
			retrieveEntryFrame, deleteFrame;

	private JFrame entryFrame;

	private JFrame saveSuccessfulFrame, noTitleFrame;

	private JButton addEntry, printLibrary, retrieveEntry, delete, exit;
	
	private JTextArea libraryTA;

	private JButton entryOK;

	private JButton noTitleOK;

	private JButton saveLibrary, saveSuccessfulOK, cancel;

	private JLabel welcomeMsg, saveSuccessfulMsg, noTitleMsg;

	private JPanel myPanel;

	private JButton Book, Song, Video, VideoGame;

	private JTextField titleTF, formatTF, locationTF, notesTF;

	private JLabel titleL, formatL, locationL, notesL;

	// labels and text fields for Book
	private JLabel addBookAuthor;
	private JTextField bookAuthor;

	// labels and text fields for Song
	private JLabel addSongArtist, addSongGenre;
	private JTextField songArtist, songGenre;

	// labels and text fields for Video
	private JLabel addVideoStar;
	private JTextField videoStar;

	public GUI() {
		fl = new FlowLayout();
		pl = new PersonalLibrary();
		initialize();
	}

	private void initialize() {

		mainFrame = new JFrame();
		mainFrame.setLayout(fl);
		mainFrame.setSize(215, 250);

		// This will center the JFrame in the middle of the screen
		mainFrame.setLocationRelativeTo(null);

		// create new elements
		welcomeMsg = new JLabel("Welcome to your personal library!");
		myPanel = new JPanel();
		addEntry = new JButton("Add a new entry");
		printLibrary = new JButton("Print your entire library");
		retrieveEntry = new JButton("Retrieve your entry");
		delete = new JButton("Delete an entry");
		exit = new JButton("EXIT");

		// add the elements to the frame
		mainFrame.add(welcomeMsg);
		mainFrame.add(myPanel);
		mainFrame.add(addEntry);
		mainFrame.add(printLibrary);
		mainFrame.add(retrieveEntry);
		mainFrame.add(delete);
		mainFrame.add(exit);

		mainFrame.setVisible(true);
		mainFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);

		/**
		 * actionListener for addEntry
		 * 
		 * @author Bowen Yang
		 */
		addEntry.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				addEntryFrame = new JFrame();
				addEntryFrame.setSize(200, 200);
				addEntryFrame.setLayout(fl);
				addEntryFrame.setLocationRelativeTo(null);
				addEntryFrame.setVisible(true);
				addEntryFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);

				Book = new JButton("Book");
				Song = new JButton("Song");
				Video = new JButton("Video");
				VideoGame = new JButton("VideoGame");
				saveLibrary = new JButton("Save your Library");
				cancel = new JButton("Cancel");

				addEntryFrame.add(Book);
				addEntryFrame.add(Song);
				addEntryFrame.add(Video);
				addEntryFrame.add(VideoGame);
				addEntryFrame.add(saveLibrary);
				addEntryFrame.add(cancel);

				/**
				 * set Book's actionListener
				 * 
				 * @author Taylor
				 */
				Book.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub

						entryFrame = new JFrame();
						entryFrame.setSize(300, 350);
						entryFrame.setLayout(fl);
						entryFrame.setLocationRelativeTo(null);
						entryFrame.setVisible(true);
						entryFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);

						titleL = new JLabel("Book's title");
						titleTF = new JTextField(20);
						formatL = new JLabel("Book's format");
						formatTF = new JTextField(20);
						locationL = new JLabel("Book's location");
						locationTF = new JTextField(20);
						notesL = new JLabel("Book's notes");
						notesTF = new JTextField(20);
						addBookAuthor = new JLabel("Book's author");
						bookAuthor = new JTextField(20);
						entryOK = new JButton("OK");

						entryFrame.add(titleL);
						entryFrame.add(titleTF);
						entryFrame.add(formatL);
						entryFrame.add(formatTF);
						entryFrame.add(locationL);
						entryFrame.add(locationTF);
						entryFrame.add(notesL);
						entryFrame.add(notesTF);
						entryFrame.add(addBookAuthor);
						entryFrame.add(bookAuthor);
						entryFrame.add(entryOK);

						entryOK.addActionListener(new ActionListener() {

							@Override
							public void actionPerformed(ActionEvent e) {
								// TODO Auto-generated method stub

								if (titleTF.getText().equals("")) {
									noTitleFrame = new JFrame();
									noTitleFrame.setSize(200, 150);
									noTitleFrame.setLayout(fl);
									noTitleFrame.setLocationRelativeTo(null);
									noTitleFrame.setVisible(true);
									noTitleFrame
											.setDefaultCloseOperation(EXIT_ON_CLOSE);

									noTitleMsg = new JLabel(
											"Your entry has to have a title!");
									noTitleOK = new JButton("OK");

									noTitleFrame.add(noTitleMsg);
									noTitleFrame.add(noTitleOK);

									noTitleOK
											.addActionListener(new ActionListener() {

												@Override
												public void actionPerformed(
														ActionEvent e) {
													// TODO Auto-generated
													// method stub
													noTitleFrame.dispose();
												}
											});

								} else {
									Book book = new Book();
									book.setTitle(titleTF.getText());
									book.setFormat(formatTF.getText());
									book.setLocation(locationTF.getText());
									book.setNote(notesTF.getText());
									book.setAuthor(bookAuthor.getText());

									pl.addNewEntry(book);

									entryFrame.dispose();
								}
							}
						});
					}
				});

				/**
				 * set Song's actionListener
				 * 
				 * @author Bowen Yang
				 */
				Song.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub

						entryFrame = new JFrame();
						entryFrame.setSize(300, 370);
						entryFrame.setLayout(fl);
						entryFrame.setLocationRelativeTo(null);
						entryFrame.setVisible(true);
						entryFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);

						titleL = new JLabel("Song's title");
						titleTF = new JTextField(20);
						formatL = new JLabel("Song's format");
						formatTF = new JTextField(20);
						locationL = new JLabel("Song's location");
						locationTF = new JTextField(20);
						notesL = new JLabel("Song's notes");
						notesTF = new JTextField(20);
						addSongArtist = new JLabel("Song's artist");
						songArtist = new JTextField(20);
						addSongGenre = new JLabel("Song's genre");
						songGenre = new JTextField(20);
						entryOK = new JButton("OK");

						entryFrame.add(titleL);
						entryFrame.add(titleTF);
						entryFrame.add(formatL);
						entryFrame.add(formatTF);
						entryFrame.add(locationL);
						entryFrame.add(locationTF);
						entryFrame.add(notesL);
						entryFrame.add(notesTF);
						entryFrame.add(addSongArtist);
						entryFrame.add(songArtist);
						entryFrame.add(addSongGenre);
						entryFrame.add(songGenre);
						entryFrame.add(entryOK);

						entryOK.addActionListener(new ActionListener() {

							@Override
							public void actionPerformed(ActionEvent e) {
								// TODO Auto-generated method stub

								if (titleTF.getText().equals("")) {
									noTitleFrame = new JFrame();
									noTitleFrame.setSize(200, 150);
									noTitleFrame.setLayout(fl);
									noTitleFrame.setLocationRelativeTo(null);
									noTitleFrame.setVisible(true);
									noTitleFrame
											.setDefaultCloseOperation(EXIT_ON_CLOSE);

									noTitleMsg = new JLabel(
											"Your entry has to have a title!");
									noTitleOK = new JButton("OK");

									noTitleFrame.add(noTitleMsg);
									noTitleFrame.add(noTitleOK);

									noTitleOK
											.addActionListener(new ActionListener() {

												@Override
												public void actionPerformed(
														ActionEvent e) {
													// TODO Auto-generated
													// method stub
													noTitleFrame.dispose();
												}
											});

								} else {
									Song song = new Song();
									song.setTitle(titleTF.getText());
									song.setFormat(formatTF.getText());
									song.setLocation(locationTF.getText());
									song.setNote(notesTF.getText());
									song.setArtist(songArtist.getText());
									song.setGenre(songGenre.getText());

									pl.addNewEntry(song);

									entryFrame.dispose();
								}
							}
						});
					}
				});

				/**
				 * set Video's actionListener
				 * 
				 * @author Bowen Yang
				 */
				Video.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub

						entryFrame = new JFrame();
						entryFrame.setSize(300, 350);
						entryFrame.setLayout(fl);
						entryFrame.setLocationRelativeTo(null);
						entryFrame.setVisible(true);
						entryFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);

						titleL = new JLabel("Video's title");
						titleTF = new JTextField(20);
						formatL = new JLabel("Video's format");
						formatTF = new JTextField(20);
						locationL = new JLabel("Video's location");
						locationTF = new JTextField(20);
						notesL = new JLabel("Video's notes");
						notesTF = new JTextField(20);
						addVideoStar = new JLabel("Video's star");
						videoStar = new JTextField(20);
						entryOK = new JButton("OK");

						entryFrame.add(titleL);
						entryFrame.add(titleTF);
						entryFrame.add(formatL);
						entryFrame.add(formatTF);
						entryFrame.add(locationL);
						entryFrame.add(locationTF);
						entryFrame.add(notesL);
						entryFrame.add(notesTF);
						entryFrame.add(addVideoStar);
						entryFrame.add(videoStar);
						entryFrame.add(entryOK);

						entryOK.addActionListener(new ActionListener() {

							@Override
							public void actionPerformed(ActionEvent e) {
								// TODO Auto-generated method stub
								if (titleTF.getText().equals("")) {
									noTitleFrame = new JFrame();
									noTitleFrame.setSize(200, 150);
									noTitleFrame.setLayout(fl);
									noTitleFrame.setLocationRelativeTo(null);
									noTitleFrame.setVisible(true);
									noTitleFrame
											.setDefaultCloseOperation(EXIT_ON_CLOSE);

									noTitleMsg = new JLabel(
											"Your entry has to have a title!");
									noTitleOK = new JButton("OK");

									noTitleFrame.add(noTitleMsg);
									noTitleFrame.add(noTitleOK);

									noTitleOK
											.addActionListener(new ActionListener() {

												@Override
												public void actionPerformed(
														ActionEvent e) {
													// TODO Auto-generated
													// method stub
													noTitleFrame.dispose();
												}
											});

								}

								else {
									Video video = new Video();
									video.setTitle(titleTF.getText());
									video.setFormat(formatTF.getText());
									video.setLocation(locationTF.getText());
									video.setNote(notesTF.getText());
									video.setStar(videoStar.getText());

									pl.addNewEntry(video);

									entryFrame.dispose();
								}
							}
						});
					}
				});

				/**
				 * set VideoGame's actionListener
				 * 
				 * @author Taylor
				 */
				VideoGame.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub

						entryFrame = new JFrame();
						entryFrame.setSize(300, 350);
						entryFrame.setLayout(fl);
						entryFrame.setLocationRelativeTo(null);
						entryFrame.setVisible(true);
						entryFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);

						titleL = new JLabel("VideoGame's title");
						titleTF = new JTextField(20);
						formatL = new JLabel("VideoGame's format");
						formatTF = new JTextField(20);
						locationL = new JLabel("VideoGame's location");
						locationTF = new JTextField(20);
						notesL = new JLabel("VideoGame's notes");
						notesTF = new JTextField(20);
						entryOK = new JButton("OK");

						entryFrame.add(titleL);
						entryFrame.add(titleTF);
						entryFrame.add(formatL);
						entryFrame.add(formatTF);
						entryFrame.add(locationL);
						entryFrame.add(locationTF);
						entryFrame.add(notesL);
						entryFrame.add(notesTF);
						entryFrame.add(entryOK);

						entryOK.addActionListener(new ActionListener() {

							@Override
							public void actionPerformed(ActionEvent e) {
								// TODO Auto-generated method stub
								if (titleTF.getText().equals("")) {
									noTitleFrame = new JFrame();
									noTitleFrame.setSize(200, 150);
									noTitleFrame.setLayout(fl);
									noTitleFrame.setLocationRelativeTo(null);
									noTitleFrame.setVisible(true);
									noTitleFrame
											.setDefaultCloseOperation(EXIT_ON_CLOSE);

									noTitleMsg = new JLabel(
											"Your entry has to have a title!");
									noTitleOK = new JButton("OK");

									noTitleFrame.add(noTitleMsg);
									noTitleFrame.add(noTitleOK);

									noTitleOK
											.addActionListener(new ActionListener() {

												@Override
												public void actionPerformed(
														ActionEvent e) {
													// TODO Auto-generated
													// method stub
													noTitleFrame.dispose();
												}
											});

								} else {
									VideoGame videoGame = new VideoGame();

									videoGame.setTitle(titleTF.getText());
									videoGame.setFormat(formatTF.getText());
									videoGame.setLocation(locationTF.getText());
									videoGame.setNote(notesTF.getText());

									pl.addNewEntry(videoGame);

									entryFrame.dispose();
								}
							}
						});
					}
				});

				/**
				 * set saveLibrary's actionListener
				 * 
				 * @author Bowen Yang
				 */
				saveLibrary.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						saveSuccessfulFrame = new JFrame();
						saveSuccessfulFrame.setLayout(fl);
						saveSuccessfulFrame.setSize(200, 100);
						saveSuccessfulFrame.setVisible(true);
						saveSuccessfulFrame.setLocationRelativeTo(null);
						saveSuccessfulFrame
								.setDefaultCloseOperation(EXIT_ON_CLOSE);

						saveSuccessfulOK = new JButton("OK");
						saveSuccessfulMsg = new JLabel("Successfully saved!");

						saveSuccessfulFrame.add(saveSuccessfulMsg);
						saveSuccessfulFrame.add(saveSuccessfulOK);

						saveSuccessfulOK
								.addActionListener(new ActionListener() {

									@Override
									public void actionPerformed(ActionEvent arg0) {
										// TODO Auto-generated method stub
										saveSuccessfulFrame.dispose();
										addEntryFrame.dispose();
									}
								});

						pl.writeEntry();
					}
				});
				
				/**
				 * set cancel's actionListener
				 * @author Bowen Yang
				 */
				cancel.addActionListener(new ActionListener(){

					@Override
					public void actionPerformed(ActionEvent arg0) {
						// TODO Auto-generated method stub
						addEntryFrame.dispose();
					}});

			}
		});

		/**
		 * actionListener for printLibrary
		 * 
		 * @author Bowen Yang
		 */
		printLibrary.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				printLibraryFrame = new JFrame();
				printLibraryFrame.setLocationRelativeTo(null);
				printLibraryFrame.setSize(300, 370);
				printLibraryFrame.setLayout(fl);
				printLibraryFrame.setVisible(true);
				printLibraryFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
				
				libraryTA = new JTextArea(pl.readEntry());
				printLibraryFrame.add(libraryTA);
				
			}
		});

		retrieveEntry.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {

			}
		});

		delete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {

			}
		});

		/**
		 * actionListener for exit close the main window
		 * 
		 * @author Bowen Yang
		 */
		exit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				mainFrame.dispose();
			}
		});

	}

}

