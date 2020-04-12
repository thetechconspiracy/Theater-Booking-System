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
		assertEquals(events, movieTheater.getTheaters());
	}
	
	@Test
	public void checkEventArray() {
		MovieTheater movieTheater = new MovieTheater("Test1", "123 Road", "Chili's", 1, 1);
		ArrayList<Event> events = new ArrayList<>();
		movieTheater.setEvents(events);
		assertEquals(events, movieTheater.getEvents());
	}
	
	

}
