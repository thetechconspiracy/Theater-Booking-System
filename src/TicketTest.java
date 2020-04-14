import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TicketTest {
	
	@Test
	public void testEvent() {
		Movie movie = new Movie("Test1", "Test2", "R", "Test3", "Test4");
		
		Ticket ticket = new Ticket(movie, "4:00", 1, 1);
		ticket.setEvent(movie);
		ticket.viewTicket();
		assertEquals(movie, ticket.getEvent());
	}
	
	@Test
	public void testTime() {
		Movie movie = new Movie("Test1", "Test2", "R", "Test3", "Test4");
		
		Ticket ticket = new Ticket(movie, "4:00", 1, 1);
		ticket.setTime("4:00");
		ticket.printTicket(1);
		assertEquals("4:00", ticket.getTime());
	}
	

}
