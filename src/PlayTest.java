public class PlayTest {
	
	public static void main (String[] args) {
		
		System.out.println("Creating new Play object for the Cherryton Academy Drama Club's annual play entitled 'Adler'.");
		String playTitle = "Adler";
		String playDes = "The Grim Reaper's apprentice falls in love with a girl whom he was to escort to the afterlife"
				+ " and must now defend her from the agents of death.";
		String playRating = "3";
		String[] playTimes = {"18:00 on Friday", "19:00 on Saturday"};
		String playwright = "Terry Pratchett";
		String[] cast = {"Louis, Aoba, Bill, Pina, Els, Tao, Zoe, Ellen"};
		SeatingChart seatingChart = new SeatingChart(30, 40);
		Play adler = new Play(playTitle, playDes, playRating, playTimes, playwright, cast, seatingChart);
		System.out.println("Event information:");
		adler.printEvent();
		System.out.println("Seating information:");
		adler.getSeatingChart();
		
	}
	
}