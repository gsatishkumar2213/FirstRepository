package com.sidgs.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Application {

	public static void main(String[] args) {
		Student s = new Student();
		s.setName("satish");
		NewStudent ns = new NewStudent();
		ns.setName("gun");
		ns.setFees(5000);
		ns.setNoDis("10");
		OldStudent os = new OldStudent();
		os.setName("shiv");
		os.setJob("no job");
		os.setDis(25);
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		Transaction t = session.beginTransaction();
		session.save(s);
		session.save(ns);
		session.save(os);
		t.commit();
		session.close();
		System.out.println("success");

	}

}
