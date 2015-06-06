package com.mmarq.data;

public enum TablesNames {
	Movies("filmy"), MovieTypes("gatunki"), Reliefs("ulgi"), Reservations(
			"rezerwacje"), Rooms("sale"), Seances("seanse"), Tickets("bilety");

	private String tableName;

	TablesNames(String tableName) {
		this.tableName = tableName;
	}

	public String getTableName() {
		return this.tableName;
	}
	
	public static TablesNames fromString(String tableName) {
	    if (tableName != null) {
	      for (TablesNames b : TablesNames.values()) {
	        if (tableName.equalsIgnoreCase(b.tableName)) {
	          return b;
	        }
	      }
	    }
	    return null;
	  }
}
