/**
 * This is the Concert Class
 * It implements the Event interface
 */
import java.time.LocalDateTime;
import java.util.ArrayList;

public class Concert implements Event{

  private String title;
  private String des;
  private int id;
  private ArrayList<Review> reviews;
  private String rating;
  private String band;
  private LocalDateTime[] times;
  private seatingChart seatingChart;

  /**
   * 
   * @param title
   * @param des
   * @param rating
   * @param band
   * 
   * This is the Concert constructor for use by loading the JSON database
   */
  public Concert(String title, String des, String rating, String band, int id){//Intended for use with LoadEventDatabase only
    this.title = title;
    this.des = des;
    this.rating = rating;
    this.band = band;
    this.id = id;
    //this.times = new String[] {"4:00", "6:00", "8:00", "10:00"};
    this.reviews = new ArrayList<Review>();
    this.seatingChart = new seatingChart(10, 10);
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
  public Concert(String title, String des, String rating, String band, LocalDateTime[] times, seatingChart seatingChart, int id){//Intended for use with LoadEventDatabase only
	    this.title = title;
	    this.des = des;
	    this.rating = rating;
	    this.band = band;
	    this.times = times;
	    this.reviews = new ArrayList<Review>();
	    this.seatingChart = seatingChart;
	    this.id = id;
	  }
  
  /**
   * this is the method for printing out the information for the concert
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
	  for(LocalDateTime time : times)
	    System.out.println(time.toString());
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
  public int getId() { return this.id; }
}
