package com.hybernates.java.hybernates_java;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import org.hibernate.query.criteria.HibernateCriteriaBuilder;
import org.hibernate.query.criteria.JpaCriteriaQuery;
import org.hibernate.query.criteria.JpaCriteriaUpdate;
import org.hibernate.query.criteria.JpaRoot;

import jakarta.transaction.Transaction;

public class CriteriaHibernate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		CriteriaEmp c1=new CriteriaEmp();
		c1.setId(3);
		c1.setName("Ayu");
		c1.setLocation("Dspr");
		Configuration con=new Configuration();
		con.configure();
		con.addAnnotatedClass(CriteriaEmp.class);
		
		SessionFactory fact = con.buildSessionFactory();
		Session session = fact.openSession();
		
		
		//session.persist(c1);
		session.beginTransaction();
		
	    session.getTransaction().commit();
	    
//	   Query qu = session.createQuery("from CriteriaEmp");
//	   List<CriteriaEmp> list = qu.list();
//	   Iterator<CriteriaEmp> it = list.iterator();
//	   while(it.hasNext()) {
//		   System.out.println(it.next());
//	   }
//		
// in SQL how where condition works the same way criteria will work 
	    
	    System.out.println("Criteria ");
	    HibernateCriteriaBuilder cri = session.getCriteriaBuilder();
	   JpaCriteriaQuery<CriteriaEmp> create = cri.createQuery(CriteriaEmp.class);
	   JpaRoot<CriteriaEmp> root = create.from(CriteriaEmp.class);
	   System.out.println("namee=ayu");
	   create.select(root).where(cri.equal(root.get("name"),"Ayu" ));
	   List<CriteriaEmp> list = session.createQuery(create).getResultList();
	   System.out.println(list);
	   System.out.println();
	   System.out.println("like query");
	   create.select(root).where(cri.like(root.get("name"), "%a"));
	   List<CriteriaEmp> list1 = session.createQuery(create).getResultList();
	   System.out.println(list1);
	   
	   
	}

}
