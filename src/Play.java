/*
 * Written by Something Creative
 * Description
 */

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Play implements Event{

  private String title;
  private String des;
  private LocalDateTime showtime;
  private ArrayList<Review> reviews;
  private String rating;

  private Director playwright;
  private Actor[] cast;


  public Play(String title, String des, String rating, String playwright, String cast){ // Only intended for use by LoadEventDatabase
    this.title = title;
    this.des = des;
    this.rating = rating;
    this.setPlaywright(playwright);
    this.setCast(cast);
  }
  
  /**
   * 
   * @param title
   * @param des
   * @param rating
   * this method is for a manager adding a play
   */
  public Play(String title, String des, String rating) {
	  this.title = title;
	  this.des = des;
	  this.rating = rating;
  }

  public String toString(){
    return title + des + rating;
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
    return false;
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

  public Director getPlaywright() {
    return playwright;
  }

  public void setPlaywright(Director playwright) {
    this.playwright = playwright;
  }

  public void setPlaywright(String playwright){
    ;
    //TODO: Convert to Director
  }

  public Actor[] getCast() {
    return cast;
  }

  public void setCast(Actor[] cast) {
    this.cast = cast;
  }
  public void setCast(String cast){
    ;
    //TODO: Convert to cast
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
