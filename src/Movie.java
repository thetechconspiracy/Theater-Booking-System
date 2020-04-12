/**
 * 
 * Written by Something Creative
 * 
 * This is the Movie class. It implements the Event interface.
 * 
 */


import java.util.ArrayList;

public class Movie implements Event{
  private String title;
  private String des;
  private ArrayList<Review> reviews;
  private String rating;
  private String[] times;
  private SeatingChart seatingChart;
  private String cast;
  private String Director;
  

  /**
   * 
   * @param title
   * @param des
   * @param rating
   * @param director
   * @param cast
   * 
   * This is the constructor that the JSON file uses
   */
  public Movie(String title, String des, String rating, String director, String cast){ // Only intended for use by LoadEventDatabase
    this.title = title;
    this.des = des;
    this.rating = rating;
    this.times = new String[] {"4:00", "6:00", "8:00", "10:00"};
    this.seatingChart = new SeatingChart(10, 10);
    this.reviews = new ArrayList<Review>();
    this.cast = cast;
    this.Director = director;
  }
  
  /**
   * 
   * @param title
   * @param des
   * @param rating
   * This method is for a manager adding a movie to the venue
   */
  public Movie(String title, String des, String rating, String[] times, SeatingChart seatingChart) {
	  this.title = title;
	  this.des = des;
	  this.rating = rating;
	  this.times = times;
	  this.reviews = new ArrayList<Review>();
	  this.seatingChart = seatingChart;
	  this.cast = "";
	  this.Director = "";
  }
  
  /**
   * method for printing out an event
   */
  public void printEvent() {
	  System.out.println("" + this.title + "	" + this.rating);
	  System.out.println("" + this.des);
	  if(!this.Director.equals("")) {
		  System.out.println("Director: " + this.Director);
	  }
	  if(!this.cast.equals("")) {
		  System.out.println("Cast: " + this.cast);
	  }
	  for(int i = 0; i < this.times.length; i++) {
		  System.out.print("   " + times[i] + ", ");
	  }
	  System.out.println();
	  System.out.println();
  }
  
  /**
   * method that prints out reviews for the movie
   */
  public void printReviews() {
	  for(int i = 0; i < reviews.size(); i++) {
		  reviews.get(i).printReview();
	  }
	  System.out.println("No more reviews.");
  }
  
  /**
   * returns the array of showtimes
   */
  public String[] getTimes() {
	  return this.times;
  }
  
  /**
   * 
   * @return returns this event's seating chart
   */
  public SeatingChart getSeatingChart() {
	  return this.seatingChart;
  }

  public String getTitle() {
    return title;
  }

  public String getDes() {
    return des;
  }

  public void setDes(String des) {
    this.des = des;
  }

  /**
   * adds a review to the movie's arraylist of reviews
   */
  @Override
  public boolean addReview(Review review) {
	  this.reviews.add(review);
	  return true;
  }

  /**
   * Movie getters and setters
   * 
   */
  public ArrayList<Review> getReviews() {
    return reviews;
  }

  public void setReviews(ArrayList<Review> reviews) {
    this.reviews = reviews;
  }

  public String getRating() {
    return rating;
  }

  public void setRating(String rating) {
    this.rating = rating;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  /**
   * Used for converting to JSON
   * @return: "movie"
   */
  public String getType(){ return "movie"; }

  /**
   * Returns cast as a String.  Used for JSON
   * @return cast in a comma separated string
   */
  public String getCastString() {
    return "<Main cast goes here>";
  }

  public String getDirectorString(){
    return "<director>";
  }
}
