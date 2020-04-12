public class ConcertTest {
	
	public static void main(String[] args) {
		
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
		
		SeatingChart seatingChart = new SeatingChart;
		
		Concert concert = new Concert(titleEmpty, desEmpty, ratingEmpty, band, timesEmpty, seatingChart);
		
	}
	
}