/**
 * 
 * @author Something Creative
 *
 * 
 * This the Manager Class. This type of user has the ability to add events to the system and
 * view events
 *
 */
import java.util.*;

public class Manager implements User {
	private String name;
	private String userName;
	private String password;
	
	/**
	 * 
	 * @param name
	 * @param userName
	 * @param password
	 * 
	 * constructor for a manager
	 */
	public Manager(String name, String userName, String password) {
		this.name = name;
		this.userName = userName;
		this.password = password;
	}
	
	/**
	 * adds an event to a venue
	 */
	public boolean addEvent(Theater theater) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("What would you like to add?\n1: Movie\n2: Play\n3: Concert");
		int choice = keyboard.nextInt();
		keyboard.nextLine();
		switch(choice)
		{
		case 1:
			System.out.println("Enter the movie's title: ");
			String movieTitle = keyboard.nextLine();
			System.out.println("Enter the movie's description: ");
			String movieDes = keyboard.nextLine();
			System.out.println("Enter the movie's rating: ");
			String movieRating = keyboard.nextLine();
			String[] mShowTimes = showTimes();
			int x = rows();
			int y = seats();
			SeatingChart seatingChart = setSeatingChart(x, y);
			theater.addEvent(new Movie(movieTitle, movieDes, movieRating, mShowTimes, seatingChart));
			break;
		case 2:
			System.out.println("Enter the play's title: ");
			String playTitle = keyboard.nextLine();
			System.out.println("Enter the play's description: ");
			String playDes = keyboard.nextLine();
			System.out.println("Enter the play's rating: ");
			String playRating = keyboard.nextLine();
			System.out.println("Enter the playwright's name: ");
			String playwright = keyboard.nextLine();
			String[] castMembers = cast();
			String[] showTimes = showTimes();
			int z = rows();
			int a = seats();
			SeatingChart pSeatingChart = setSeatingChart(z, a);
			theater.addEvent(new Play(playTitle, playDes, playRating, showTimes, playwright, castMembers, pSeatingChart));
			break;
		case 3:
			System.out.println("Enter the concert's title: ");
			String concertTitle = keyboard.nextLine();
			System.out.println("Enter the concert's description: ");
			String concertDes = keyboard.nextLine();
			System.out.println("Enter the concert's rating: ");
			String concertRating = keyboard.nextLine();
			System.out.println("Enter the name of the band: ");
			String band = keyboard.nextLine();
			String[] cShowTimes = showTimes();
			int b = rows();
			int c = seats();
			SeatingChart cSeatingChart = setSeatingChart(b, c);
			theater.addEvent(new Concert(concertTitle, concertDes, concertRating, band, cShowTimes, cSeatingChart));
			break;
		default:
			System.out.println("Invalid Choice");
		}
		System.out.println("Here are the updated events at the theater: ");
		theater.printEvents();
		System.out.println();
		return true;
	}
	
	/**
	 * 
	 * @return returns an array of strings that represent show times
	 */
	public String[] showTimes() {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("How many showings will there be?");
		int times = keyboard.nextInt();
		keyboard.nextLine();
		String[] showTimes = new String[times];
		for(int i = 0; i < times; i++) {
			System.out.println("Enter showtime " + (i+1) + ":");
			showTimes[i] = keyboard.nextLine();
		}
		return showTimes;
	}
	
	/**
	 * creates a seating chart to add to an event
	 */
	public SeatingChart setSeatingChart(int x, int y) {
		return new SeatingChart(x, y);
	}
	
	/**
	 * returns the number of seats per row for an event
	 */
	public int seats() {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("How man seats per row?");
		int seats = keyboard.nextInt();
		return seats;
	}
	
	/**
	 * gets the number of rows for an event
	 */
	public int rows() {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("How many rows?");
		int rows = keyboard.nextInt();
		return rows;
	}
	
	/**
	 * method for adding members to a cast for a play
	 */
	public String[] cast() {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("How many cast members will there be?");
		int times = keyboard.nextInt();
		keyboard.nextLine();
		String[] castMembers = new String[times];
		for(int i = 0; i < times; i++) {
			System.out.println("Enter cast member " + (i+1) + ":");
			castMembers[i] = keyboard.nextLine();
		}
		return castMembers;
	}
	
	/**
	 * views the movies available for purchase
	 */
	public void viewMovies(Theater theater) {
		theater.printEvents();
	}
	
	/**
	 * returns manager
	 */
	public String getType() {
		return "Manager";
	}
	
	/**
	 * returns the manager's name
	 */
	public String getName() {
		return this.name;
	}
	
	/**
	 * returns the username
	 */
	public String getUserName() {
		return this.userName;
	}
	
	/**
	 * returns the password
	 */
	public String getPassword() {
		return this.password;
	}
	
	
	

}
