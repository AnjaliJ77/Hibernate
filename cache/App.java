package com.hybernates.java.hybernates_java;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
  
    	
        //System.out.println( "Hello World!" );
    	// To use session factory we need to create a configuration
    	
    	
    	Configuration conf=new Configuration();
    	conf.configure("hibernate.cfg.xml");
    	conf.addAnnotatedClass(emptable.class);
    	
    	
    	// to create session we need session Factory
    	SessionFactory fact=conf.buildSessionFactory();
    	
    	// 
    	Session session = fact.openSession();
    	
    	emptable e1=new emptable();
    	e1.setEmpid(2);
    	e1.setEmpName("MeghuJ");
    	e1.setDep("HR");
    	e1.setSal(200000);
    	
    	
    	session.beginTransaction();
    	
    	session.persist(e1);
    	
    	session.getTransaction().commit();
    	
    	System.out.println("DB....");
    	
    	
    }
}
