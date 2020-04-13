/*
 * Written by Something Creative
 * Description
 */

public class RunTests {
  public static void main(String[] args){
    //Seat
    SeatTest seats = new SeatTest();
    seats.testConstructor();
    seats.testOccupied();

    //Guest
    GuestTest guests = new GuestTest();
    guests.testGetType();
    guests.testGetName();
    guests.testGetUserName();
    guests.testGetPassword();

    //LoadEventDatabase
    LoadEventDatabaseTest LEDTest = new LoadEventDatabaseTest();
    LEDTest.testLoadDatabase();

    //LoadVenueDatabase
    LoadVenueDatabaseTest LVDTest = new LoadVenueDatabaseTest();
    LVDTest.testLoadDatabase();

    //SaveEventDatabase
    SaveEventDatabaseTest SEDTest = new SaveEventDatabaseTest();
    SEDTest.testSaveDatabase();

  }
}
