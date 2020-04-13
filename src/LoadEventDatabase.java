/**
 * Written by Something Creative
 * Description
 */

//https://www.geeksforgeeks.org/parse-json-java/

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.InvalidObjectException;
import java.util.ArrayList;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
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
      JSONArray eventsJSON = (JSONArray)parser.parse(reader);
      //JSONArray eventsJSON = new JSONArray();
      //eventsJSON.add(parser.parse(reader));

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
            Movie movie = new Movie(title, des, rating, director, cast);
            events.add(movie);
            break;
          case "play":
            String playwright = (String)eventJSON.get("playwright");
            Play play = new Play(title, des, rating, playwright, cast);
            events.add(play);
            break;
          case "concert":
            Concert concert = new Concert(title, des, rating, cast);
            events.add(concert);
            break;
          default:
            //Type is invalid.  Panic.
            throw new InvalidObjectException("Invalid type");
        }
      }
      reader.close();
    }catch(Exception e){
      System.err.println("File \"database/Events.json\" not found!");
      return null;
    }
    return events;
  }
}
