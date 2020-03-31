/*
 * Written by Something Creative
 * Description
 */

//https://www.geeksforgeeks.org/parse-json-java/

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.InvalidObjectException;
import java.util.ArrayList;
import org.json.simple.*;
import org.json.simple.parser.JSONParser;


public class LoadEventDatabase {

  /**
   * Loads the event database (database/Events.json)
   * @return ArrayList of the Events
   */
  public static ArrayList<Event> loadDatabase(){
    ArrayList<Event> events = new ArrayList<>();

    try{
      FileReader reader = new FileReader("database/Events.json");
      JSONParser parser = new JSONParser();
      JSONArray eventsJSON = (JSONArray)new JSONParser().parse(reader);

      for(int i = 0; i < eventsJSON.size(); i++){
        JSONObject eventJSON = (JSONObject)eventsJSON.get(i);
        String type = (String)eventJSON.get("type");
        String title = (String)eventJSON.get("title");
        String des = (String)eventJSON.get("des");
        String rating = (String)eventJSON.get("rating");
        String cast = (String)eventJSON.get("cast");
        switch(type){
          case "movie":
            String director = (String)eventJSON.get("director");
            //TODO: Export to movie
            break;
          case "play":
            String playwright = (String)eventJSON.get("playwright");
            //TODO: Export to play
            break;
          case "concert":
            //TODO: Export to concert
            break;
          default:
            //Type is invalid.  Panic.
            throw new InvalidObjectException("Invalid type");
        }
      }
    }catch(Exception e){
      e.printStackTrace();
    }
    return events;
  }
}
