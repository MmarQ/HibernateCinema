package com.mmarq.data;

public class Room{
	@Override
	public String toString() {
		return "id=" + id + ", ilo�� rz�d�w=" + numberOfRows
				+ ", ilo�� miejsc w rz�dzie=" + numberOfPlacesInRow + "]";
	}
	private int id;
	private int numberOfRows;
	private int numberOfPlacesInRow;
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
