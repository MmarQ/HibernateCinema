package com.mmarq.data;

public class Relief {
	private int id;
	private String name;
	private double amountOfRelief;

	public Relief() {
	}

	public Relief(int id, String name, double amountOfRelief) {
		super();
		this.id = id;
		this.name = name;
		this.amountOfRelief = amountOfRelief;
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

	public double getAmountOfRelief() {
		return amountOfRelief;
	}

	public void setAmountOfRelief(double amountOfRelief) {
		this.amountOfRelief = amountOfRelief;
	}

	@Override
	public String toString() {
		return "id=" + id + ", nazwa=" + name + ", wysoko�� ulgi="
				+ amountOfRelief;
	}

}
