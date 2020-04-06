/**
 * Written by Something Creative
 * 
 * This is the Play class. It implements the Event interface
 */

import java.util.ArrayList;

public class Play implements Event{

  private String title;
  private String des;
  private ArrayList<Review> reviews;
  private String rating;

  private Director playwright;
  private Actor[] cast;
  
  private String[] times;
  private String[] Cast;
  private String playWright;
  private seatingChart seatingChart;


  /**
   * 
   * @param title
   * @param des
   * @param rating
   * @param playwright
   * @param cast
   * 
   * constructor used by the JSON file
   */
  public Play(String title, String des, String rating, String playwright, String cast){ // Only intended for use by LoadEventDatabase
    this.title = title;
    this.des = des;
    this.rating = rating;
    this.times = new String[] {"4:00", "6:00", "8:00", "10:00"};
    this.playWright = "";
    this.Cast = new String[1];
    this.Cast[0] = "";
    this.reviews = new ArrayList<Review>();
    this.seatingChart = new seatingChart(10,10);
  }
  
  /**
   * 
   * @param title
   * @param des
   * @param rating
   * this method is for a manager adding a play
   */
  public Play(String title, String des, String rating, String[] times, String playwright, String[] cast, seatingChart seatingChart) {
	  this.title = title;
	  this.des = des;
	  this.rating = rating;
	  this.times = times;
	  this.playWright = playwright;
	  this.Cast = cast;
	  this.reviews = new ArrayList<Review>();
	  this.seatingChart = seatingChart;
  }
  
  /**
   * method for printing out an event
   */
  public void printEvent() {
	  System.out.println("" + this.title + "	" + this.rating);
	  System.out.println("" + this.des);
	  System.out.println("Playwright: " + this.playWright);
	  System.out.println("Cast: ");
	  for(int i = 0; i < Cast.length; i++) {
		  System.out.println(Cast[i]);
	  }
	  for(int i = 0; i < this.times.length; i++) {
		  System.out.print("   " + times[i] + ", ");
	  }
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
   * Getters and setters for the Concert class
   */
  public seatingChart getSeatingChart() {
	  return this.seatingChart;
  }

  public String toString(){
    return title;
  }


  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getDes() {
    return des;
  }

  public void setDes(String des) {
    this.des = des;
  }

  @Override
  public boolean addReview(Review review) {
	  this.reviews.add(review);
	  return true;
  }

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

  public Director getPlaywright() {
    return playwright;
  }

  public Actor[] getCast() {
    return cast;
  }

  /**
   * Used for converting to JSON
   * @return: "play"
   */
  public String getType(){ return "play"; }

  /**
   * Returns cast as a String.  Used for JSON
   * @return cast in a comma separated string
   */
  public String getCastString() {
    //TODO: convert cast to String
    return "<Main cast goes here>";
  }
  public String getPlaywrightString(){
    return "<director>";
  }
}
