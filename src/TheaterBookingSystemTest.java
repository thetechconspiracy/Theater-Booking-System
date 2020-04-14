import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class TheaterBookingSystemTest {

	@Test
	public void testUserArray() {
		Consumer consumer = new Consumer("Brian Remer", "beremer", "12345");
		Manager manager = new Manager("Bob Jones", "bjones", "67890");
		User[] ret = new User[100];
		ret[0] = consumer;
		ret[1] = manager;
		TheaterBookingSystem theaterBookingSystem = new TheaterBookingSystem();
		User[] users = theaterBookingSystem.userArray();
		assertEquals(ret[0].getName(), users[0].getName());
	}
	
	@Test
	public void testManagerOptions() {
		System.out.println("Testing Manager Options");
		TheaterBookingSystem theaterBookingSystem = new TheaterBookingSystem();
		Manager manager = new Manager("Bob Jones", "bjones", "67890");
		ArrayList<Event> events = LoadEventDatabase.loadDatabase();
	    Theater theater = new Theater("Test 1", events);
		assertTrue(theaterBookingSystem.managerOptions(manager, theater));
	}
	
	@Test
	public void testConsumerOptions() {
		System.out.println("Test Consumer Options");
		TheaterBookingSystem theaterBookingSystem = new TheaterBookingSystem();
		Consumer consumer = new Consumer("Brian Remer", "beremer", "12345");
		ArrayList<Event> events = LoadEventDatabase.loadDatabase();
	    Theater theater = new Theater("Test 1", events);
		assertTrue(theaterBookingSystem.consumerOptions(consumer, theater));
	}
	
	@Test
	public void testGuestOptions() {
		System.out.println("Testing Guest Options");
		TheaterBookingSystem theaterBookingSystem = new TheaterBookingSystem();
		Guest guest = new Guest();
		ArrayList<Event> events = LoadEventDatabase.loadDatabase();
	    Theater theater = new Theater("Test 1", events);
		assertTrue(theaterBookingSystem.guestOptions(guest, theater));
	}
	
	@Test
	public void testSuccessfulLogin() {
		System.out.println("Testing a Successful Login");
		TheaterBookingSystem theaterBookingSystem = new TheaterBookingSystem();
		ArrayList<Event> events = LoadEventDatabase.loadDatabase();
	    Theater theater = new Theater("Test 1", events);
	    Consumer consumer = new Consumer("Brian Remer", "beremer", "12345");
		Manager manager = new Manager("Bob Jones", "bjones", "67890");
		User[] ret = new User[100];
		ret[0] = consumer;
		ret[1] = manager;
		assertTrue(theaterBookingSystem.login(ret, theater));
	}
	
	@Test
	public void testFailedLogin() {
		System.out.println("Testing a failed login");
		TheaterBookingSystem theaterBookingSystem = new TheaterBookingSystem();
		ArrayList<Event> events = LoadEventDatabase.loadDatabase();
	    Theater theater = new Theater("Test 1", events);
	    Consumer consumer = new Consumer("Brian Remer", "beremer", "12345");
		Manager manager = new Manager("Bob Jones", "bjones", "67890");
		User[] ret = new User[100];
		ret[0] = consumer;
		ret[1] = manager;
		assertFalse(theaterBookingSystem.login(ret, theater));
	}

}
