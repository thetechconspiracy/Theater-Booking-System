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
	private HashMap password;
	private Ticket[] tickets;
	
	/*
	public void purchaseTicket(Movie movie) {
		
	}
	*/
	
	/**
	 * 
	 */
	public void printTicket() {
		
	}
	
	/*
	public void rateMovie(Movie movie) {
		
	}
	*/
	
	/**
	 * logs the user out of the system
	 */
	public void logout() {
		
	}
	
	/**
	 * views the movies available for purchase
	 */
	public void viewMovies() {
		
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
	 * returns the priority of the user
	 */
	public int getPriority() {
		return this.priority;
	}
	
}
