/*
 * Written by Something Creative
 * Description
 */

public class Seat {
  private int tier;
  /*
  5-1: Descending in terms of "luxury features" (lower tiers have fewer features, 1 is a standard seat)
  0: Disabled seating
   */
  private boolean occupied;

  public Seat(int tier){
    if(tier > 5 || tier < 0)
      return; //Invalid

    this.tier = tier;
  }
  public int getTier(){
    return tier;
  }
  public boolean isOccupied(){
    return occupied;
  }
  public void setOccupied(boolean occupied){
    this.occupied = occupied;
  }

  public String toString(){
    return Integer.toString(tier);
  }
}
