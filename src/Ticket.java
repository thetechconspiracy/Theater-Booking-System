/**
 * 
 * @author Brian Remer
 * This is the ticket class to keep track of the date for an event
 *
 */
import java.time.*;

public class Ticket {
//TODO add event variable
	//private Event event;
	private LocalTime time;
	private LocalDate date;
	
	/*
	public void setEvent(Event event) {
		
	}
	*/
	
	/*
	public Event getEvent() {
		return this.event;
	}
	*/
	
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
