/*
 * Written by Something Creative
 * Description
 */

import java.util.ArrayList;

public class Main {
  public static void main(String[] args){
    ArrayList<Event> events = LoadEventDatabase.loadDatabase();


    for(Event event : events){
      System.out.println(event);
    }

    SaveEventDatabase.saveDatabase(events);
  }
}
