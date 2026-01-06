package Hibernate_Inheritance;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class VehicleMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car1=new Car();
		car1.setBrand("Tata");
		car1.setFuelType("disel");
		
		Bike bike=new Bike();
		bike.setBrand("yamaha");
		bike.setClr("Black");
		bike.setModel(19);
		
		
		Configuration con= new Configuration();
		con.configure();
		con.addAnnotatedClass(Vehicle.class).addAnnotatedClass(Bike.class).addAnnotatedClass(Car.class);
		
		SessionFactory fact = con.buildSessionFactory();
		Session session = fact.openSession();
		session.beginTransaction();
		session.persist(car1);
		session.persist(bike);
		session.beginTransaction().commit();
		
		

	}

}
