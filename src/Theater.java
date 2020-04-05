/*
 * Written by Something Creative
 * Description
 */

import java.util.ArrayList;

public class Theater implements Venue {
  private String address;
  private Seat[][] seats;
  private ArrayList<Event> events;
  private ArrayList<Review> reviews;
  private String restaurants;
  private String name;
  private long location;

  private String tier2, tier3, tier4, tier5;
  //Used if the Theater is a child of a MovieTheater
  private long parent;

  /**
   * Prepares the Theater upon creation
   */
  private void init(){
    events = new ArrayList<>();
    reviews = new ArrayList<>();
    address = "";
    restaurants = "";
    parent = -1;
  }
  public Theater(String name, String address, String seating, String restaurants, String tier2, String tier3, String tier4, String tier5, long location){
    //No validation necessary, these are either Strings designed to be printed or pre-verified data structures
    this.name = name;
    this.address = address;
    this.events = events;
    this.reviews = reviews;
    this.restaurants = restaurants;
    this.parent = -1; //Not a child

    this.seats = stringToSeats(seating);

    this.tier2 = tier2;
    this.tier3 = tier3;
    this.tier4 = tier4;
    this.tier5 = tier5;
    this.location = location;
  }

  /**
   * To be used if the theater is a child of a MovieTheater
   * @param number
   * @param seating
   */
  public Theater(String number, String seating, long parent, String tier2, String tier3, String tier4, String tier5){
    this.address = number;
    this.seats = stringToSeats(seating);
    this.parent = parent;

    this.tier2 = tier2;
    this.tier3 = tier3;
    this.tier4 = tier4;
    this.tier5 = tier5;
  }
  
  /**
   * 
   * constructor for the theater
   * @return
   */
  public Theater(String name, ArrayList<Event> events) {
	  this.name = name;
	  this.events = events;
  }
  
  public void printEvents() {
	  for(int i = 0; i < events.size(); i++) {
		  events.get(i).printEvent();
	  }
  }

  private Seat[][] stringToSeats(String seating){
    Seat[][] seats;
    //Get dimensions
    int dimensionSize = 0;
    for(int i = 0; i < seating.length(); ++i){
      char current = seating.charAt(i);
      if (current == '!') {
        dimensionSize = i;
        break;
      }
    }

    if(dimensionSize == 0){
      return null;
    }

    //Parse dimensions
    int dimSizeX = 0;
    for(int i = 0; i < dimensionSize; ++i){
      if(seating.charAt(i) == '*'){
        dimSizeX = i;
        break;
      }
    }
    if(dimSizeX == 0)
      return null;

    String sizeRows = seating.substring(0,dimSizeX);
    String sizeColumns = seating.substring(dimSizeX+1, dimensionSize);

    int rows = Integer.parseInt(sizeRows);
    int columns = Integer.parseInt(sizeColumns);

    //Create array
    seats = new Seat[rows][columns];

    seating = seating.substring(dimensionSize + 1);
    //Populate array

    int trackerX = 0, trackerY = 0;
    for(int i = 0; i < seating.length(); ++i){
      char current = seating.charAt(i);

      switch(current){
        case ' ':
          //Do nothing
          break;
        case 'H':
          seats[trackerX][trackerY] = new Seat(0);
          break;
        case '1':
          seats[trackerX][trackerY] = new Seat(1);
          break;
        case '2':
          seats[trackerX][trackerY] = new Seat(2);
          break;
        case '3':
          seats[trackerX][trackerY] = new Seat(3);
          break;
        case '4':
          seats[trackerX][trackerY] = new Seat(4);
          break;
        case '5':
          seats[trackerX][trackerY] = new Seat(5);
          break;
        default: //Invalid, so skip
          break;
      }

      trackerY++;
      if(trackerY >= columns){//Reached the end of the row, move on to the next one
        trackerY = 0;
        trackerX++;
      }
    }
    return seats;
  }
  /**
   * Adds a review to the venue
   *
   * @param review : The review
   */
  @Override
  public void addReview(Review review) {

  }

  /**
   * Returns the address of the venue
   * Designed for output
   *
   * @return: String with the address (Formatted)
   */
  @Override
  public String getAddress() {
    return address;
  }

  /**
   * Returns a list of restaurants (Comma separated)
   *
   * @return: Comma separated string of restaurants
   */
  @Override
  public String getRestaurants() {
    return restaurants;
  }

  /**
   * Adds a new restaurant to the Restaurant string
   *
   * @param restaurant : The name of the restaurant
   */
  @Override
  public void addRestaurant(String restaurant) {

  }

  /**
   * Get the event listing
   *
   * @return: An ArrayList of Events
   */
  @Override
  public ArrayList<Event> getEvents() {
    return events;
  }

  /**
   * Replaces the list of events with a new one
   *
   * @param events : An ArrayList of Events
   */
  @Override
  public void setEvents(ArrayList<Event> events) {

  }

  /**
   * Appends a new event to the list
   *
   * @param event : An Event
   */
  @Override
  public void addEvent(Event event) {
	  this.events.add(event);

  }

  /**
   * Returns a list of reviews in an ArrayList
   *
   * @return: An ArrayList of Reviews
   */
  @Override
  public ArrayList<Review> getReviews() {
    return reviews;
  }

  public void printSeatingChart(){
    for(int i = 0; i < seats[0].length + 1; ++i){ //This should be fine
      //Print header
      if(i < 10)
        System.out.print(i);
      else if(i < 36)//Use lowercase letters
        System.out.print((char)(i + 87));
      else if(i < 62)//Use uppercase letters
        System.out.print((char)(i + 29));

      System.out.print(" ");
    }
    System.out.println();
    for(int i = 0; i < seats.length; ++i){
      //Print header
      if(i < 10)
        System.out.print(i + 1);
      else if(i < 36)//Use lowercase letters
        System.out.print((char)(i + 87));
      else if(i < 62)//Use uppercase letters
        System.out.print((char)(i + 29));

      System.out.print(" ");
      for(int j = 0; j < seats[i].length; ++j){
        if (seats[i][j] == null) {
          System.out.print("  ");
          continue;
        }
        System.out.print(seats[i][j]);
        System.out.print(" ");
      }
      System.out.println();
    }
  }

  @Override
  public String getType() {
    if(parent == -1)
      return "theater";
    else return "movieChild";
  }

  public long getParent(){
    return this.parent;
  }
}
