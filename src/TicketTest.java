public class TicketTest {
	
	private static String movieTitle = "Parasite";
	private static String movieDes = "The members of a poor family scheme to become employed by a wealthy family by "
			+ "infiltrating their household and posing as unrelated, highly qualified individuals.";
	private static String movieRating = "5";
	private static String movieCast = "Song Kang-ho, Lee Sun-kyun, Cho Yeo-jeong, Choi Woo-shik, Park So-dam, Jang Hye-jin, and Lee Jung-eun";
	private static String movieDirector = "Bong Joon-ho";
	private static Movie parasite = new Movie(movieTitle, movieDes, movieRating, movieDirector, movieCast);
	
	private static String time = "21:00";
	private static int row = 13;
	private static int seat = 18;
	
	public static void main(String[] args) {
		Ticket parasiteTicket = new Ticket(parasite, time, row, seat);
		parasiteTicket.getEvent();
		parasiteTicket.getTime();
		parasiteTicket.printTicket(1);
		parasiteTicket.viewTicket();
	}
	
}