package com.mmarq.data;

public class MovieType{
	private int id;
	private String name;
	private int ageRestriction;
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
	public int getAgeRestriction() {
		return ageRestriction;
	}
	@Override
	public String toString() {
		return "id=" + id + ", nazwa=" + name + ", ograniczenia wiekowe="
				+ ageRestriction;
	}
	public void setAgeRestriction(int ageRestriction) {
		this.ageRestriction = ageRestriction;
	}
	
}
