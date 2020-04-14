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
    
    //Consumer
    ConsumerTest consumerTest = new ConsumerTest();
    consumerTest.testName();
    consumerTest.testPassword();
    consumerTest.testUserName();
    consumerTest.testType();
    consumerTest.testButTicket();
    consumerTest.testRateMovie();
    
    //Ticket
    TicketTest ticketTest = new TicketTest();
    ticketTest.testEvent();
    ticketTest.testTime();
    
    //Play
    PlayTest playTest = new PlayTest();
    playTest.testDesc();
    playTest.testRating();
    playTest.testReviews();
    playTest.testSeatingChart();
    playTest.testTimes();
    playTest.testTitle();
    playTest.testType();
    
    //Theater Booking System
    TheaterBookingSystemTest tBSTest = new TheaterBookingSystemTest();
    tBSTest.testUserArray();
    tBSTest.testSuccessfulLogin();
    tBSTest.testFailedLogin();
    tBSTest.testConsumerOptions();
    tBSTest.testManagerOptions();
    tBSTest.testGuestOptions();

  }
}
