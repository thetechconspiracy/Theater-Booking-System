/*
 * Written by Something Creative
 * Description
 */
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class GuestTest {
  //Most of the Guest class is simply UI elements and interactions

  @Test
  public void testGetType(){
    Guest guest = new Guest();
    assertEquals("Guest", guest.getType());
  }

  @Test
  public void testGetName(){
    Guest guest = new Guest();
    assertEquals("Guest", guest.getName());
  }

  @Test
  public void testGetUserName(){
    Guest guest = new Guest();
    assertEquals("Guest", guest.getUserName());
  }

  @Test
  public void testGetPassword(){
    Guest guest = new Guest();
    assertNull(guest.getPassword());
  }
}
