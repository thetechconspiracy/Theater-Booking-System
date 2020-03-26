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
	private HashMap password;
	
	/**
	 * 
	 */
	public void addMovie() {
		
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
