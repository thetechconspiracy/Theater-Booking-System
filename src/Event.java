/*
 * Written by Something Creative
 * An interface for
 */

import java.time.*;

//This will be refactored at some point in the future
public interface Event {
  public LocalDateTime[] getShowtimes();
  public boolean addReview(Review review);
}
