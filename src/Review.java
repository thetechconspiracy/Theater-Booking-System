/*
 * Written by Something Creative
 * Description
 */

import java.text.NumberFormat;

public class Review {
  private String title;
  private String contents;
  private int rating;

  public Review(String title, String contents, int rating){
    setReview(title, contents, rating);
  }

  public Review(String[] review) {
    setReview(review);
  }

  public Review(int rating){
    if(rating <= 5 && rating > 0){//Bounds checking
      this.rating = rating;
    }
  }
  public void setReview(String title, String contents, int rating){
    this.title = title;
    this.contents = contents;
    if(rating <= 5 && rating > 0){//Bounds checking
      this.rating = rating;
    }
  }

  public void setReview(String[] review){
    if (review.length != 3) { return; }

    String title = review[0];
    String contents = review[1];
    String rating = review[2];

    if (rating.length() != 1) { return; }

    int ratingInt;
    try {
      ratingInt = Integer.parseInt(rating);
    } catch (Exception NumberFormatException) {
      return;
    }
//testr
    if (ratingInt > 5 || ratingInt < 1) { return; }

    this.title = title;
    this.contents = contents;
    this.rating = ratingInt;
  }

}
