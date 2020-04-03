/*
 * Written by Something Creative
 * An interface for
 */

import java.util.ArrayList;

public interface Venue {

  /**
   * Adds a review to the venue
   * @param review: The review
   */
  public void addReview(Review review);

  /**
   * Returns the address of the venue
   * Designed for output
   * @return: String with the address (Formatted)
   */
  public String getAddress();

  /**
   * Returns a list of restaurants (Comma separated)
   * @return: Comma separated string of restaurants
   */
  public String getRestaurants();

  /**
   * Adds a new restaurant to the Restaurant string
   * @param restaurant: The name of the restaurant
   */
  public void addRestaurant(String restaurant);

  /**
   * Get the event listing
   * @return: An ArrayList of Events
   */
  public ArrayList<Event> getEvents();

  /**
   * Replaces the list of events with a new one
   * @param events: An ArrayList of Events
   */
  public void setEvents(ArrayList<Event> events);

  /**
   * Appends a new event to the list
   * @param event: An Event
   */
  public void addEvent(Event event);

  /**
   * Returns a list of reviews in an ArrayList
   * @return: An ArrayList of Reviews
   */
  public ArrayList<Review> getReviews();

  /**
   * Get the type of venue.  Used for JSON export
   * @return: A string of the venue type
   */
  public String getType();



}
