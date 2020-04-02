/*
 * Written by Something Creative
 * Description
 */

import java.io.FileReader;
import java.util.ArrayList;
import java.util.Stack;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class LoadVenueDatabase {
  public static ArrayList<Venue> loadDatabase(){
    ArrayList<Venue> venues = new ArrayList<>();
    Stack<Theater> childTheaters = new Stack<>();

    try{
      FileReader reader = new FileReader("database/Venue.json");
      JSONParser parser = new JSONParser();
      JSONArray venuesJSON = (JSONArray)parser.parse(reader);

      for(int i = 0; i < venuesJSON.size(); ++i){
        JSONObject venueJSON = (JSONObject)venuesJSON.get(i);
        //If a Theater in a Movie theater, push to a stack.  They will be handled later
        if(((String)venueJSON.get("type")).equals("movieChild")) {
          String type = (String)venueJSON.get("type");
          int number = (int)venueJSON.get("number");
          int parent = (int)venueJSON.get("parent");
          String seating = (String)venueJSON.get("seating");
          String tier5 = (String)venueJSON.get("tier5");
          String tier4 = (String)venueJSON.get("tier4");
          String tier3 = (String)venueJSON.get("tier3");
          String tier2 = (String)venueJSON.get("tier2");



          continue;
        }
        String type = (String)venueJSON.get("type");
        String name = (String)venueJSON.get("name");
        String restaurant = (String)venueJSON.get("restaurant");

      }

    }catch(Exception e){
      e.printStackTrace();
    }

    return venues;
  }
}
