/*
 * Written by Something Creative
 * Description
 */
import java.io.File;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LoadEventDatabaseTest {
  @Test
  public void TestLoadDatabase(){
    File original = new File("database/Events.json");
    File newName = new File("database/Events.json.bak");
    assertTrue(original.exists());
    //Make sure the backup doesn't exist
    assertFalse(newName.exists());

    assertNotNull(LoadEventDatabase.loadDatabase());

    assertTrue(original.renameTo(newName));

    assertNull(LoadEventDatabase.loadDatabase());

    newName.renameTo(original);//Set name back to normal

  }
}
