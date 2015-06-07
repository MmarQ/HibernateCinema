package com.mmarq.data;

public class MovieType {
	private int id;
	private String name;
	private Integer ageRestriction;

	public MovieType() {
	}

	public MovieType(int id, String name, Integer ageRestriction) {
		super();
		this.id = id;
		this.name = name;
		this.ageRestriction = ageRestriction;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAgeRestriction() {
		return ageRestriction;
	}

	public void setAgeRestriction(Integer ageRestriction) {
		this.ageRestriction = ageRestriction;
	}

	@Override
	public String toString() {
		return "id=" + id + ", nazwa=" + name + ", ograniczenia wiekowe="
				+ ageRestriction;
	}

}
