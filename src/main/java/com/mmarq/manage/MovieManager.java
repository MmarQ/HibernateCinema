package com.mmarq.manage;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.mmarq.data.HibernateUtils;
import com.mmarq.data.Movie;

public class MovieManager implements Manager<Movie> {
	private Session session;
	private SessionFactory sessionFactory;

	public MovieManager() {
		sessionFactory = HibernateUtils.getSessionFactory();
	}

	@Override
	public void add(Movie record) {
		session = sessionFactory.openSession();
		session.save(record);
		session.getTransaction().commit();
		session.close();

	}

	@Override
	public void delete(int id) {
		Movie movie = new Movie();
		movie.setId(id);
		session = sessionFactory.openSession();
		session.delete(movie);
		session.close();
	}

	@Override
	public Movie find(int id) {
		session = sessionFactory.openSession();
		Movie movie = (Movie) session.get(Movie.class, id);
		session.close();
		return movie;
	}

	@Override
	public void update(Movie record) {
		session = sessionFactory.openSession();
		session.update(record);
		session.close();
	}

}
