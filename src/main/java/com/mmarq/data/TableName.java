package com.mmarq.data;

public enum TableName {
	Movie("filmy"), MovieType("gatunki"), Relief("ulgi"), Reservation(
			"rezerwacje"), Room("sale"), Seance("seanse"), Ticket("bilety");

	private String tableName;

	TableName(String tableName) {
		this.tableName = tableName;
	}

	public String getTableName() {
		return this.tableName;
	}

	public static TableName fromString(String tableName) {
		if (tableName != null) {
			for (TableName b : TableName.values()) {
				if (tableName.equalsIgnoreCase(b.tableName)) {
					return b;
				}
			}
		}
		return null;
	}
}
