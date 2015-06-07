package com.mmarq.manage;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.mmarq.data.HibernateUtils;
import com.mmarq.data.Room;

public class RoomManager implements Manager<Room>{

	private Session session;
	private SessionFactory sessionFactory;

	public RoomManager() {
		sessionFactory = HibernateUtils.getSessionFactory();
	}

	@Override
	public void add(Room record) {
		session = sessionFactory.openSession();
		session.save(record);
		session.getTransaction().commit();
		session.close();

	}

	@Override
	public void delete(int id) {
		Room movie = new Room();
		movie.setId(id);
		session = sessionFactory.openSession();
		session.delete(movie);
		session.close();
	}

	@Override
	public Room find(int id) {
		session = sessionFactory.openSession();
		Room Room = (Room) session.get(Room.class, id);
		session.close();
		return Room;
	}

	@Override
	public void update(Room record) {
		session = sessionFactory.openSession();
		session.update(record);
		session.close();
	}
}
