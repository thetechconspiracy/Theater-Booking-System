/*
 * Written by Something Creative
 * Description
 */

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Play {

  private String title;
  private String des;
  private LocalDateTime showtimes;
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

  public LocalDateTime getShowtimes() {
    return showtimes;
  }

  public void setShowtimes(LocalDateTime showtimes) {
    this.showtimes = showtimes;
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
}
