package com.eralpnitelik.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.eralpnitelik.entity.DatabaseEntity;

public class HibernateUtil {
	private static final SessionFactory sessionFactory = sessionFactory();

	private static SessionFactory sessionFactory() {
		SessionFactory factory = null;
		try {
			Configuration configuration = new Configuration();

			// Register your classes here!
			configuration.addAnnotatedClass(DatabaseEntity.class);

			factory = configuration.configure("hibernate.cfg.xml").buildSessionFactory();
			System.out.println("Success!");
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		return factory;
	}

	public static SessionFactory getSessionfactory() {
		return sessionFactory;
	}
}
