import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import java.util.*;

class MovieTheaterTest {

	@Test
	public void checkName() {
		MovieTheater movieTheater = new MovieTheater("Test1", "123 Road", "Chili's", 1, 1);
		assertEquals("Test1", movieTheater.getName());
	}
	
	@Test
	public void checkAddress() {
		MovieTheater movieTheater = new MovieTheater("Test1", "123 Road", "Chili's", 1, 1);
		assertEquals("123 Road", movieTheater.getAddress());
	}
	
	@Test
	public void checkRestaurant() {
		MovieTheater movieTheater = new MovieTheater("Test1", "123 Road", "Chili's", 1, 1);
		assertEquals("Chili's", movieTheater.getRestaurants());
	}
	
	@Test
	public void checkTheaterArray() {
		MovieTheater movieTheater = new MovieTheater("Test1", "123 Road", "Chili's", 1, 1);
		ArrayList<Event> events = new ArrayList<>();
		Theater theater = new Theater("Theater1", events);
		movieTheater.addTheater(theater);
		ArrayList<Theater> theaters = new ArrayList<>();
		theaters.add(theater);
		assertEquals(theaters, movieTheater.getTheaters());
	}
	
	@Test
	public void checkEventArray() {
		MovieTheater movieTheater = new MovieTheater("Test1", "123 Road", "Chili's", 1, 1);
		ArrayList<Event> events = new ArrayList<>();
		movieTheater.setEvents(events);
		assertEquals(events, movieTheater.getEvents());
	}
	
	@Test
	public void checkAddEvent() {
		MovieTheater movieTheater = new MovieTheater("Test1", "123 Road", "Chili's", 1, 1);
		ArrayList<Event> events = new ArrayList<>();
		movieTheater.setEvents(events);
		Movie movie = new Movie("Test1", "Test2", "Test3", "Test4", "Test5");
		movieTheater.addEvent(movie);
		events.add(movie);
		assertEquals(events, movieTheater.getEvents());
	}
	
	@Test
	public void checkGetReviews() {
		MovieTheater movieTheater = new MovieTheater("Test1", "123 Road", "Chili's", 1, 1);
		ArrayList<Review> reviews = new ArrayList<>();
		Review review = new Review("Test1", "Test2", 4);
		movieTheater.addReview(review);
		reviews.add(review);
		assertEquals(reviews, movieTheater.getReviews());
	}
	
	@Test
	public void checkGetType() {
		MovieTheater movieTheater = new MovieTheater("Test1", "123 Road", "Chili's", 1, 1);
		assertEquals("movieTheater", movieTheater.getType());
	}
	
	

}
