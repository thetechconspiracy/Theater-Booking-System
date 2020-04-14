public class ConsumerTest {
	
	public static void main (String[] args) {
		
		String name = "Dave Grohl";
		String username = "degrohl";
		String password = "grohldave1969";
		
		System.out.println("creating new consumer with username 'degrohl' and password 'grohldave1969'.");
		Consumer daveGrohl = new Consumer(name, username, password);
		daveGrohl.getName();
		daveGrohl.getUserName();
		daveGrohl.getPassword();
		
		String movieTitle = "Parasite";
		String movieDes = "The members of a poor family scheme to become employed by a wealthy family by "
				+ "infiltrating their household and posing as unrelated, highly qualified individuals.";
		String movieRating = "5";
		String movieCast = "Song Kang-ho, Lee Sun-kyun, Cho Yeo-jeong, Choi Woo-shik, Park So-dam, Jang Hye-jin, and Lee Jung-eun";
		String movieDirector = "Bong Joon-ho";
		Movie parasite = new Movie(movieTitle, movieDes, movieRating, movieDirector, movieCast);
		
		System.out.println("Dave Grohl should now be prompted to buy a ticket to a 21:00 showing of 'Parasite'.");
		daveGrohl.buyTicket(parasite);
		System.out.println("Here is Dave's ticket.");
		daveGrohl.viewTickets();
		daveGrohl.printTicket();
		System.out.println("Dave should now be prompted to rate 'Parasite'.");
		daveGrohl.rateMovie(parasite);
		
	}
	
}