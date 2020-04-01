/*
 * Written by Something Creative
 * An interface for
 */


import java.time.LocalDateTime;

public interface Event {
  public LocalDateTime[] getShowtimes();
  public boolean addReview(Review review);
  public String getType();
  public String toString();
  public String getTitle();
  public String getDes();
  public String getRating();
  public String getCastString();
}
