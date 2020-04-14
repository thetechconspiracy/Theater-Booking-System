import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import java.util.*;

class PlayTest {

	@Test
	public void testType() {
		String playTitle = "Adler";
		String playDes = "The Grim Reaper's apprentice falls in love with a girl whom he was to escort to the afterlife"
				+ " and must now defend her from the agents of death.";
		String playRating = "3";
		String[] playTimes = {"18:00 on Friday", "19:00 on Saturday"};
		String playwright = "Terry Pratchett";
		String[] cast = {"Louis, Aoba, Bill, Pina, Els, Tao, Zoe, Ellen"};
		SeatingChart seatingChart = new SeatingChart(30, 40);
		Play adler = new Play(playTitle, playDes, playRating, playTimes, playwright, cast, seatingChart);
		assertEquals("play", adler.getType());
	}
	
	@Test
	public void testTitle() {
		String playTitle = "Adler";
		String playDes = "The Grim Reaper's apprentice falls in love with a girl whom he was to escort to the afterlife"
				+ " and must now defend her from the agents of death.";
		String playRating = "3";
		String[] playTimes = {"18:00 on Friday", "19:00 on Saturday"};
		String playwright = "Terry Pratchett";
		String[] cast = {"Louis, Aoba, Bill, Pina, Els, Tao, Zoe, Ellen"};
		SeatingChart seatingChart = new SeatingChart(30, 40);
		Play adler = new Play(playTitle, playDes, playRating, playTimes, playwright, cast, seatingChart);
		adler.printEvent();
		assertEquals("Adler", adler.getTitle());
	}
	
	@Test
	public void testRating() {
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
		assertEquals("3", adler.getRating());
	}
	
	@Test
	public void testDesc() {
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
		assertEquals("The Grim Reaper's apprentice falls in love with a girl whom he was to escort to the afterlife"
				+ " and must now defend her from the agents of death.", adler.getDes());
	}
	
	@Test
	public void testSeatingChart() {
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
		assertEquals(seatingChart, adler.getSeatingChart());
	}
	
	@Test
	public void testTimes() {
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
		assertEquals(playTimes, adler.getTimes());
	}
	
	@Test
	public void testReviews() {
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
		ArrayList<Review> reviews = new ArrayList<>();
		Review review = new Review("Test1", "Test2", 4);
		reviews.add(review);
		adler.addReview(review);
		adler.printReviews();
		assertEquals(reviews, adler.getReviews());
	}

}
