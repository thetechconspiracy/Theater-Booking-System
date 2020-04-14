import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class ManagerTest {

	
	@Test
	public void testName() {
		Manager manager = new Manager("Bob", "bbob", "12345");
		assertEquals("Bob", manager.getName());
	}
	
	@Test
	public void testUserName() {
		Manager manager = new Manager("Bob", "bbob", "12345");
		assertEquals("bbob", manager.getUserName());
	}
	
	@Test
	public void testPassword() {
		Manager manager = new Manager("Bob", "bbob", "12345");
		assertEquals("12345", manager.getPassword());
	}
	
	@Test
	public void testSeatingChartRows() {
		Manager manager = new Manager("Bob", "bbob", "12345");
		SeatingChart seatingChart = manager.setSeatingChart(3, 3);
		assertEquals(seatingChart.getRows(), 3);
	}
	
	@Test
	public void testSeatingChartColumns() {
		Manager manager = new Manager("Bob", "bbob", "12345");
		SeatingChart seatingChart = manager.setSeatingChart(3, 3);
		assertEquals(seatingChart.getSeats(), 3);
	}
	
	@Test
	public void testType() {
		Manager manager = new Manager("Bob", "bbob", "12345");
		assertEquals("Manager", manager.getType());
	}
	
	@Test
	public void testShowTimes() {
		Manager manager = new Manager("Bob", "bbob", "12345");
		String[] test1 = manager.showTimes();
		String[] showTimes = {"4:00", "6:00"};
		assertArrayEquals(showTimes, test1);
	}
	
	@Test
	public void testRows() {
		Manager manager = new Manager("Bob", "bbob", "12345");
		int test1 = manager.rows();
		assertEquals(3, test1);
	}
	
	@Test
	public void testColumns() {
		Manager manager = new Manager("Bob", "bbob", "12345");
		int test2 = manager.seats();
		assertEquals(3, test2);
	}
	
	@Test
	public void testCast() {
		Manager manager = new Manager("Bob", "bbob", "12345");
		String[] test1 = manager.cast();
		String[] test2 = {"Bob"};
		assertArrayEquals(test1, test2);
	}
	
	@Test
	public void testAddEvent() {
		Manager manager = new Manager("Bob", "bbob", "12345");
		ArrayList<Event> events = new ArrayList<>();
		Theater theater = new Theater("Theater1", events);
		assertTrue(manager.addEvent(theater));
	}

}
