/*
 * Written by Something Creative
 * Description
 */
import java.io.File;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SaveEventDatabaseTest {
  @Test
  public void testSaveDatabase(){

    //https://www.inf.unibz.it/~calvanese/teaching/06-07-ip/lecture-notes/uni09/node12.html
    //https://alvinalexander.com/java/java-file-exists-directory-exists/
    File original = new File("database/Events.json");
    File newName = new File("database/Events.json.bak");

    ArrayList<Event> events = new ArrayList<>();
    events = LoadEventDatabase.loadDatabase();

    //Ensure rename was successful
    assertTrue(original.renameTo(newName));

    //Make sure original does not exist
    assertFalse(original.exists());

    SaveEventDatabase.saveDatabase(events);

    //Ensure a file was created
    assertTrue(original.exists());

    //Delete the old file
    newName.delete();
  }
}
