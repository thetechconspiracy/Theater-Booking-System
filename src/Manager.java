/**
 * 
 * @author Brian Remer
 * 
 * This the Manager Class. This type of user has the ability to add movies to the system and set the times and prices.
 *
 */
import java.util.*;

public class Manager implements User {
	private String name;
	private int priority;
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
	public void addEvent(Theater theater) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("What would you like to add?\n1: Movie\n2: Play\n3: Concert");
		int choice = keyboard.nextInt();
		switch(choice)
		{
		case 1:
			System.out.println("Enter the movie's title: ");
			String movieTitle = keyboard.nextLine();
			System.out.println("Enter the movie's description: ");
			String movieDes = keyboard.nextLine();
			System.out.println("Enter the movie's rating: ");
			String movieRating = keyboard.nextLine();
			theater.addEvent(new Movie(movieTitle, movieDes, movieRating));
			break;
		case 2:
			System.out.println("Enter the movie's title: ");
			String playTitle = keyboard.nextLine();
			System.out.println("Enter the movie's description: ");
			String playDes = keyboard.nextLine();
			System.out.println("Enter the movie's rating: ");
			String playRating = keyboard.nextLine();
			theater.addEvent(new Play(playTitle, playDes, playRating));
			break;
		case 3:
			System.out.println("Enter the movie's title: ");
			String concertTitle = keyboard.nextLine();
			System.out.println("Enter the movie's description: ");
			String concertDes = keyboard.nextLine();
			System.out.println("Enter the movie's rating: ");
			String concertRating = keyboard.nextLine();
			theater.addEvent(new Play(concertTitle, concertDes, concertRating));
			break;
		default:
			System.out.println("Invalid Choice");
		}
		
	}
	
	/**
	 * 
	 */
	public void setTime() {
		
	}
	
	/**
	 * 
	 */
	public void setPrice() {
		
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
	 * returns the priority of the account
	 */
	public int getPriority() {
		return this.priority;
	}

}
