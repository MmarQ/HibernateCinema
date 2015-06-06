package com.mmarq.data;

public class Relief{
	private int id;
	private String name;
	private double amountOfRelief;
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
	public double getAmountOfRelief() {
		return amountOfRelief;
	}
	@Override
	public String toString() {
		return "id=" + id + ", nazwa=" + name + ", wysoko�� ulgi="
				+ amountOfRelief;
	}
	public void setAmountOfRelief(double amountOfRelief) {
		this.amountOfRelief = amountOfRelief;
	}
}
