/**
 * @author Something Creative
 * This is the ticket class to keep track of the information for the user's event
 */

import java.io.*;
import java.util.*;

public class Ticket {
	
	private Event event;
	private String time;
	private int row;
	private int seat;
	
	public Ticket(Event event, String time, int row, int seat) {
		this.event = event;
		this.time = time;
		this.row = (row + 1);
		this.seat = (seat + 1);
	}
	
	
	/**
	 * getters and setters for ticket
	 * 
	 */
	public Event getEvent() {
		return this.event;
	}
	public void setEvent(Event event) {
		this.event = event;
	}
	
	public String getTime() {
		return this.time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	
	/**
	 * prints the ticket to a text file
	 */
	public void printTicket(int i) {
		try {
			String name = String.valueOf(i);
			FileWriter filewriter = new FileWriter("C:/Downloads/tickets/ticket" + name + ".txt");
			PrintWriter printwriter = new PrintWriter(filewriter);
			printwriter.println("**************************************");
			printwriter.println(this.event.getTitle());
			printwriter.println(this.event.getRating());
			printwriter.println(this.event.getDes());
			printwriter.println(this.time);
			printwriter.println("Row Number: " + this.row + " Seat Number: " + this.seat);
			printwriter.println("**************************************");
			printwriter.close();
		}
		catch(Exception e) {
			System.out.println("Could not successfully write to the file");
		}
		
	}
	
	/**
	 * prints out the information for the ticket for viewing
	 */
	public void viewTicket() {
		System.out.println("**************************************");
		System.out.println(this.event.getTitle());
		System.out.println(this.event.getRating());
		System.out.println(this.event.getDes());
		System.out.println(this.time);
		System.out.println("Row Number: " + this.row + " Seat Number: " + this.seat);
		System.out.println("**************************************");
	}
	
}