/*
 * Written by Something Creative
 * Description
 */

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class WriteEventDatabase {
  public static void saveDatabase(ArrayList<Event> events){
    JSONArray JSONEvents = new JSONArray();

    for(Event event : events){
      JSONEvents.add(getEventJSON(event));
    }

    try{
      FileWriter file = new FileWriter("database/Events.json");
      file.write(JSONEvents.toJSONString());
      file.flush();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  private static JSONObject getEventJSON(Event event) {
    JSONObject eventDetails = new JSONObject();

    eventDetails.put("type", event.getType());
    eventDetails.put("title", event.getTitle());
    eventDetails.put("des", event.getDes());
    eventDetails.put("rating", event.getRating());
    eventDetails.put("cast", event.getCastString());

    switch(event.getType()){
      case "movie":
        ;
        break;
      case "play":
        ;
        break;
      case "concert":
        ;
        break;
    }

    return eventDetails;
  }
}
