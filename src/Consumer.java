import java.util.*;

/**
 * This is the consumer class. It has the ability to store tickets and make purchases.
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
	
	/**
	 * this method allows the user to print a ticket
	 */
	public void printTicket() {
		Scanner keyboard = new Scanner(System.in);
		for (Ticket t : this.tickets) {
			if (t != null) {
				System.out.println("" + t.getEvent().getTitle());
				System.out.println("" + t.getTime());
				System.out.println("Would you like to print this ticket? Y/N");
				String answer = keyboard.nextLine();
				if(answer.equalsIgnoreCase("y")) {
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
		int rating;
		while (true) {
			System.out.println("Enter a rating between 0 and 5 stars:");
			rating = keyboard.nextInt();
			if (rating < 0 || rating > 5) {
				System.out.println("Invalid rating. Please enter an integer between 0 and 5, inclusive.");
			}
			else {
				break;
			}
		}
		event.addReview(new Review(title, comment, rating));
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
	
}
