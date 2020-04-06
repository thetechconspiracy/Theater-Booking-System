/*
 * Written by Something Creative
 * Description
 */

//https://www.geeksforgeeks.org/parse-json-java/

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.InvalidObjectException;
import java.lang.reflect.Array;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
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
    ArrayList<Show> shows = new ArrayList<>();

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
        long id = (long)eventJSON.get("id");
        int idInt = (int)id;
        switch(type){
          case "movie":
            String director = (String)eventJSON.get("director");
            Movie movie = new Movie(title, des, rating, director, cast, idInt);
            events.add(movie);
            break;
          case "play":
            String playwright = (String)eventJSON.get("playwright");
            Play play = new Play(title, des, rating, playwright, cast, idInt);
            events.add(play);
            break;
          case "concert":
            Concert concert = new Concert(title, des, rating, cast, idInt);
            events.add(concert);
            break;
          default:
            //Type is invalid.  Panic.
            throw new InvalidObjectException("Invalid type");
        }
      }
    }catch(Exception e){
      e.printStackTrace();
    }
    ArrayList<Venue> venues = LoadVenueDatabase.loadDatabase();
    try{
      FileReader reader = new FileReader("database/Shows.json");
      JSONParser parser = new JSONParser();
      JSONArray showsJSON = (JSONArray)parser.parse(reader);

      for(int i = 0; i < showsJSON.size(); ++i){
        boolean isMovie = false;
        JSONObject showJSON = (JSONObject)showsJSON.get(i);
        long idLong = (long)showJSON.get("id");
        int id = (int)idLong;
        String type = (String)showJSON.get("type");
        long venue = (long) showJSON.get("venue");
        int theater = -1;
        if(type.equals("movie")){
          theater = (int)(long) showJSON.get("theater");
          isMovie = true;
        }

        String timeString = (String) showJSON.get("time");

        //https://www.java67.com/2016/04/how-to-convert-string-to-localdatetime-in-java8-example.html
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        LocalDateTime showTime = LocalDateTime.parse(timeString, formatter);

        Show show = new Show(null, null);//Do this so it compiles
        boolean found = false;
        MovieTheater movieTheater = new MovieTheater(null, null, null, 0,0);
        //Match venue ID to venue
        for(Venue venueReal : venues){
          long venueID = venueReal.getLocation();
          if(venueID == id){
            show = new Show(showTime, venueReal);
            if(isMovie)
              movieTheater = (MovieTheater)venueReal;

            found = true;
          }
        }

        if(!found){
          //No venue found
          continue;
        }

        //We have a valid show
        if(isMovie){
          for(Theater theaters : movieTheater.getTheaters()){
            if(theaters.getAddress().equals(Integer.toString(theater))){
               show.setTheater(theaters);
               break;
            }
          }
        }

        shows.add(show);
      }
    }catch(Exception e){
      e.printStackTrace();
    }
    return events;
  }
}
