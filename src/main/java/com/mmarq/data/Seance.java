package com.mmarq.data;

import java.sql.Timestamp;

public class Seance{
	@Override
	public String toString() {
		return "id=" + id + ", id filmu=" + movieId + ", id sali="
				+ roomId + ", 	data=" + date;
	}
	private int id;
	private int movieId;
	private int roomId;
	private Timestamp date;
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

}
