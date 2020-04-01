/*
 * Written by Something Creative
 * Description
 */

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class SaveEventDatabase {
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

    //Handle special cases
    switch(event.getType()){
      case "movie":
        Movie movie = (Movie) event;
        eventDetails.put("director", movie.getDirectorString());
        break;
      case "play":
        Play play = (Play) event;
        eventDetails.put("playwright", play.getPlaywrightString());
        break;
      case "concert":
        //If any special tags are put in concert, they will be handled here
        break;
    }

    return eventDetails;
  }
}
