package com.mmarq.manage;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.mmarq.data.HibernateUtils;
import com.mmarq.data.Ticket;

public class TicketManager implements Manager<Ticket>{

	private Session session;
	private SessionFactory sessionFactory;

	public TicketManager() {
		sessionFactory = HibernateUtils.getSessionFactory();
	}

	@Override
	public void add(Ticket record) {
		session = sessionFactory.openSession();
		session.save(record);
		session.getTransaction().commit();
		session.close();

	}

	@Override
	public void delete(int id) {
		Ticket movie = new Ticket();
		movie.setId(id);
		session = sessionFactory.openSession();
		session.delete(movie);
		session.close();
	}

	@Override
	public Ticket find(int id) {
		session = sessionFactory.openSession();
		Ticket Ticket = (Ticket) session.get(Ticket.class, id);
		session.close();
		return Ticket;
	}

	@Override
	public void update(Ticket record) {
		session = sessionFactory.openSession();
		session.update(record);
		session.close();
	}
}
