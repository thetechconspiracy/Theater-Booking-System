/*
 * Written by Something Creative
 * Description
 */

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Concert implements Event{

  private String title;
  private String des;
  private LocalDateTime showtime;
  private ArrayList<Review> reviews;
  private String rating;
  private String band;
  private String[] times;

  public Concert(String title, String des, String rating, String band){//Intended for use with LoadEventDatabase only
    this.title = title;
    this.des = des;
    this.rating = rating;
    this.band = band;
    this.times = new String[] {"4:00", "6:00", "8:00", "10:00"};
    this.reviews = new ArrayList<Review>();
  }
  
  public Concert(String title, String des, String rating, String band, String[] times){//Intended for use with LoadEventDatabase only
	    this.title = title;
	    this.des = des;
	    this.rating = rating;
	    this.band = band;
	    this.times = times;
	    this.reviews = new ArrayList<Review>();
	  }
  
  public void printEvent() {
	  System.out.println("" + this.title + "	" + this.rating);
	  System.out.println("" + this.des);
	  for(int i = 0; i < this.times.length; i++) {
		  System.out.print("   " + times[i] + ", ");
	  }
	  System.out.println();
  }
  

  public String toString(){
    return title + des + rating;
  }

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

  public LocalDateTime getShowtime() {
    return showtime;
  }

  @Override
  public boolean addReview(Review review) {
	this.reviews.add(review);
    return true;
  }

  public void setShowtime(LocalDateTime showtime) {
    this.showtime = showtime;
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
   * Used for converting to JSON
   * @return: "concert"
   */
  public String getType(){ return "concert"; }

  /**
   * Returns cast as a String.  Used for JSON
   * @return cast in a comma separated string
   */
  public String getCastString() {
    //TODO: convert cast to String
    return "<Main cast goes here>";
  }
}
