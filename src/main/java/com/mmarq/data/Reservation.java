package com.mmarq.data;

public class Reservation{
	@Override
	public String toString() {
		return "id=" + id + ", id seansu=" + seanceId + ", rz�d="
				+ row + ", miejsce=" + place;
	}
	private int id;
	private int seanceId;
	private int row;
	private int place;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getSeanceId() {
		return seanceId;
	}
	public void setSeanceId(int seanceId) {
		this.seanceId = seanceId;
	}
	public int getRow() {
		return row;
	}
	public void setRow(int row) {
		this.row = row;
	}
	public int getPlace() {
		return place;
	}
	public void setPlace(int place) {
		this.place = place;
	}
}
