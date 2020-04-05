/*
 * Written by Something Creative
 * An interface for
 */


import java.time.LocalDateTime;

public interface Event {
  public LocalDateTime getShowtime();
  public boolean addReview(Review review);
  public String getType();
  public String toString();
  public String getTitle();
  public String getDes();
  public String getRating();
  public String getCastString();
  public void printEvent();
  public String[] getTimes();
  public seatingChart getSeatingChart();
}
