public class StageTest {
	
	private static String name = "Merriweather Post Pavilion";
	private static String address = "10475 Little Patuxent Pkwy, Columbia, MD 21044";
	private static String restaurants = "Stanford Grill";
	private static long location = 21044;
	
	private static String reviewTitle = "";
	private static String reviewContents = "";
	private static int reviewRating = 4;
	
	public static void main(String[] args) {
		System.out.println("Testing Stage.\nCreating a new Stage called merriweather.");
		Stage merriweather = new Stage(name, address, restaurants, location);
		Review merriweatherReview = new Review(reviewTitle, reviewContents, reviewRating);
		System.out.println("Adding a review to merriweather.");
		merriweather.addReview(merriweatherReview);
		System.out.println("Adding another restaurant to merriweather.");
		merriweather.addRestaurant("Tino's Italian Bistro");
		merriweather.getRestaurants();
		System.out.println("Finished testing Stage.");
	}
	
}