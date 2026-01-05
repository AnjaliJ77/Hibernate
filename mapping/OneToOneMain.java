package HibernateMapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class OneToOneMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OneToOne_Owner own=new OneToOne_Owner();
		own.setoName("MeghaJ");
		own.setAdd("P.dasapura");
		
		Pet p1=new Pet();
		p1.setCat("Cow");
		p1.setOwner(own);
		
		Configuration con=new Configuration();
		con.configure();
		con.addAnnotatedClass(Pet.class).addAnnotatedClass(OneToOne_Owner.class);
		SessionFactory fact = con.buildSessionFactory();
		Session ses = fact.openSession();
		
		Transaction tra = ses.beginTransaction();
		ses.persist(p1);
		tra.commit();
		
		

	}

}
