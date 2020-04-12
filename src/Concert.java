/**
 * This is the Concert Class
 * It implements the Event interface
 */
import java.util.ArrayList;

public class Concert implements Event{

  private String title;
  private String des;
  private ArrayList<Review> reviews;
  private String rating;
  private String band;
  private String[] times;
  private SeatingChart seatingChart;

  /**
   * 
   * @param title
   * @param des
   * @param rating
   * @param band
   * 
   * This is the Concert constructor for use by loading the JSON database
   */
  public Concert(String title, String des, String rating, String band){//Intended for use with LoadEventDatabase only
    this.title = title;
    this.des = des;
    this.rating = rating;
    this.band = band;
    this.times = new String[] {"4:00", "6:00", "8:00", "10:00"};
    this.reviews = new ArrayList<Review>();
    this.seatingChart = new SeatingChart(10, 10);
  }
  
  /**
   * 
   * @param title
   * @param des
   * @param rating
   * @param band
   * @param times
   * @param seatingChart
   * 
   * This is the Concert constructor that the manager uses when they are adding an event to a theater
   */
  public Concert(String title, String des, String rating, String band, String[] times, SeatingChart seatingChart){//Intended for use with LoadEventDatabase only
	    this.title = title;
	    this.des = des;
	    this.rating = rating;
	    this.band = band;
	    this.times = times;
	    this.reviews = new ArrayList<Review>();
	    this.seatingChart = seatingChart;
	  }
  
  /**
   * this is the method for printing out the information for the concert
   */
  public void printEvent() {
	  System.out.println("" + this.title + "	" + this.rating);
	  System.out.println("" + this.des);
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
  

  /**
   * 
   * These methods are getters and setters for the class
   */
  public String getBand() {
    return band;
  }

  public void setBand(String band) {
    this.band = band;
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


  /**
   * This is the add review method which is called when someone adds a review to a concert
   */
  @Override
  public boolean addReview(Review review) {
	this.reviews.add(review);
    return true;
  }


  /**
   * Used for converting to JSON
   * @return: "concert"
   */
  public String getType(){ return "concert"; }

  /**
   * Returns cast as a String.  Used for JSON
   * @return cast in a comma separated string
   */
  public String getCastString() {
    return "<Main cast goes here>";
  }
}
