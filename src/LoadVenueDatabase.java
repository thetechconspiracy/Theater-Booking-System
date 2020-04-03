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
    ArrayList<MovieTheater> movieTheaters = new ArrayList<>();
    try{
      FileReader reader = new FileReader("database/Venue.json");
      JSONParser parser = new JSONParser();
      JSONArray venuesJSON = (JSONArray)parser.parse(reader);

      for(int i = 0; i < venuesJSON.size(); ++i){
        JSONObject venueJSON = (JSONObject)venuesJSON.get(i);
        //If a Theater in a Movie theater, push to a stack.  They will be handled later
        if(((String)venueJSON.get("type")).equals("movieChild")) {
          String type = (String)venueJSON.get("type");
          long numberLong = (long)venueJSON.get("number");
          long parent = (long)venueJSON.get("parent");
          String seating = (String)venueJSON.get("seating");
          String tier5 = (String)venueJSON.get("tier5");
          String tier4 = (String)venueJSON.get("tier4");
          String tier3 = (String)venueJSON.get("tier3");
          String tier2 = (String)venueJSON.get("tier2");

          String number = Long.toString(numberLong);

          childTheaters.push(new Theater(number, seating, parent, tier2, tier3, tier4, tier5));

          continue;
        }
        String type = (String)venueJSON.get("type");
        String address = (String)venueJSON.get("address");
        String name = (String)venueJSON.get("name");
        String restaurant = (String)venueJSON.get("restaurant");
        long location = (long)venueJSON.get("location");//ID
        switch(type){
          case "movieTheater":
            long theaters = (long)venueJSON.get("theaters");
            long child = (long)venueJSON.get("child");
            movieTheaters.add(new MovieTheater(name, address, restaurant, child, location));
            break;
          case "theater":
            String seating = (String)venueJSON.get("seating");
            String tier5 = (String)venueJSON.get("tier5");
            String tier4 = (String)venueJSON.get("tier4");
            String tier3 = (String)venueJSON.get("tier3");
            String tier2 = (String)venueJSON.get("tier2");

            venues.add(new Theater(name, address, seating, restaurant, tier2, tier3, tier4, tier5, location));
            break;
          case "stage":
            venues.add(new Stage(name, address, restaurant, location));
            break;
        }

        while(!childTheaters.empty()){
          Theater child = childTheaters.pop();
          if(child == null)
            break;
          //Find parent
          for(MovieTheater theater : movieTheaters){
            long id = theater.getChildID();
            if (id == child.getParent()) {
              if(child == null)
                break;
              theater.addTheater(child);
              break;
            }
          }
        }

        //Finally, add the movie theaters to the venues AL
        for(MovieTheater theater : movieTheaters){
          venues.add(theater);
        }
      }




      return venues;

    }catch(Exception e){
      e.printStackTrace();
    }

    return venues;
  }
}
