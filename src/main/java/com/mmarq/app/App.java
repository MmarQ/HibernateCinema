package com.mmarq.app;

import org.hibernate.Session;

import com.mmarq.data.HibernateUtils;
import com.mmarq.data.Movie;

public class App {

	public static void main(String[] args) {
		System.out.println("Maven + Hibernate + MySQL");
        Session session = HibernateUtils.getSessionFactory().openSession();
System.out.println("1");
        Movie movie = (Movie) session.get(Movie.class, 2);
System.out.println("2");        
        System.out.println(movie);
	}

}
