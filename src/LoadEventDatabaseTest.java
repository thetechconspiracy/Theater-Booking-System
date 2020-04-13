/*
 * Written by Something Creative
 * Description
 */
import java.io.File;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LoadEventDatabaseTest {
  @Test
  public void testLoadDatabase(){

    //https://www.inf.unibz.it/~calvanese/teaching/06-07-ip/lecture-notes/uni09/node12.html
    //https://alvinalexander.com/java/java-file-exists-directory-exists/

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
