/*
 * Written by Something Creative
 * A review
 */

import java.text.NumberFormat;

public class Review {
  private String title;
  private String contents;
  private int rating;

  /**
   * Constructs a review given a title, contents, and rating
   * @param title: Title of the review
   * @param contents: Body of the review
   * @param rating: Rating of the review [1,5]
   */
  public Review(String title, String contents, int rating){
    setReview(title, contents, rating);
  }

  /**
   * Constructs a review from a review array
   * @param review: The review as an array.  Follows the format [String title, String contents, int rating]
   */
  public Review(String[] review) {
    setReview(review);
  }

  public String[] getReview(){
    String[] review = new String[3];
    review[0] = title;
    review[1] = contents;
    review[2] = String.valueOf(rating);

    return review;
  }
  
  public void printReview() {
	  String[] review = this.getReview();
	  System.out.println(review[0]);
	  System.out.println(review[1]);
	  System.out.println("" + review[2] + "/5 Stars");
  }

  /**
   * Returns the rating of the review
   * @return: An int, ranging from 1 to 5 inclusive
   */
  public int getRating(){
    return rating;
  }

  /*****************************************************************
   *                        Private Methods                        *
   * ***************************************************************/
  private void setReview(String title, String contents, int rating){
    this.title = title;
    this.contents = contents;
    if(rating <= 5 && rating > 0){//Bounds checking
      this.rating = rating;
    }
  }

  private void setReview(String[] review){
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

    if (ratingInt > 5 || ratingInt < 1) { return; }

    this.title = title;
    this.contents = contents;
    this.rating = ratingInt;
  }

}
