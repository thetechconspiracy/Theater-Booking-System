/*
 * Written by Something Creative
 * Description
 */

import java.util.ArrayList;

public class Main {
  public static void main(String[] args){
    ArrayList<Event> events = LoadEventDatabase.loadDatabase();


    for(Event event : events){
      System.out.println(event);
    }

    SaveEventDatabase.saveDatabase(events);

    ArrayList<Venue> venues = LoadVenueDatabase.loadDatabase();

    for(Venue venue : venues){
      if(venue.getType().equals("movieChild") || venue.getType().equals("theater")){
        Theater theater = (Theater)venue;
        theater.printSeatingChart();
        System.exit(0);
      }

    }
  }
}
