package com.mmarq.manage;

import com.mmarq.data.TableName;

public class ManagerFactory {
	public static Manager getManager(TableName tableName) {
		switch (tableName) {
		case Movie:
			return new MovieManager();
		case MovieType:
			return new MovieTypeManager();
		case Relief:
			return new ReliefManager();
		case Reservation:
			return new ReservationManager();
		case Room:
			return new RoomManager();
		case Seance:
			return new SeanceManager();
		case Ticket:
			return new TicketManager();
		default:
			return null;
		}
	}
}
