package com.hybernates.java.hybernates_java;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class CacheInHiber {



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Student s1=new Student();
		
		Configuration con=new Configuration();
		con.configure();
		con.addAnnotatedClass(Student.class);
		
		SessionFactory factory = con.buildSessionFactory();
		
		Session session1 = factory.openSession();
		//session1.persist(s1);
		session1.beginTransaction();
		session1.getTransaction().commit();
		
		
//		System.out.println("First level cacheing");
//		Object res = session1.get(Student.class, 1);
//		
//		System.out.println("obj1"+res);
//		System.out.println("Second time");
//		Object res1 = session1.get(Student.class, 1);
//		
//		System.out.println("obj2: "+res1);
//		
//		try {
//			Thread.sleep(5000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		session1.evict(res1);
//		System.out.println();
//		System.out.println();
		Session session2 = factory.openSession();
//		System.out.println("econd level cache");
//		
//		Object res11 = session2.get(Student.class, 1);
		
//		System.out.println("obj1"+res11);
//		System.out.println("Second time");
//		Object res12 = session2.get(Student.class, 1);
//		
//		System.out.println("Session2: obj2: "+res12);
		
		Query ab = session2.createQuery("from Student", Student.class);
		//List<Student> list = ab.list();
		//System.out.println(list);
		List list = ab.list();
		Iterator it = list.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	
		
		
		
		

	}

}
