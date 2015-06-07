package com.mmarq.manage;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.mmarq.data.HibernateUtils;
import com.mmarq.data.Reservation;

public class ReservationManager implements Manager<Reservation>{

	private Session session;
	private SessionFactory sessionFactory;

	public ReservationManager() {
		sessionFactory = HibernateUtils.getSessionFactory();
	}

	@Override
	public void add(Reservation record) {
		session = sessionFactory.openSession();
		session.save(record);
		session.getTransaction().commit();
		session.close();

	}

	@Override
	public void delete(int id) {
		Reservation movie = new Reservation();
		movie.setId(id);
		session = sessionFactory.openSession();
		session.delete(movie);
		session.close();
	}

	@Override
	public Reservation find(int id) {
		session = sessionFactory.openSession();
		Reservation Reservation = (Reservation) session.get(Reservation.class, id);
		session.close();
		return Reservation;
	}

	@Override
	public void update(Reservation record) {
		session = sessionFactory.openSession();
		session.update(record);
		session.close();
	}
}
