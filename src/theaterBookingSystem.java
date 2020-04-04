import java.util.*;

public class theaterBookingSystem {
	
	public void run() {
		ArrayList<Event> events = LoadEventDatabase.loadDatabase();


	    for(Event event : events){
	      System.out.println(event);
	    }

	    SaveEventDatabase.saveDatabase(events);

	    ArrayList<Venue> venues = LoadVenueDatabase.loadDatabase();

	    for(Venue venue : venues){
	      if(venue.getType().equals("movieTheater")){
	        MovieTheater movie = (MovieTheater)venue;
	        ArrayList<Theater> children= movie.getTheaters();

	        for(Theater theater : children)
	          theater.printSeatingChart();
	        System.exit(0);
	      }

	    }
		
	}

}
