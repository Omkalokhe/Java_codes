package controller;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import config.HibrenateConfig;
import entity.Student;

public class Controller {
	
	public static void main(String[] args) {
		
		SessionFactory sf=HibrenateConfig.getSessionFactory();
		 Session s=sf.openSession();
		
		
		Student obj=new Student();
		obj.setSid(102);
		obj.setsName("Dipa");
		
		s.save(obj);
		s.beginTransaction().commit();
		System.out.println("Student Save");
	}

}
