/*
 * Written by Something Creative
 * Description
 */

import java.util.ArrayList;

public class MovieTheater implements Venue {
  private String address;
  private ArrayList<Event> events;
  private ArrayList<Review> reviews;
  private String restaurants;
  private String name;
  private long location;

  private ArrayList<Theater> theaters;

  private long childID;

  public MovieTheater(String name, String address, String restaurants, long child, long location){
    this.name = name;
    this.address = address;
    this.restaurants = restaurants;

    this.childID = child;
    this.location = location;

    this.theaters = new ArrayList<Theater>();
    this.reviews = new ArrayList<>();
    this.events = new ArrayList<>();
  }

  public boolean addTheater(Theater theater){
    if(theater == null)
      return false;
    return this.theaters.add(theater);
  }

  public long getChildID(){
    return this.childID;
  }
  /**
   * Adds a review to the venue
   *
   * @param review : The review
   */
  @Override
  public void addReview(Review review) {
    this.reviews.add(review);
  }

  /**
   * Returns the address of the venue
   * Designed for output
   *
   * @return: String with the address (Formatted)
   */
  @Override
  public String getAddress() {
    return this.address;
  }

  /**
   * Returns a list of restaurants (Comma separated)
   *
   * @return: Comma separated string of restaurants
   */
  @Override
  public String getRestaurants() {
    return this.restaurants;
  }

  /**
   * Adds a new restaurant to the Restaurant string
   *
   * @param restaurant : The name of the restaurant
   */
  @Override
  public void addRestaurant(String restaurant) {
    this.restaurants.concat(","+restaurant);
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
    this.events = events;
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
  public String getType(){
    return "movieTheater";
  }

  @Override
  public long getLocation() {
    return location;
  }

  public ArrayList<Theater> getTheaters(){
    return this.theaters;
  }

}
