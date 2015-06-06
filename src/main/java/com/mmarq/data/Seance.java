package com.mmarq.data;

import java.sql.Timestamp;

public class Seance{
	private int id;
	private int movieId;
	private int roomId;
	private Timestamp date;
	
	public Seance(){
	}
	public Seance(int id, int movieId, int roomId, Timestamp date) {
		super();
		this.id = id;
		this.movieId = movieId;
		this.roomId = roomId;
		this.date = date;
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getMovieId() {
		return movieId;
	}
	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}
	public int getRoomId() {
		return roomId;
	}
	public void setRoomId(int roomId) {
		this.roomId = roomId;
	}
	public Timestamp getDate() {
		return date;
	}
	public void setDate(Timestamp date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "Seance [id=" + id + ", movieId=" + movieId + ", roomId="
				+ roomId + ", date=" + date + "]";
	}
	
}
