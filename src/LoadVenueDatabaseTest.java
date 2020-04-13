/*
 * Written by Something Creative
 * Description
 */

import java.io.File;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LoadVenueDatabaseTest {
  @Test
  public void TestLoadDatabase(){
    File original = new File("database/Venue.json");
    File newName = new File("database/Venue.json.bak");
    assertTrue(original.exists());
    //Make sure the backup doesn't exist
    assertFalse(newName.exists());

    assertNotNull(LoadVenueDatabase.loadDatabase());

    assertTrue(original.renameTo(newName));

    assertNull(LoadVenueDatabase.loadDatabase());

    newName.renameTo(original);//Set name back to normal

  }
}