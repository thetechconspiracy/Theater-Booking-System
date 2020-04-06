/**
 * Written by Something Creative
 * 
 * This is the Play class. It implements the Event interface
 */

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Play implements Event{

  private String title;
  private String des;
  private ArrayList<Review> reviews;
  private String rating;
  private int id;


  private Director playwright;
  private Actor[] cast;
  
  private LocalDateTime[] times;
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
  public Play(String title, String des, String rating, String playwright, String cast, int id){ // Only intended for use by LoadEventDatabase
    this.title = title;
    this.des = des;
    this.rating = rating;
    //this.times = new String[] {"4:00", "6:00", "8:00", "10:00"};
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
  public Play(String title, String des, String rating, LocalDateTime[] times, String playwright, String[] cast, seatingChart seatingChart, int id) {
	  this.title = title;
	  this.des = des;
	  this.rating = rating;
	  this.times = times;
	  this.playWright = playwright;
	  this.Cast = cast;
	  this.reviews = new ArrayList<Review>();
	  this.seatingChart = seatingChart;
	  this.id = id;
  }
  
  /**
   * method for printing out an event
   */
  public void printEvent() {
    //Calculate review scores
    double average = 0;
    int accumulator = 0;
    for(Review review: reviews){
      if(review == null)
        continue;
      average += review.getRating();
      accumulator++;
    }

    average /= accumulator;

    int averageInt = (int) Math.round(average);

    String reviewScore = "";
    //Calculate graphic
    for(int i = 1; i <= averageInt; ++i){
      //Stars
      reviewScore.concat("*");
    }
    for(int i = averageInt + 1; i < 5; ++i){
      //Dashes
      reviewScore.concat("-");
    }

    reviewScore.concat("    ");
    reviewScore.concat(Double.toString(average));

    System.out.println("" + this.title + "\nRated " + this.rating);
	  System.out.println("" + this.des);
	  System.out.println("Playwright: " + this.playWright);
	  System.out.println("Cast: ");
	  for(int i = 0; i < Cast.length; i++) {
		  System.out.println(Cast[i]);
	  }
	  for(LocalDateTime time : times){
	    System.out.println(time.toString());
    }
	  System.out.println();
  }
  
  /**
   * method that prints out reviews for the movie
   */
  public void printReviews() {
	  for(Review review : reviews){
	    review.printReview();
    }
	  System.out.println("No more reviews.");
  }
  
  /**
   * returns the array of showtimes
   */
  public LocalDateTime[] getTimes() {
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
  public int getId(){ return this.id; }

}
