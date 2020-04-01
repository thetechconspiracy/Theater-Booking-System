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
//TODO add event variable
	private Event event;
	private LocalTime time;
	private LocalDate date;
	
	
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
			printwriter.println(this.event.getCastString());
			printwriter.println("**************************************");
			printwriter.close();
		}
		catch(Exception e) {
			System.out.println("Could not successfully write to the file");
		}
		
	}
	
	
	/**
	 * 
	 * @param time, the time to set the ticket to
	 * this method sets the time for the ticket
	 */
	public void setTime(LocalTime time) {
		this.time = time;
	}
	
	/**
	 * 
	 * @return returns the time of the ticket
	 */
	public LocalTime getTime() {
		return this.time;
	}
	
	/**
	 * 
	 * @param date, the date of the event
	 * sets the date for the ticket
	 */
	public void setDate(LocalDate date) {
		this.date = date;
	}
	
	/**
	 * 
	 * @return returns the date of the ticket
	 */
	public LocalDate getDate() {
		return this.date;
	}
}
