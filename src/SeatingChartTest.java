public class SeatingChartTest {
	
	private static String title = "Parasite";
	private static String des = "The members of a poor family scheme to become employed by a wealthy family by "
			+ "infiltrating their household and posing as unrelated, highly qualified individuals.";
	private static String rating = "5";
	private static String cast = "Song Kang-ho, Lee Sun-kyun, Cho Yeo-jeong, Choi Woo-shik, Park So-dam, Jang Hye-jin, and Lee Jung-eun";
	private static String director = "Bong Joon-ho";
	
	public static void main(String[] args) {
		System.out.println("SeatingChart test: testing potential worst case scenario\n"
				+ "-------------------------------------");
		testWorstCase();
		System.out.println("\n----------------------------------"
				+ "\nTesting potential average case scenario\n"
				+ "-------------------------------------------");
		testAverageCase();
		System.out.println("Finished testing SeatingChart.");
	}
	
	private static void testWorstCase() {
		SeatingChart seatingChart = new SeatingChart(-5, -3);
		seatingChart.printChart();
		Movie parasite = new Movie(title, des, rating, director, cast);
		seatingChart.seatStatus(parasite, "21:00");
	}
	
	private static void testAverageCase() {
		SeatingChart seatingChart = new SeatingChart(15, 25);
		seatingChart.printChart();
		Movie parasite = new Movie(title, des, rating, director, cast);
		seatingChart.seatStatus(parasite, "21:00");
	}
	
}