import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ConsumerTest {
		
		@Test
		public void testName() {
			String name = "Dave Grohl";
			String username = "degrohl";
			String password = "grohldave1969";
			Consumer daveGrohl = new Consumer(name, username, password);
			assertEquals("Dave Grohl", daveGrohl.getName());
		}
		
		@Test
		public void testUserName() {
			String name = "Dave Grohl";
			String username = "degrohl";
			String password = "grohldave1969";
			Consumer daveGrohl = new Consumer(name, username, password);
			assertEquals("degrohl", daveGrohl.getUserName());
		}
		
		@Test
		public void testPassword() {
			String name = "Dave Grohl";
			String username = "degrohl";
			String password = "grohldave1969";
			Consumer daveGrohl = new Consumer(name, username, password);
			assertEquals("grohldave1969", daveGrohl.getPassword());
		}
		
		@Test
		public void testType() {
			String name = "Dave Grohl";
			String username = "degrohl";
			String password = "grohldave1969";
			Consumer daveGrohl = new Consumer(name, username, password);
			assertEquals("Consumer", daveGrohl.getType());
		}
		
		@Test
		public void testButTicket() {
			String name = "Dave Grohl";
			String username = "degrohl";
			String password = "grohldave1969";
			Consumer daveGrohl = new Consumer(name, username, password);
			
			String movieTitle = "Parasite";
			String movieDes = "The members of a poor family scheme to become employed by a wealthy family by "
					+ "infiltrating their household and posing as unrelated, highly qualified individuals.";
			String movieRating = "5";
			String movieCast = "Song Kang-ho, Lee Sun-kyun, Cho Yeo-jeong, Choi Woo-shik, Park So-dam, Jang Hye-jin, and Lee Jung-eun";
			String movieDirector = "Bong Joon-ho";
			Movie parasite = new Movie(movieTitle, movieDes, movieRating, movieDirector, movieCast);
			assertTrue(daveGrohl.buyTicket(parasite));
			
		}
		
		@Test
		public void testRateMovie() {
			String name = "Dave Grohl";
			String username = "degrohl";
			String password = "grohldave1969";
			Consumer daveGrohl = new Consumer(name, username, password);
			
			String movieTitle = "Parasite";
			String movieDes = "The members of a poor family scheme to become employed by a wealthy family by "
					+ "infiltrating their household and posing as unrelated, highly qualified individuals.";
			String movieRating = "5";
			String movieCast = "Song Kang-ho, Lee Sun-kyun, Cho Yeo-jeong, Choi Woo-shik, Park So-dam, Jang Hye-jin, and Lee Jung-eun";
			String movieDirector = "Bong Joon-ho";
			Movie parasite = new Movie(movieTitle, movieDes, movieRating, movieDirector, movieCast);
			assertTrue(daveGrohl.rateMovie(parasite));
		}

}
