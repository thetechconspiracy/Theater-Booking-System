import java.util.*;
/**
 * 
 * @author Brian Remer
 * This is the consumer class. It has the ability to store tickets and make purchases.
 *
 */
public class Consumer implements User {

	private String name;
	private int priority;
	private String userName;
	private String password;
	private Ticket[] tickets;
	
	/**
	 * 
	 * @param name
	 * @param userName
	 * @param password
	 * 
	 * constructor method for a consumer
	 */
	public Consumer(String name, String userName, String password) {
		this.name = name;
		this.userName = userName;
		this.password = password;
		this.tickets = new Ticket[100];
	}
	
	/*
	public void purchaseTicket(Movie movie) {
		
	}
	*/
	
	/**
	 * this method allows the user to print a ticket
	 */
	public void printTicket() {
		Scanner keyboard = new Scanner(System.in);
		
		for(Ticket t : this.tickets) {
			if(t != null) {
				System.out.println(""+t.getEvent().getTitle());
				System.out.println("Would you like to print this ticket? Y/N");
				String answer = keyboard.nextLine();
				if(answer.equals("Y")) {
					t.printTicket();
				}
			}
		}
		
	}
	
	/**
	 * 
	 * @param movie, movie to have a review for
	 * this method adds a review to a movie
	 */
	public void rateMovie(Event event) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter a title for your review:");
		String title = keyboard.nextLine();
		System.out.println("Enter a comment for your review:");
		String comment = keyboard.nextLine();
		System.out.println("Enter a number of stars out of 5:");
		int rating = keyboard.nextInt();
		
		event.addReview(new Review(title, comment, rating));
		
		
	}
	
	
	/**
	 * logs the user out of the system
	 */
	public void logout() {
		
	}
	
	/**
	 * views the movies available for purchase
	 */
	public void viewMovies(Theater theater) {
		theater.printEvents();
		
	}
	
	/**
	 * views the times available to the user
	 */
	public void viewTimes() {
		
	}
	
	/**
	 * returns the String consumer
	 */
	public String getType() {
		return "Consumer";
	}
	
	/**
	 * returns the name of the user
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
	
	/**
	 * returns the priority of the user
	 */
	public int getPriority() {
		return this.priority;
	}
	
}
