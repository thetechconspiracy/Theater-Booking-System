/*
 * Written by Something Creative
 * Description
 */

public class RunTests {
  public static void main(String[] args){
    //Seat
    SeatTest seats = new SeatTest();
    seats.testToString();
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
    
    //MovieTheater
    MovieTheaterTest mtTest = new MovieTheaterTest();
    mtTest.checkAddress();
    mtTest.checkEventArray();
    mtTest.checkName();
    mtTest.checkRestaurant();
    mtTest.checkTheaterArray();
    mtTest.checkAddEvent();
    mtTest.checkGetReviews();
    mtTest.checkGetType();
    
    //Manager
    ManagerTest managerTest = new ManagerTest();
    managerTest.testName();
    managerTest.testPassword();
    managerTest.testSeatingChartColumns();
    managerTest.testSeatingChartRows();
    managerTest.testUserName();
    managerTest.testType();
    managerTest.testShowTimes();
    managerTest.testColumns();
    managerTest.testRows();
    managerTest.testCast();
    managerTest.testAddEvent();
    
    //Reviews
    ReviewTest reviewTest = new ReviewTest();
    reviewTest.testSetReview();
    reviewTest.testTitle();
    reviewTest.testRating();
    reviewTest.testContents();

  }
}
