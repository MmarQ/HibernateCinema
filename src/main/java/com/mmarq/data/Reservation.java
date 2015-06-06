package com.mmarq.data;

public class Reservation {
	private int id;
	private int seanceId;
	private int row;
	private int place;

	public Reservation() {
	}

	public Reservation(int id, int seanceId, int row, int place) {
		super();
		this.id = id;
		this.seanceId = seanceId;
		this.row = row;
		this.place = place;
	}

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

	@Override
	public String toString() {
		return "Reservation [id=" + id + ", seanceId=" + seanceId + ", row="
				+ row + ", place=" + place + "]";
	}
	
}
