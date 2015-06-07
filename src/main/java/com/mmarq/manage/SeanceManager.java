package com.mmarq.manage;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.mmarq.data.HibernateUtils;
import com.mmarq.data.Seance;

public class SeanceManager implements Manager<Seance>{

	private Session session;
	private SessionFactory sessionFactory;

	public SeanceManager() {
		sessionFactory = HibernateUtils.getSessionFactory();
	}

	@Override
	public void add(Seance record) {
		session = sessionFactory.openSession();
		session.save(record);
		session.getTransaction().commit();
		session.close();

	}

	@Override
	public void delete(int id) {
		Seance movie = new Seance();
		movie.setId(id);
		session = sessionFactory.openSession();
		session.delete(movie);
		session.close();
	}

	@Override
	public Seance find(int id) {
		session = sessionFactory.openSession();
		Seance Seance = (Seance) session.get(Seance.class, id);
		session.close();
		return Seance;
	}

	@Override
	public void update(Seance record) {
		session = sessionFactory.openSession();
		session.update(record);
		session.close();
	}
}
