/**
 * 
 * @author Brian Remer
 * This is the ticket class to keep track of the date for an event
 *
 */
import java.io.*;
import java.time.*;
import java.util.*;

public class Ticket {
	private Event event;
	private String time;
	
	public Ticket(Event event, String time) {
		this.event = event;
		this.time = time;
	}
	public void setEvent(Event event) {
		
		this.event = event;
		
	}
	
	
	
	public Event getEvent() {
		return this.event;
	}
	
	/**
	 * prints the ticket to a text file
	 */
	public void printTicket() {
		try {
			FileWriter filewriter = new FileWriter("c:/temp/ticket.txt");
			PrintWriter printwriter = new PrintWriter(filewriter);
			printwriter.println("**************************************");
			printwriter.print(this.event.getTitle());
			//TODO get individual date and time for an event
			printwriter.println(this.event.getRating());
			printwriter.println(this.event.getDes());
			printwriter.println("**************************************");
			printwriter.close();
		}
		catch(Exception e) {
			System.out.println("Could not successfully write to the file");
		}
		
	}
}
