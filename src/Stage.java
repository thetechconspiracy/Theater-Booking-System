/**
 * Written by Something Creative
 * 
 * This is the Stage class. It implements Venue
 */

import java.util.ArrayList;

public class Stage implements Venue{
  private String address;
  private ArrayList<Event> events;
  private ArrayList<Review> reviews;
  private String restaurants;
  private String name;
  private long location;

  /**
   * 
   * @param name
   * @param address
   * @param restaurants
   * @param location
   * 
   * constructor for Stage
   */
  public Stage(String name, String address, String restaurants, long location){
    this.name = name;
    this.address = address;
    this.location = location;
    this.restaurants = restaurants;
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
    return "stage";
  }
}
