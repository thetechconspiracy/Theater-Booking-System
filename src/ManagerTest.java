import static org.junit.jupiter.api.Assertions.*;

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

}
