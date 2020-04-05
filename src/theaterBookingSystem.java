import java.util.*;

public class theaterBookingSystem {
	
	public void run() {
		ArrayList<Event> events = LoadEventDatabase.loadDatabase();


	    for(Event event : events){
	      System.out.println(event);
	    }

	    SaveEventDatabase.saveDatabase(events);

	    ArrayList<Venue> venues = LoadVenueDatabase.loadDatabase();

	    for(Venue venue : venues){
	      if(venue.getType().equals("movieTheater")){
	        MovieTheater movie = (MovieTheater)venue;
	        ArrayList<Theater> children= movie.getTheaters();

	        for(Theater theater : children)
	          theater.printSeatingChart();
	        //System.exit(0);
	      }

	    }
	    
	    Theater theater = new Theater("Test 1", events);
	    User[] users = userArray();
	    login(users, theater);
		
	}
	
	/**
	 * login method that is called at the beginning for the user to initiate commands
	 * it takes in an array of users to check the logins by
	 */
	public void login(User[] users, Theater theater) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Would you like to login as a:\n1: User\n2: Manager\n3: Continue as Guest");
		int ans = keyboard.nextInt();
		keyboard.nextLine();
		switch(ans) {
		case 1:
			System.out.println("Enter your username: ");
			String cUserName = keyboard.nextLine();
			System.out.println("Enter your password: ");
			String cPassword = keyboard.nextLine();
			if(checkCredentials(cUserName, cPassword, users).getType().equals("Admin")) {
				System.out.println("Invalide login. Will continue as guest");
				guestOptions();
				return;
			}
			consumerOptions();
			break;
		case 2:
			System.out.println("Enter your username: ");
			String userName = keyboard.nextLine();
			System.out.println("Enter your password: ");
			String password = keyboard.nextLine();
			if(checkCredentials(userName, password, users).getType().equals("Admin")) {
				System.out.println("Invalide login. Will continue as guest");
				guestOptions();
				return;
			}
			managerOptions((Manager)checkCredentials(userName, password, users), theater);
			break;
		case 3:
			guestOptions();
			break;
		}
	}
	
	/**
	 * 
	 * @param userName
	 * @param password
	 * @param users
	 * @return true or false depending on the login
	 * this method takes in the strings and checks them against the user array for a valid login
	 */
	public User checkCredentials(String userName, String password, User[] users) {
		for(User user:users) {
			if(user == null) {
				break;
			}
			if(userName.equals(user.getUserName()) && password.equals(user.getPassword())) {
				return user;
			}
		}
		Admin guest = new Admin();
		return guest;
	}
	
	/**
	 * method that initiates an array of users. 
	 * Two users are set for the guidelines of the project implementation assignment
	 */
	public User[] userArray() {
		Consumer consumer = new Consumer("Brian Remer", "beremer", "12345");
		Manager manager = new Manager("Bob Jones", "bjones", "67890");
		User[] ret = new User[100];
		ret[0] = consumer;
		ret[1] = manager;
		return ret;
	}
	
	
	/**
	 * this calls the manager options when a user logs in as a manager
	 */
	public void managerOptions(Manager manager, Theater theater) {
		Scanner keyboard = new Scanner(System.in);
		boolean cont = true;
		System.out.println("Welcome to the Manager Screen");
		while(cont) {
			System.out.println("What would you like to do?\n1: Add an Event\n9: Quit");
			int ans = keyboard.nextInt();
			keyboard.nextLine();
			switch(ans) {
			case 1:
				manager.addEvent(theater);
				break;
			case 9:
				cont = false;
				break;
			}
		}
		
		
	}
	
	public void addEvent() {
		
	}
	
	
	public void consumerOptions() {
		System.out.println("Welcome to the Consumer Screen");
		
	}
	
	public void guestOptions() {
		System.out.println("Welcome to the Guest Screen");
		
	}
	

}
