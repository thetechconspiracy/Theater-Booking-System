/**
 * 
 * Written by Something Creative
 * 
 * This is the Movie class. It implements the Event interface.
 * 
 */


import java.time.LocalDateTime;
import java.util.ArrayList;

public class Movie implements Event{
  private String title;
  private String des;
  private ArrayList<Review> reviews;
  private String rating;
  private Director director;
  private Actor[] mainCast;
  private LocalDateTime[] times;
  private seatingChart seatingChart;
  private String cast;
  private String Director;
  private int id;
  

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
  public Movie(String title, String des, String rating, String director, String cast, int id){ // Only intended for use by LoadEventDatabase
    this.title = title;
    this.des = des;
    this.rating = rating;
    //this.times = new String[] {"4:00", "6:00", "8:00", "10:00"};
    this.seatingChart = new seatingChart(10, 10);
    this.reviews = new ArrayList<Review>();
    this.cast = cast;
    this.Director = director;
    this.id = id;
  }
  
  /**
   * 
   * @param title
   * @param des
   * @param rating
   * This method is for a manager adding a movie to the venue
   */
  public Movie(String title, String des, String rating, LocalDateTime[] times, seatingChart seatingChart, int id) {
	  this.title = title;
	  this.des = des;
	  this.rating = rating;
	  this.times = times;
	  this.reviews = new ArrayList<Review>();
	  this.seatingChart = seatingChart;
	  this.cast = "";
	  this.Director = "";
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


    System.out.println("" + this.title + "\nRated	" + this.rating);
	  System.out.println("" + this.des);
    System.out.println(reviewScore);



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
  public LocalDateTime[] getTimes() {
	  return this.times;
  }
  
  /**
   * 
   * @return returns this event's seating chart
   */
  public seatingChart getSeatingChart() {
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

  public Director getDirector() {
    return director;
  }

  public Actor[] getMainCast() {
    return mainCast;
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
