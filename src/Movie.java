/*
 * Written by Something Creative
 * Description
 */


import java.time.LocalDateTime;
import java.util.ArrayList;

public class Movie implements Event{
  private String title;
  private String des;
  private LocalDateTime showtime;
  private ArrayList<Review> reviews;
  private String rating;
  private Director director;
  private Actor[] mainCast;

  public Movie(String title, String des, String rating, String director, String cast){ // Only intended for use by LoadEventDatabase
    this.title = title;
    this.des = des;
    this.rating = rating;
    this.setDirector(director);
    this.setMainCast(cast);
  }

  public String toString(){
    return title + des + rating;
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

  public LocalDateTime getShowtime() {
    return showtime;
  }

  @Override
  public boolean addReview(Review review) {
	  this.reviews.add(review);
	  return true;
  }

  public void setShowtime(LocalDateTime showtimes) {
    this.showtime = showtimes;
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

  public Director getDirector() {
    return director;
  }

  public void setDirector(Director director) {
    this.director = director;
  }

  public void setDirector(String director){
    ;
    //TODO: Convert string to Director
  }

  public Actor[] getMainCast() {
    return mainCast;
  }

  public void setMainCast(Actor[] mainCast) {
    this.mainCast = mainCast;
  }
  public void setMainCast(String mainCast){
    //TODO: Parse string, convert to cast
    ;
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
    //TODO: convert cast to String
    return "<Main cast goes here>";
  }

  public String getDirectorString(){
    return "<director>";
  }
}
