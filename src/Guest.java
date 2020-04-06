/**
* @author Something Creative
 * This is the Guest class.
 * It has options similar to the consumer class, but there is no account tied to it
 * They also cannot write reviews
 */
import java.util.*;

public class Guest implements User {
	private String name;
	private Ticket[] tickets;
	
	/**
	 * guest constructor
	 */
	public Guest() {
		this.name = "Guest";
		this.tickets = new Ticket[100];
	}
	
	/**
	 * this method allows the user to print a ticket
	 */
	public void printTicket() {
		Scanner keyboard = new Scanner(System.in);
		
		for(Ticket t : this.tickets) {
			if(t != null) {
				System.out.println(""+t.getEvent().getTitle());
				System.out.println(""+t.getTime());
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
	 * @param event, takes in an event for ticket purchase
	 * this method is for a consumer purchasing a ticket
	 */
	public void buyTicket(Event event) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Which showtime would you like?");
		for(int i = 0; i < event.getTimes().length; i++) {
			System.out.print("" + event.getTimes()[i] + ", ");
		}
		String time = keyboard.nextLine();
		System.out.println("How many tickets would you like?");
		int number = keyboard.nextInt();
		keyboard.nextLine();
		
		int ticketNum = 1;
		for(int i = 0; i < this.tickets.length; i++) {
			if(tickets[i] == null) {
				for(int j = i; j < i + number; j++) {
					System.out.println("What seat would you like for ticket " + ticketNum + "?");
					tickets[j] = event.getSeatingChart().seatStatus(event, time);
				}
				return;
			}
		}
		System.out.println("Tickets have been purchased");
	}
	
	/**
	 * prints the tickets out to the console for the consumer to view
	 */
	public void viewTickets() {
		for(int i = 0; i < tickets.length; i++) {
			if(tickets[i] != null) {
				tickets[i].viewTicket();
			}
		}
	}
	
	/**
	 * views the movies available for purchase
	 */
	public void viewMovies(Theater theater) {
		theater.printEvents();
	}
	
	/**
	 * getters and setters for the guest
	 */
	public String getType() {
		return "Guest";
	}
	
	public String getName() {
		return this.name;
	}
	
	
	public String getUserName() {
		return "Guest";
	}
	
	public String getPassword() {
		return null;
	}
	
	

}