package com.mmarq.data;

public class Ticket{
	private int id;
	private int row;
	private int place;
	private double price;
	private int seanceId;
	private Integer ticketReductionId;
	private Integer ReservationId;
	
	public Ticket(){
	}
	public Ticket(int id, int row, int place, double price, int seanceId,
			Integer ticketReductionId, Integer reservationId) {
		super();
		this.id = id;
		this.row = row;
		this.place = place;
		this.price = price;
		this.seanceId = seanceId;
		this.ticketReductionId = ticketReductionId;
		ReservationId = reservationId;
	}


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
	public Integer getTicketReductionId() {
		return ticketReductionId;
	}
	public void setTicketReductionId(Integer ticketReductionId) {
		this.ticketReductionId = ticketReductionId;
	}
	public Integer getReservationId() {
		return ReservationId;
	}
	public void setReservationId(Integer reservationId) {
		ReservationId = reservationId;
	}
	@Override
	public String toString() {
		return "Ticket [id=" + id + ", row=" + row + ", place=" + place
				+ ", price=" + price + ", seanceId=" + seanceId
				+ ", ticketReductionId=" + ticketReductionId
				+ ", ReservationId=" + ReservationId + "]";
	}
	
}
