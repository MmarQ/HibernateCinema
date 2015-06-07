package com.mmarq.tablesModels;

import java.util.List;

import com.mmarq.data.*;

public class TableModelFactory {
	public static int getNumberOfColumns(TableName tableName) {
		switch (tableName) {
		case Movie:
			return 6;
		case MovieType:
			return 3;
		case Relief:
			return 3;
		case Reservation:
			return 4;
		case Room:
			return 3;
		case Seance:
			return 4;
		case Ticket:
			return 7;
		default:
			return 0;
		}
	}

	public static Object[] getValueAt(TableName tableName, List<Data> recordsList,
			int rowIndex) {
		switch (tableName) {
		case Movie:
			Movie movie = (Movie) recordsList.get(rowIndex);
			return new Object[] { movie.getId(), movie.getTitle(),
					movie.getDirector(), movie.getDuration(),
					movie.getProductionYear(), movie.getMovieTypeId() };
		case MovieType:
			MovieType movieType = (MovieType) recordsList.get(rowIndex);
			return new Object[] { movieType.getId(), movieType.getName(),
					movieType.getAgeRestriction() };
		case Relief:
			Relief relief = (Relief) recordsList.get(rowIndex);
			return new Object[] { relief.getId(), relief.getName(),
					relief.getAmountOfRelief() };
		case Reservation:
			Reservation reservation = (Reservation) recordsList.get(rowIndex);
			return new Object[] { reservation.getId(),
					reservation.getSeanceId(), reservation.getRow(),
					reservation.getPlace() };
		case Room:
			Room room = (Room) recordsList.get(rowIndex);
			return new Object[] { room.getId(), room.getNumberOfRows(),
					room.getNumberOfPlacesInRow() };
		case Seance:
			Seance seance = (Seance) recordsList.get(rowIndex);
			return new Object[] { seance.getId(), seance.getMovieId(),
					seance.getRoomId(), seance.getDate() };
		case Ticket:
			Ticket ticket = (Ticket) recordsList.get(rowIndex);
			return new Object[] { ticket.getId(), ticket.getRow(),
					ticket.getPlace(), ticket.getPrice(), ticket.getSeanceId(),
					ticket.getTicketReductionId(), ticket.getReservationId() };
		default:
			return null;
		}
	}
	
	public static String[] getColumnsNames(TableName tableName) {
		switch (tableName) {
		case Movie:
			return new String[] { "id", "tytul", "re¿yser",
					"czas trwania", "rok produkcji", "id gatunku" };
		case MovieType:
			return new String[] { "id", "nazwa", "ograniczenie wiekowe",
					"czas trwania", "rok produkcji", "id gatunku" };
		case Relief:
			return new String[] { "id", "nazwa", "wysokoœæ zni¿ki" };
		case Reservation:
			return new String[] { "id", "id seansu", "rz¹d",
					"miejsce"};
		case Room:
			return new String[] { "id", "ilosc rzêdów", "iloœæ miejsc w rzêdzie"};
		case Seance:
			return new String[] { "id", "id filmu", "id sali",
					"data"};
		case Ticket:
			return new String[] { "id", "rz¹d", "miejsce",
					"cena", "id seansu", "id ulgi", "id rezerwacji" };
		default:
			return new String[]{};
		}
	}
}
