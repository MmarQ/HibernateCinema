package com.mmarq.data;

public class Room{
	private int id;
	private int numberOfRows;
	private int numberOfPlacesInRow;

	public Room(){
	}
	public Room(int id, int numberOfRows, int numberOfPlacesInRow) {
		super();
		this.id = id;
		this.numberOfRows = numberOfRows;
		this.numberOfPlacesInRow = numberOfPlacesInRow;
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getNumberOfRows() {
		return numberOfRows;
	}
	public void setNumberOfRows(int numberOfRows) {
		this.numberOfRows = numberOfRows;
	}
	public int getNumberOfPlacesInRow() {
		return numberOfPlacesInRow;
	}
	public void setNumberOfPlacesInRow(int numberOfPlacesInRow) {
		this.numberOfPlacesInRow = numberOfPlacesInRow;
	}
}
