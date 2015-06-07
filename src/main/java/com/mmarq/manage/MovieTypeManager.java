package com.mmarq.manage;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.mmarq.data.HibernateUtils;
import com.mmarq.data.MovieType;

public class MovieTypeManager implements Manager<MovieType> {

	private Session session;
	private SessionFactory sessionFactory;

	public MovieTypeManager() {
		sessionFactory = HibernateUtils.getSessionFactory();
	}

	@Override
	public void add(MovieType record) {
		session = sessionFactory.openSession();
		session.save(record);
		session.getTransaction().commit();
		session.close();

	}

	@Override
	public void delete(int id) {
		MovieType movie = new MovieType();
		movie.setId(id);
		session = sessionFactory.openSession();
		session.delete(movie);
		session.close();
	}

	@Override
	public MovieType find(int id) {
		session = sessionFactory.openSession();
		MovieType movieType = (MovieType) session.get(MovieType.class, id);
		session.close();
		return movieType;
	}

	@Override
	public void update(MovieType record) {
		session = sessionFactory.openSession();
		session.update(record);
		session.close();
	}
}
