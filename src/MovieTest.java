import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class MovieTest {
	
	@Test
	public void testTimes() {
		String[] test1 = {"1", "2", "3"};
		SeatingChart seatingChart = new SeatingChart(10, 10);
		Movie movie = new Movie("movie", "moviedes", "movierating", test1, seatingChart);
		String[] test2 = movie.getTimes();
		assertArrayEquals(test1, test2);
	}
	
	@Test
	public void testTitle() {
		String[] test1 = {"1", "2", "3"};
		SeatingChart seatingChart = new SeatingChart(10, 10);
		Movie movie = new Movie("movie", "moviedes", "movierating", test1, seatingChart);
		assertEquals("movie", movie.getTitle());
	}
	
	@Test
	public void testDes() {
		String[] test1 = {"1", "2", "3"};
		SeatingChart seatingChart = new SeatingChart(10, 10);
		Movie movie = new Movie("movie", "moviedes", "movierating", test1, seatingChart);
		assertEquals("moviedes", movie.getDes());
	}
	
	@Test
	public void testRating() {
		String[] test1 = {"1", "2", "3"};
		SeatingChart seatingChart = new SeatingChart(10, 10);
		Movie movie = new Movie("movie", "moviedes", "movierating", test1, seatingChart);
		assertEquals("movierating", movie.getRating());
	}
	
}