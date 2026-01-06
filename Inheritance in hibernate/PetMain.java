package Hibernate_Inheritance;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class PetMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Configuration con= new Configuration();
		con.configure();
		con.addAnnotatedClass(Pet.class).addAnnotatedClass(Dog.class).addAnnotatedClass(Cow.class);
		
		SessionFactory fact = con.buildSessionFactory();
		Session session = fact.openSession();
		session.beginTransaction();
		
		Dog dog=new Dog();
		dog.setPname("Doggy");
		dog.setLoc("P.dasapura");
		dog.setAge(5);
		dog.setBreed("Bull");
		session.persist(dog);
		
		Cow cow=new Cow();
		cow.setPname("Gowri");
		cow.setClr("Black");
		cow.setLoc("CRP");
		cow.setChild(true);
		session.persist(cow);
		
		session.beginTransaction().commit();

	}

}
