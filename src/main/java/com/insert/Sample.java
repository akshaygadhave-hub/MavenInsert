package com.insert;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Sample {

	public static void main(String[] args) {

		// step-1
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		// step-2
		@SuppressWarnings("deprecation")
		SessionFactory sf = configuration.buildSessionFactory();

		// step-3
		Session s = sf.openSession();

		// step-4
		Transaction t = s.beginTransaction();

		// How to set the value into student object
		Student student = new Student();
		student.setName("Dhoni");
		student.setCity("Chennai");
		s.save(student); // save()- insert query fire
		t.commit(); // without this, we cant save the data into db
		System.out.println("nikhil 007");
		
	}

}
