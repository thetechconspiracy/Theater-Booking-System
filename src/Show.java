/*
 * Written by Something Creative
 * Description
 */

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Show {
  private Seat[][] seats;
  private LocalDateTime time;
  Venue location;
  Theater theater;

  public Show(LocalDateTime time, Venue location){
    this.time = time;
    this.location = location;
    this.getSeatingInfo();
  }

  public LocalDateTime getTime() {
    return time;
  }

  private void getSeatingInfo(){
    Theater theater;
    try{
      theater = (Theater)location;
    }catch(Exception e){
      return;//Not a theater
    }

    seats = theater.getSeats().clone();//Make a new array, not a pointer
  }

  public void printSeatingChart(){
    for(int i = 0; i < seats[0].length + 1; ++i){ //This should be fine
      //Print header
      if(i < 10)
        System.out.print(i);
      else if(i < 36)//Use lowercase letters
        System.out.print((char)(i + 87));
      else if(i < 62)//Use uppercase letters
        System.out.print((char)(i + 29));

      System.out.print(" ");
    }
    System.out.println();
    for(int i = 0; i < seats.length; ++i){
      //Print header
      if(i < 10)
        System.out.print(i + 1);
      else if(i < 36)//Use lowercase letters
        System.out.print((char)(i + 87));
      else if(i < 62)//Use uppercase letters
        System.out.print((char)(i + 29));

      System.out.print(" ");
      for(int j = 0; j < seats[i].length; ++j){
        if (seats[i][j] == null) {
          System.out.print("  ");
          continue;
        }
        System.out.print(seats[i][j]);
        System.out.print(" ");
      }
      System.out.println();
    }

  }
  public void setTheater(Theater theater){
    this.theater = theater;
  }
  public String getTimeFormatted(){
    //https://knpcode.com/java-programs/display-time-12-hour-format-am-pm-java/
    //https://www.w3schools.com/java/java_date.asp
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM-dd-yyyy hh:mm a");
    return time.format(formatter);
  }
  public void setTime(LocalDateTime time) {
    this.time = time;
  }

  public Venue getLocation() {
    return location;
  }

  public void setLocation(Venue location) {
    this.location = location;
  }
}
