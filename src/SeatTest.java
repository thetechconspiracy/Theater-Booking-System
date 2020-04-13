/*
 * Written by Something Creative
 * Description
 */
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SeatTest {
  @Test
  public void testToString(){
    Seat seat = new Seat(5);
    assertEquals("5", seat.toString());
    //Test invalid tier
    Seat seatError = new Seat(99);
    assertEquals("H", seatError.toString());
    //Test occupied
    Seat seatOccupied = new Seat(3);
    assertEquals("3", seatOccupied.toString());
    seatOccupied.setOccupied(true);
    assertEquals("0", seatOccupied.toString());
  }

  @Test
  public void testOccupied(){
    Seat seat = new Seat(5);
    assertFalse(seat.isOccupied());
    seat.setOccupied(true);
    assertTrue(seat.isOccupied());
  }

}
