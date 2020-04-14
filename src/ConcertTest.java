import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import java.util.*;

class ConcertTest {
	
	@Test
	public void testType() {
		String title = "The Strokes Live in New Orleans, LA";
		String des = "In Saenger Theatre at 1111 Canal St., New Orleans at 19:30 on 2020-05-07";
		String rating = "4";
		String band = "The Strokes";
		String times[] = {"19:30"};
		SeatingChart seatingChart = new SeatingChart(50, 50);
		
		Concert concert = new Concert(title, des, rating, band, times, seatingChart);
		concert.printEvent();
		assertEquals("concert", concert.getType());
	}
	
	@Test
	public void testTimes() {
		String title = "The Strokes Live in New Orleans, LA";
		String des = "In Saenger Theatre at 1111 Canal St., New Orleans at 19:30 on 2020-05-07";
		String rating = "4";
		String band = "The Strokes";
		String times[] = {"19:30"};
		SeatingChart seatingChart = new SeatingChart(50, 50);
		
		Concert concert = new Concert(title, des, rating, band, times, seatingChart);
		assertArrayEquals(times, concert.getTimes());
	}
	
	@Test
	public void testTitle() {
		String title = "The Strokes Live in New Orleans, LA";
		String des = "In Saenger Theatre at 1111 Canal St., New Orleans at 19:30 on 2020-05-07";
		String rating = "4";
		String band = "The Strokes";
		String times[] = {"19:30"};
		SeatingChart seatingChart = new SeatingChart(50, 50);
		
		Concert concert = new Concert(title, des, rating, band, times, seatingChart);
		assertEquals("The Strokes Live in New Orleans, LA", concert.getTitle());
	}
	
	@Test
	public void testDes() {
		String title = "The Strokes Live in New Orleans, LA";
		String des = "In Saenger Theatre at 1111 Canal St., New Orleans at 19:30 on 2020-05-07";
		String rating = "4";
		String band = "The Strokes";
		String times[] = {"19:30"};
		SeatingChart seatingChart = new SeatingChart(50, 50);
		
		Concert concert = new Concert(title, des, rating, band, times, seatingChart);
		assertEquals("In Saenger Theatre at 1111 Canal St., New Orleans at 19:30 on 2020-05-07", concert.getDes());
	}
	
	@Test
	public void testBand() {
		String title = "The Strokes Live in New Orleans, LA";
		String des = "In Saenger Theatre at 1111 Canal St., New Orleans at 19:30 on 2020-05-07";
		String rating = "4";
		String band = "The Strokes";
		String times[] = {"19:30"};
		SeatingChart seatingChart = new SeatingChart(50, 50);
		
		Concert concert = new Concert(title, des, rating, band, times, seatingChart);
		assertEquals("The Strokes", concert.getBand());
	}
	
	@Test
	public void testSeatingChart() {
		String title = "The Strokes Live in New Orleans, LA";
		String des = "In Saenger Theatre at 1111 Canal St., New Orleans at 19:30 on 2020-05-07";
		String rating = "4";
		String band = "The Strokes";
		String times[] = {"19:30"};
		SeatingChart seatingChart = new SeatingChart(50, 50);
		
		Concert concert = new Concert(title, des, rating, band, times, seatingChart);
		assertEquals(seatingChart, concert.getSeatingChart());
	}
	
	@Test
	public void testRating() {
		String title = "The Strokes Live in New Orleans, LA";
		String des = "In Saenger Theatre at 1111 Canal St., New Orleans at 19:30 on 2020-05-07";
		String rating = "4";
		String band = "The Strokes";
		String times[] = {"19:30"};
		SeatingChart seatingChart = new SeatingChart(50, 50);
		
		Concert concert = new Concert(title, des, rating, band, times, seatingChart);
		assertEquals(rating, concert.getRating());
	}
	
	@Test
	public void testReviews() {
		String title = "The Strokes Live in New Orleans, LA";
		String des = "In Saenger Theatre at 1111 Canal St., New Orleans at 19:30 on 2020-05-07";
		String rating = "4";
		String band = "The Strokes";
		String times[] = {"19:30"};
		SeatingChart seatingChart = new SeatingChart(50, 50);
		
		Concert concert = new Concert(title, des, rating, band, times, seatingChart);
		
		Review review = new Review("Test1", "Test2", 3);
		
		ArrayList<Review> reviews = new ArrayList<>();
		reviews.add(review);
		concert.addReview(review);
		concert.printReviews();
		assertEquals(reviews, concert.getReviews());
	}
	

}
