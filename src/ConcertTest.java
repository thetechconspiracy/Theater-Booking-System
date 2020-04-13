public class ConcertTest {
	
	String titleEmpty = "";
	String titleSpace = " ";
	String title = "The Strokes Live in New Orleans, LA";
	
	String desEmpty = "";
	String desSpace = " ";
	String des = "In Saenger Theatre at 1111 Canal St., New Orleans at 19:30 on 2020-05-07";
	
	String ratingEmpty = "";
	String ratingSpace = " ";
	String ratingLetter = "t";
	String rating = "4";
	String ratingTooLow = "-1";
	String ratingTooHigh = "7";
	
	String band = "The Strokes";
	
	String timesEmpty[] = {};
	String timesBlank[] = {""};
	String times[] = {"19:30"};
	
	SeatingChart seatingChartNoSeats = new SeatingChart(0, 0);
	SeatingChart seatingChart = new SeatingChart(50, 50);
	
	public void main(String[] args) {
		System.out.println("Concert test: testing potential worst case scenario\n-----------------------------------");
		testWorstCase1();
		System.out.println("-------------------------------------\n"
				+ "testing another potential worst case scenario\n"
				+ "---------------------------------------");
		testWorstCase2();
		System.out.println("-------------------------------------\n"
				+ "testing a usual scenario\n"
				+ "---------------------------------------");
		testUsualCase();
		System.out.println("Finished testing Concert.");
	}
	
	public void testWorstCase1() {
		Concert concertWorstCase = new Concert(titleEmpty, desEmpty, ratingEmpty, band, timesEmpty, seatingChartNoSeats);
		
		concertWorstCase.printEvent();
		
		String reviewTitle = "Amazing concert";
		String reviewContents = "Very fun, great music, great performance";
		int reviewRating = -2;
		Review review = new Review(reviewTitle, reviewContents, reviewRating);
		concertWorstCase.addReview(review);
		
		concertWorstCase.printReviews();
	}
	
	public void testWorstCase2() {
		Concert concertWorstCase = new Concert(titleSpace, desSpace, ratingLetter, band, timesBlank, seatingChartNoSeats);
		
		concertWorstCase.printEvent();
		
		String reviewTitle = "Amazing concert";
		String reviewContents = "Very fun, great music, great performance";
		int reviewRating = 7;
		Review review = new Review(reviewTitle, reviewContents, reviewRating);
		concertWorstCase.addReview(review);
		
		concertWorstCase.printReviews();
	}
	
	public void testUsualCase() {
		Concert concertWorstCase = new Concert(title, des, rating, band, times, seatingChart);
		
		concertWorstCase.printEvent();
		
		String reviewTitle = "Amazing concert";
		String reviewContents = "Very fun, great music, great performance";
		int reviewRating = 4;
		Review review = new Review(reviewTitle, reviewContents, reviewRating);
		concertWorstCase.addReview(review);
		
		concertWorstCase.printReviews();
	}
	
}