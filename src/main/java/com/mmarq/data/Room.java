package com.mmarq.data;

public class Room{
	private int id;
	private Integer numberOfRows;
	private Integer numberOfPlacesInRow;

	public Room(){
	}
	public Room(int id, Integer numberOfRows, Integer numberOfPlacesInRow) {
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
	public Integer getNumberOfRows() {
		return numberOfRows;
	}
	public void setNumberOfRows(Integer numberOfRows) {
		this.numberOfRows = numberOfRows;
	}
	public Integer getNumberOfPlacesInRow() {
		return numberOfPlacesInRow;
	}
	public void setNumberOfPlacesInRow(Integer numberOfPlacesInRow) {
		this.numberOfPlacesInRow = numberOfPlacesInRow;
	}
}
