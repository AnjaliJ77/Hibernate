package HibernateMapping;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Many2manyMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Many2ManyCourse c= new Many2ManyCourse();
		c.setCname("Java");
		
		Many2ManyCourse c2= new Many2ManyCourse();
		c2.setCname("Devops");
		
		Many2ManyCourse c3= new Many2ManyCourse();
		c3.setCname("Auto");
		
		Many2ManyStudent s=new Many2ManyStudent();
		s.setSname("anj");
		s.setLoc("CRP");
		
		Many2ManyStudent s2=new Many2ManyStudent();
		s2.setSname("MeghJ");
		s2.setLoc("bnglr");
		
		Many2ManyStudent s3=new Many2ManyStudent();
		s3.setSname("Ayu");
		s3.setLoc("CRP");
		
		Set<Many2ManyStudent> java=new HashSet<Many2ManyStudent>();
		java.add(s);
		java.add(s3);
		Set<Many2ManyStudent> Devops=new HashSet<Many2ManyStudent>();
		Devops.add(s2);
		Devops.add(s3);
		
		
		
		Set<Many2ManyStudent> Auto=new HashSet<Many2ManyStudent>();
		Auto.add(s);
		
		Set<Many2ManyCourse> anj= new HashSet<Many2ManyCourse>();
		anj.add(c);
		anj.add(c3);
		
		Set<Many2ManyCourse> MeghJ= new HashSet<Many2ManyCourse>();
		MeghJ.add(c3);
		MeghJ.add(c2);
		
		Set<Many2ManyCourse> Ayu= new HashSet<Many2ManyCourse>();
		Ayu.add(c);
		
		s.setCourse(Ayu);
		s2.setCourse(MeghJ);
		s3.setCourse(anj);
		

		
		
		
		
		Configuration con= new Configuration();
		con.configure();
		con.addAnnotatedClass(Many2ManyCourse.class).addAnnotatedClass(Many2ManyStudent.class);
		
		SessionFactory fact = con.buildSessionFactory();
		Session ses = fact.openSession();
		ses.beginTransaction();
		ses.persist(s);
		ses.persist(s2);
		ses.persist(s3);
		ses.getTransaction().commit();
	}

}
