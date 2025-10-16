package controller;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import entity.Employee;

public class Controller {
		public static void main(String[] args) {
			Configuration config = new Configuration().configure("hibernate.cfg.xml");
			SessionFactory sf = config.buildSessionFactory();
			Session session = sf.openSession();

			Employee emp = new Employee();
			emp.setEid(102);
			emp.seteName("XYZ");

			session.save(emp);

			session.beginTransaction().commit();
			System.out.println("Employee Saved");

		}
}
