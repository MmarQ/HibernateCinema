package com.mmarq.manage;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.mmarq.data.HibernateUtils;
import com.mmarq.data.Relief;

public class ReliefManager implements Manager<Relief> {
	private Session session;
	private SessionFactory sessionFactory;

	public ReliefManager() {
		sessionFactory = HibernateUtils.getSessionFactory();
	}

	@Override
	public void add(Relief record) {
		session = sessionFactory.openSession();
		session.save(record);
		session.getTransaction().commit();
		session.close();

	}

	@Override
	public void delete(int id) {
		Relief Relief = new Relief();
		Relief.setId(id);
		session = sessionFactory.openSession();
		session.delete(Relief);
		session.close();
	}

	@Override
	public Relief find(int id) {
		session = sessionFactory.openSession();
		Relief Relief = (Relief) session.get(Relief.class, id);
		session.close();
		return Relief;
	}

	@Override
	public void update(Relief record) {
		session = sessionFactory.openSession();
		session.update(record);
		session.close();
	}

}
