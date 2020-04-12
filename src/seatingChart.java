/**
 * Written by Something Creative
 * 
 * This is the seatingChart class which keeps tracks of tickets and seats for a theater
 */

import java.util.*;

public class seatingChart {
	
	private String[][] seats;
	
	/**
	 * 
	 * @param x, number of rows
	 * @param y, number of columns
	 * constructor for the seating chart
	 */
	public seatingChart(int x, int y) {
		this.seats = new String[x][y];
		init();
	}
	
	/**
	 * initializes the character array
	 */
	private void init() {
		for(int i = 0; i < seats.length; i++) {
			for(int j = 0; j < seats[i].length; j++) {
				seats[i][j] = String.valueOf(j+1);
			}
		}
	}
	
	/**
	 * prints the seating chart
	 */
	public void printChart() {
		System.out.println("\t\tFront");
		System.out.println();
		System.out.println("Row:\t\tSeat:");
		for(int i = 0; i < seats.length; i++) {
			System.out.print((i+1) + "\t ");
			for(int j = 0; j < seats[i].length; j++) {
				System.out.print(seats[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("Seats marked with \"X\" are unavailable.");
	}
	
	/**
	 * 
	 * @param x, row number
	 * @param y, column number
	 * this changes the status of a seat to unavailable
	 */
	public Ticket seatStatus(Event event, String time) {
		Scanner keyboard = new Scanner(System.in);
		boolean cont = true;
		while(cont) {
			printChart();
			System.out.println("Which row would you like?");
			int row = (keyboard.nextInt()) - 1;
			System.out.println("Which seat would you like?");
			int seat = (keyboard.nextInt()) - 1;
			if(!checkSeatStatus(row, seat)) {
				System.out.println("Seat taken. Pick Another.");
				continue;
			}
			this.seats[row][seat] = "X";
			cont = false;
			return new Ticket(event, time, row, seat);
		}
		return null;
	}
	
	/**
	 * 
	 * @param x, row
	 * @param y, seat number
	 * @return returns a boolean if the seat is already taken
	 */
	private boolean checkSeatStatus(int x, int y) {
		if(this.seats[x][y].equals("X")) {
			return false;
		}
		return true;
	}
	
	/**
	 * returns the number of rows
	 */
	public int getRows() {
		return this.seats.length;
	}
	
	/**
	 * return the number of seats
	 */
	public int getSeats() {
		return this.seats[0].length;
	}
	
	

}
