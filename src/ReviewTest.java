import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ReviewTest {

	@Test
	public void testSetReview() {
		String[] test1 = {"Test", "Test Description", "3"};
		Review review = new Review(test1);
		String[] test2 = review.getReview();
		assertArrayEquals(test1, test2);
	}

	@Test
	public void testTitle() {
		Review review = new Review("Test1", "Test2", 4);
		assertEquals("Test1", review.getTitle());
	}
	
	@Test
	public void testContents() {
		Review review = new Review("Test1", "Test2", 4);
		assertEquals("Test2", review.getContents());
	}
	
	@Test
	public void testRating() {
		Review review = new Review("Test1", "Test2", 4);
		review.printReview();
		assertEquals(4, review.getRating());
	}
}
