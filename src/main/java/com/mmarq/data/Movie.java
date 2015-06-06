package com.mmarq.data;

public class Movie {
	private int id;
	private String title;
	private String director;
	private int duration;
	private int productionYear;
	private int movieTypeId;

	public Movie() {
	}

	public Movie(int id, String title, String director, int duration,
			int productionYear, int movieTypeId) {
		super();
		this.id = id;
		this.title = title;
		this.director = director;
		this.duration = duration;
		this.productionYear = productionYear;
		this.movieTypeId = movieTypeId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public int getProductionYear() {
		return productionYear;
	}

	public void setProductionYear(int productionYear) {
		this.productionYear = productionYear;
	}

	public int getMovieTypeId() {
		return movieTypeId;
	}

	public void setMovieTypeId(int movieTypeId) {
		this.movieTypeId = movieTypeId;
	}

	@Override
	public String toString() {
		return "Movie [id=" + id + ", title=" + title + ", director="
				+ director + ", duration=" + duration + ", productionYear="
				+ productionYear + ", movieTypeId=" + movieTypeId + "]";
	}

}
