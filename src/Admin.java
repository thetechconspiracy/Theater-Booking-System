/**
 * 
 * @author Brian Remer
 * This is the admin class. It has the power to check prices and times of movies.
 */
import java.util.*;

public class Admin {
	private String name;
	private int priority;
	private String userName;
	private HashMap password;
	
	public String getType() {
		return "Admin";
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getPriority() {
		return this.priority;
	}
	
	public boolean checkTicket() {
		return true;
	}
	
	public boolean checkTime() {
		return true;
	}
	
	public boolean checkPrice() {
		return true;
	}

}
