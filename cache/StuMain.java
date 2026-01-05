package com.hybernates.java.hybernates_java;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import org.hibernate.query.criteria.HibernateCriteriaBuilder;
import org.hibernate.query.criteria.JpaCriteriaQuery;
import org.hibernate.query.criteria.JpaRoot;

import jakarta.transaction.Transaction;

public class StuMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s1=new Student();
		
//		//s1.setSid(3);
//		s1.setSname("ChampuuuJ");
//		s1.setFeese(100000);
		
		
		
		Configuration con=new Configuration();
		con.configure();
		con.addAnnotatedClass(Student.class);
		
		SessionFactory factory=con.buildSessionFactory();
		
		Session ses= factory.openSession();
		ses.beginTransaction();
		ses.merge(s1);
		
		//ses.persist(s1);
		ses.getTransaction().commit();
		
		
		
//		System.out.println("Fetching data");
//		
//		Configuration con=new Configuration();
//		con.configure();
//		con.addAnnotatedClass(Student.class);
//		
//		SessionFactory factory=con.buildSessionFactory();
//		
//		Session ses= factory.openSession();
//		Student a1 = ses.byId(Student.class).getReference(1);     // lazy fetching 
//		System.out.println(a1);
//		
//		System.out.println();
//		Student a2 = ses.find(Student.class, 02);    // eager fetching 
//		
//		System.out.println(a2);
//		
//		
//		org.hibernate.Transaction tra = ses.beginTransaction();     // Transaction is not mandatory for fetching data.
//		
//		//ses.merge(s1);
//		tra.commit();
//		
//		System.out.println("after merging");
//		System.out.println(a2);
//		
//		System.out.println("deleting operation");
//		
//		Student delete = ses.find(Student.class, 3);
//		ses.remove(delete);
//		tra.commit();
//		System.out.println(" deleting......");
//		//System.out.println(delete);
		
		
		
		
		
//		System.out.println("cachezzzzz****************");
//		
//		Student res = ses.get(Student.class, 2);
//		System.out.println(res);
		
		
//		System.out.println("Using Createquery method");
//		
//		Query<Student> query = ses.createQuery("from Student", Student.class);
//		List<Student> list = query.list();
//		Iterator<Student> it = list.iterator();
//		while(it.hasNext()) {
//			Student val = it.next();
//			//System.out.println(val);
//			System.out.println("Id "+val.getSid()+"  Sname:"+val.getSname()+"  feese:"+ val.getFeese());
//		}
		
		
		
//		System.out.println("partial data");
//		Query stude = ses.createQuery("select s1.sname, s1.feese from Student s1");
//		List<Student> list1 = stude.list();
//		Iterator<Student> it1 = list1.iterator();
//		while(it1.hasNext()) {
//			//System.out.println(it1.next());
//		}
		
		
		System.out.println("criteria");
		HibernateCriteriaBuilder criteria = ses.getCriteriaBuilder();
		JpaCriteriaQuery<Student> query = criteria.createQuery(Student.class);
		JpaRoot<Student> root = query.from(Student.class);
		query.select(root).where(criteria.gt(root.get("feese"), 50000));
		
		List<Student> list = ses.createQuery(query).getResultList();
		
		Iterator<Student> it = list.iterator();
		while(it.hasNext()) {
			Student val = it.next();
			System.out.println("id:"+val.getSid()+"  name:"+val.getSname()+"  feese:"+val.getFeese());
		}
		
		
		
		
		
	

	}

}
