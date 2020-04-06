import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * 
 * @author Something Creative
 * 
 * This is the event interface
 * The Movie, Play, and Concert classes implement this interface.
 *
 */
public interface Event {
  public boolean addReview(Review review);
  public String getType();
  public String getTitle();
  public String getDes();
  public String getRating();
  public String getCastString();
  public void printEvent();
  public LocalDateTime[] getTimes();
  public seatingChart getSeatingChart();
  public void printReviews();
  public int getId();
}
