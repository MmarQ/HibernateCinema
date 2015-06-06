package com.mmarq.data;

public class Ticket{
	@Override
	public String toString() {
		return "id=" + id + ", rz�d=" + row + ", miejsce=" + place
				+ ", cena=" + price + ", id seansu=" + seanceId
				+ ", id ulgi=" + ticketReductionId
				+ ", id rezerwacji=" + ReservationId + "]";
	}
	private int id;
	private int row;
	private int place;
	private double price;
	private int seanceId;
	private int ticketReductionId;
	private int ReservationId;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getSeanceId() {
		return seanceId;
	}
	public void setSeanceId(int seanceId) {
		this.seanceId = seanceId;
	}
	public int getTicketReductionId() {
		return ticketReductionId;
	}
	public void setTicketReductionId(int ticketReductionId) {
		this.ticketReductionId = ticketReductionId;
	}
	public int getReservationId() {
		return ReservationId;
	}
	public void setReservationId(int reservationId) {
		ReservationId = reservationId;
	}
}
